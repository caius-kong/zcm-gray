package com.ztesoft.zsmart.zcm.gray.engine.dubbo.cluster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.StringUtils;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import com.google.common.collect.Lists;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.Gray;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.GrayContextHolder;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.GrayDataCache;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.GrayRuleOnGraying;

/**
 * AbstractLoadBalance
 *
 * @author kongyunhui at 2018/07/19
 */
public abstract class AbstractLoadBalance implements LoadBalance {
    private static final Logger logger = LogManager.getLogger(AbstractLoadBalance.class);

    /**
     * 灰度标识
     */
    public static final String GRAY_KEY_FROM_CG = "clientIP";
    public static final String GRAY_KEY_FROM_GATEWAY = "appId";

    /**
     * 灰度入口，对应gray_bootstrap表的name字段。如要修改，请保持同步。
     */
    private static final String BOOTSTRAP_CG = "CG";
    private static final String BOOTSTRAP_GW = "API Gateway";

    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        if (invokers == null || invokers.size() == 0) {
            return null;
        }
        if (invokers.size() == 1) {
            return invokers.get(0);
        }

        List<Invoker<T>> realInvokers = invokers;
        try {
            // 如果灰度节点为空，则直接返回
//            Set<String> grayHostList = GrayDataCache.getInstance().getGrayHostList();
//            List<Invoker<T>> grayInvokers = invokers.stream().filter((invoker) -> grayHostList.contains(invoker.getUrl().getHost())).collect(Collectors.toList());
            Set<String> grayHostList = new HashSet<>(Lists.newArrayList("10.45.16.110:20882", "10.45.16.110:20883"));
            List<Invoker<T>> grayInvokers = invokers.stream().filter((invoker) -> grayHostList.contains(invoker.getUrl().getAddress())).collect(Collectors.toList());
            if (CollectionUtils.isEmpty(grayInvokers)) {
                return doSelect(invokers, url, invocation);
            }
            // 默认非灰节点
            realInvokers = (List<Invoker<T>>) CollectionUtils.subtract(invokers, grayInvokers);
            // 判断是否灰度
            //1.nginx-lua过来的请求，httphead拥有灰度标识，webFilter会将其写入线程上下文，因此我们优先从线程上下文获取灰度标识
            //2.非nginx-lua过来的请求，再判断隐式参数是否已有灰度标识、CG入口、GW入口
            RpcContext context = RpcContext.getContext();
            if (Gray.GRAY_YES.equalsIgnoreCase(GrayContextHolder.getContextHolder().getValue())
                    || Gray.GRAY_YES.equalsIgnoreCase(context.getAttachment(Gray.GRAY_FLAG))
                    || isGray(BOOTSTRAP_CG, context.getAttachment(GRAY_KEY_FROM_CG))
                    || isGray(BOOTSTRAP_GW, context.getAttachment(GRAY_KEY_FROM_GATEWAY))) {
                context.setAttachment(Gray.GRAY_FLAG, Gray.GRAY_YES);
                realInvokers = grayInvokers;
            }
            // 其他情况走非灰节点
            else {
                context.setAttachment(Gray.GRAY_FLAG, Gray.GRAY_NO);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), "DUBBO灰度引擎异常");
        }
        return doSelect(realInvokers, url, invocation);
    }

    /**
     * 判断是否灰度
     *
     * @param bootStrap
     * @param ruleValue
     * @return
     */
    private boolean isGray(String bootStrap, String ruleValue) throws Exception {
        List<GrayRuleOnGraying> grayRuleOnGrayingList = GrayDataCache.getInstance().getGrayRuleOnGrayingList();
        GrayRuleOnGraying grayRuleOnGraying = grayRuleOnGrayingList.stream().filter((o) ->
                o.getBootstrapName().equals(bootStrap) && Arrays.asList(o.getRuleValue().split(",")).contains(ruleValue))
                .findFirst().get();
        return grayRuleOnGraying != null;
    }

    protected abstract <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation);

    protected int getWeight(Invoker<?> invoker, Invocation invocation) {
        int weight = invoker.getUrl().getMethodParameter(invocation.getMethodName(), Constants.WEIGHT_KEY, Constants.DEFAULT_WEIGHT);
        if (weight > 0) {
            long timestamp = invoker.getUrl().getParameter(Constants.TIMESTAMP_KEY, 0L);
            if (timestamp > 0L) {
                int uptime = (int) (System.currentTimeMillis() - timestamp);
                int warmup = invoker.getUrl().getParameter(Constants.WARMUP_KEY, Constants.DEFAULT_WARMUP);
                if (uptime > 0 && uptime < warmup) {
                    weight = calculateWarmupWeight(uptime, warmup, weight);
                }
            }
        }
        return weight;
    }

    static int calculateWarmupWeight(int uptime, int warmup, int weight) {
        int ww = (int) ((float) uptime / ((float) warmup / (float) weight));
        return ww < 1 ? 1 : (ww > weight ? weight : ww);
    }
}