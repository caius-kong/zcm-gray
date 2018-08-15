package com.ztesoft.zsmart.zcm.web.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author kongyunhui on 2018/8/15.
 */
@Configuration
public class WebFilterConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebFilter()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
