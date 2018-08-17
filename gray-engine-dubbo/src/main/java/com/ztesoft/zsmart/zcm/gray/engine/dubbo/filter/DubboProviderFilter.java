package com.ztesoft.zsmart.zcm.gray.engine.dubbo.filter;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.Gray;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.context.GrayContextHolder;

/**
 * @author kongyunhui on 2018/8/15.
 */
public class DubboProviderFilter implements Filter{
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        // 将dubbo上下文中灰度标识写入线程上下文
        String gray_flag = RpcContext.getContext().getAttachment(Gray.GRAY_FLAG);
//        GrayContextHolder.setContextHolder(new Gray(gray_flag));
        return invoker.invoke(invocation);
    }
}
