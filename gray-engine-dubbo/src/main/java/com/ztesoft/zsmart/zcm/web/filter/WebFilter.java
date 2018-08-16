package com.ztesoft.zsmart.zcm.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ztesoft.zsmart.zcm.gray.engine.dubbo.model.Gray;
import com.ztesoft.zsmart.zcm.gray.engine.dubbo.context.GrayContextHolder;

/**
 * @author kongyunhui on 2018/8/15.
 *
 * 从httphead中获取灰度标识，写入线程上下文，并在filter销毁时候销毁上下文
 */
public class WebFilter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println(">>>在请求处理之前进行调用（Controller方法调用之前）");
        String gray_flag = httpServletRequest.getHeader("gray");
        GrayContextHolder.setContextHolder(new Gray(gray_flag));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println(">>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
        GrayContextHolder.removeContextHolder();
    }
}
