package com.ztesoft.zsmart.zcm.gray.engine.dubbo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.GrayDataCache;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.GrayRuleOnGraying;

/**
 * @author kongyunhui at 2018/07/24
 */
public class GrayConfigAgent implements ApplicationListener<ContextRefreshedEvent> {

    private Logger logger = LogManager.getLogger(getClass());

    private String grayServer = "http://127.0.0.1:8080/";
    private String applicationServer = "http://127.0.0.1:8080/";
    private AtomicInteger syncFalg = new AtomicInteger(0);

    public void setGrayServer(String grayServer) {
        this.grayServer = grayServer;
    }

    public void setApplicationServer(String applicationServer) {
        this.applicationServer = applicationServer;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent cre) {
        //启动时拉取配置
        watchGrayConfig();
        //定时拉取配置
        startTimer();
    }

    //定时拉取配置
    private void startTimer() {
        Timer watchTimer = new Timer();
        watchTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (syncFalg.get() == 0) {
                    syncFalg.getAndSet(1);
                    try {
                        watchGrayConfig();
                    } catch (Exception e) {
                        logger.error("加载灰度服务端配置数据异常", e);
                    }
                    syncFalg.getAndSet(0);
                }
            }
        }, 10, 1000 * 10);
    }

    /**
     * 拉取最新配置
     */
    private void watchGrayConfig() {
        try {
            updateGrayHostList();
            updateGrayRuleListOnGraying();
        } catch (Exception e) {
            logger.error(e.getMessage(), "拉取灰度数据失败！");
        }
    }

    /**
     * 更新灰度机列表
     *
     * @throws Exception
     */
    private void updateGrayHostList() throws Exception {
        //获取正在进行中的灰度应用ID
        ParameterizedTypeReference<List<Long>> typeRef = new ParameterizedTypeReference<List<Long>>() {
        };
        ResponseEntity<List<Long>> responseEntity = restTemplateInstance().exchange(grayServer + "grayapplication/qryAppIdListOnGraying", HttpMethod.GET, null, typeRef);
        List<Long> appIds = responseEntity.getBody();
        if (!CollectionUtils.isEmpty(appIds)) {
            Set<String> grayHostList = new HashSet<>();
            for (Long appId : appIds) {
                //获取该应用的实例列表
                List<Object> appInstances = restTemplateInstance().getForObject(applicationServer + "applications/" + appId + "/instances", List.class);
                if (!CollectionUtils.isEmpty(appInstances)) {
                    List<String> containerIPs = appInstances.stream().map((ins) -> JSON.parseObject(com.alibaba.fastjson.JSON.toJSONString(ins)).getString("containerIP")).collect(Collectors.toList());
                    grayHostList.addAll(containerIPs);
                }
            }
            //更新
            GrayDataCache.getInstance().setGrayHostList(grayHostList);
        }
    }

    private void updateGrayRuleListOnGraying() throws Exception {
        //获取正在进行中的灰度规则信息
        ParameterizedTypeReference<List<GrayRuleOnGraying>> typeRef = new ParameterizedTypeReference<List<GrayRuleOnGraying>>() {
        };
        ResponseEntity<List<GrayRuleOnGraying>> responseEntity = restTemplateInstance().exchange(grayServer + "grayrule/qryGrayRuleListOnGraying", HttpMethod.GET, null, typeRef);
        List<GrayRuleOnGraying> grayRuleListOnGraying = responseEntity.getBody();
        //更新
        GrayDataCache.getInstance().setGrayRuleOnGrayingList(grayRuleListOnGraying);
    }

    /**
     * 获取RestTemplate实例
     *
     * @return
     */
    private RestTemplate restTemplateInstance() {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(20000);
        requestFactory.setReadTimeout(20000);
        restTemplate.setRequestFactory(requestFactory);
        return restTemplate;
    }
}