package com.kyh.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kongyunhui on 2018/7/20.
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-app2.xml")
@ComponentScan({"com.kyh.test2", "com.ztesoft.zsmart.zcm.gray.engine.web.filter"})
public class App2 {
    public static void main(String[] args) {
        System.setProperty("server.port", "8082");
        SpringApplication.run(App2.class, args);
    }
}
