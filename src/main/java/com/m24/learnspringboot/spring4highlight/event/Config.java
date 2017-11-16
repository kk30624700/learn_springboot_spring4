package com.m24.learnspringboot.spring4highlight.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ComponentScan
@Configuration
public class Config {
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("dev");
	}
	@Bean
	@Profile("qa")
	public DemoBean qaDemoBean() {
		return new DemoBean("qa");
	}
}
