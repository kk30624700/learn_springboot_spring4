package com.m24.learnspringboot.spring4highlight.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	@Autowired
	FunctionRepository repository;
	
	public String sayHello() {
		return repository.sayHello("world");
	}
}
