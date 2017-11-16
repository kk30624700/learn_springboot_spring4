package com.m24.learnspringboot.spring4highlight.di;

import org.springframework.stereotype.Repository;

@Repository
public class FunctionRepository {
	public String sayHello(String word) {
		return "hello " + word; 
	}
}
