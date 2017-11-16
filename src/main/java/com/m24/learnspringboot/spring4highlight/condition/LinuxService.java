package com.m24.learnspringboot.spring4highlight.condition;

public class LinuxService implements Service {
	public void currentTimeMillis() {
		System.out.println("LinuxService" + System.currentTimeMillis());
	}
}
