package com.gd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients    //添加feign的支持
public class GDWeb {

    public static void main(String[] args) {
        SpringApplication.run(GDWeb.class, args);
    }
}
