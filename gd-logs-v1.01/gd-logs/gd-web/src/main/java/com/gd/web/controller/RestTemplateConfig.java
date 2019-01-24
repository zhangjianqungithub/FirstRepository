package com.gd.web.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class RestTemplateConfig {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule() {
		
		//轮询策略
		return new RoundRobinRule();
		//随机策略
		//return new RandomRule();
		//首先会过滤掉故障机或者并发链接数超过阈值的服务器.剩余的机器轮询配置
		//return new AvailabilityFilteringRule();
		//服务器影响时间越快,则权重越高
		//return new WeightedResponseTimeRule();
		//最大可用策略，即先过滤出故障服务器后，选择一个当前并发请求数最小的;
		//return new BestAvailableRule();          
	}
}
