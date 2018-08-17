package com.kyh.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kongyunhui on 2018/7/20.
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-app3.xml")
@ComponentScan({"com.kyh.test3", "com.ztesoft.zsmart.zcm.gray.engine.web.filter"})
public class App3 {
    public static void main(String[] args) {
        System.setProperty("server.port", "8084");
        SpringApplication.run(App3.class, args);
    }
}
