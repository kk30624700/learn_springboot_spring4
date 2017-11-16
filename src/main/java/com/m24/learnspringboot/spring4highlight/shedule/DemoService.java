package com.m24.learnspringboot.spring4highlight.shedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Scheduled(fixedRate=1000)
	public void currentTimeMillis() {
		System.out.println(System.currentTimeMillis());
	}
}
