package com.ztesoft.zsmart.zcm.gray.engine.dubbo.model;

/**
 * @author kongyunhui on 2018/8/15.
 *
 * 保存灰度标识的上下文线程变量
 */
public class GrayContextHolder {
    private static final ThreadLocal<Gray> contextHolder = new ThreadLocal<Gray>();

    public static Gray getContextHolder(){
        return contextHolder.get();
    }

    public static void setContextHolder(Gray gray){
        contextHolder.set(gray);
    }

    public static void removeContextHolder(){
        contextHolder.remove();
    }
}
