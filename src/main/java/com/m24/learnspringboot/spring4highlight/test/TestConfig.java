package com.m24.learnspringboot.spring4highlight.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
public class TestConfig {
	@Bean
	@Profile("dev")
	public TestBean devTestBean() {
		return new TestBean("from development profile");
	}

	@Bean
	@Profile("qa")
	public TestBean prodTestBean() {
		return new TestBean("from production profile");
	}

}
