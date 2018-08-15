package com.kyh.test2G;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kongyunhui on 2018/7/20.
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-app2G.xml")
@ComponentScan({"com.kyh.test2G", "com.ztesoft.zsmart.zcm.web.filter"})
public class App2G {
    public static void main(String[] args) {
        System.setProperty("server.port", "8083");
        SpringApplication.run(App2G.class, args);
    }
}
