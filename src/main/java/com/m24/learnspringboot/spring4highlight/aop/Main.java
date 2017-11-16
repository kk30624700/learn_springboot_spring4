package com.m24.learnspringboot.spring4highlight.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		context.getBean(DemoMethodService.class).add();
		context.close();
	}
}
