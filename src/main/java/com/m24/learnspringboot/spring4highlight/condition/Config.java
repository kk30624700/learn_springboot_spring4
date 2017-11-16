package com.m24.learnspringboot.spring4highlight.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan
@Configuration
@EnableScheduling
public class Config {
	@Bean
	@Conditional(WindowsCondition.class)
	public Service windowsService() {
		return new WindowsService();
	}
	@Bean
	@Conditional(LinuxCondition.class)
	public Service linuxService() {
		return new LinuxService();
	}
}
