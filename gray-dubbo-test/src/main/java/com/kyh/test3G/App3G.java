package com.kyh.test3G;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kongyunhui on 2018/7/20.
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-app3G.xml")
@ComponentScan({"com.kyh.test3G", "com.ztesoft.zsmart.zcm.web.filter"})
public class App3G {
    public static void main(String[] args) {
        System.setProperty("server.port", "8084");
        SpringApplication.run(App3G.class, args);
    }
}
