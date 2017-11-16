package com.m24.learnspringboot.spring4highlight.prepost;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Async
	public void sayHello(String msg) {
		System.out.println(msg + ": hello");
	}
}
