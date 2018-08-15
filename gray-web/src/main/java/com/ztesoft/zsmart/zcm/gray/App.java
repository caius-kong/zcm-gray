package com.ztesoft.zsmart.zcm.gray;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.ztesoft.zsmart.core.jdbc.mybatis.CoreSqlSessionFactoryBean;

@SpringBootApplication
@MapperScan(basePackages = "com.ztesoft.zsmart.zcm.gray.mapper")
public class App {
    @Bean("sqlSessionFactoryBean")
    public SqlSessionFactoryBean coreSqlSessionFactoryBean(DataSource dataSource) {
        CoreSqlSessionFactoryBean sqlSessionFactoryBean = new CoreSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(20000);
        requestFactory.setReadTimeout(20000);
        restTemplate.setRequestFactory(requestFactory);
        return restTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
