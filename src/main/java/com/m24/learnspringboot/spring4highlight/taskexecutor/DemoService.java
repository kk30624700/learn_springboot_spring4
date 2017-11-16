package com.m24.learnspringboot.spring4highlight.taskexecutor;

public class DemoService {
	public void init() {
		System.out.println("@Bean-init-method");
	}

	public DemoService() {
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}

	public void destroy() {
		System.out.println("@Bean-destory-method");
	}
}
