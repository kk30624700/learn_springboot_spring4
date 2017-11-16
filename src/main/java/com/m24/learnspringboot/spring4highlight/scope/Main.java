package com.m24.learnspringboot.spring4highlight.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println(context.getBean(SingletonDemo.class)==context.getBean(SingletonDemo.class));
		System.out.println(context.getBean(PrototypeDemo.class)==context.getBean(PrototypeDemo.class));
		context.close();
	}
}
