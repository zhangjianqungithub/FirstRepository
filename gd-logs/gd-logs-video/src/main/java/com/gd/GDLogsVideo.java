package com.gd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//为Mapper文件生成代理对象
@MapperScan("com.gd.logsvideo.mapper")
// 将服务注册到eureka中
//@EnableEurekaClient
//开启断路器机制
//@EnableHystrix
public class GDLogsVideo {

	public static void main(String[] args) {
		SpringApplication.run(GDLogsVideo.class, args);
	}
}
