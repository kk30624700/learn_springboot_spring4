package com.m24.learnspringboot.spring4highlight.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		System.out.println(context.getBean(FunctionService.class).sayHello());
		context.close();
	}
}
