package com.gd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//为Mapper文件生成代理对象
@MapperScan("com.gd.logsuser.mapper")
// 将服务注册到eureka中
@EnableEurekaClient
//开启断路器机制
//@EnableHystrix
public class GDLogsUser {

	public static void main(String[] args) {
		SpringApplication.run(GDLogsUser.class, args);
	}
}
