package com.m24.learnspringboot.spring4highlight.taskexecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Config {
	@Bean(initMethod="init", destroyMethod="destroy")
	public DemoService demoService() {
		return new DemoService();
	}
}
