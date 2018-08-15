package com.kyh.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kongyunhui on 2018/7/20.
 */

@SpringBootApplication
@ImportResource("classpath:dubbo-app1.xml")
@ComponentScan({"com.kyh.test1", "com.ztesoft.zsmart.zcm.web.filter"})
public class App1 {
    public static void main(String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication.run(App1.class, args);
    }
}

