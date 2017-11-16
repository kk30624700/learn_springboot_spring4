package com.m24.learnspringboot.spring4highlight.profile;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		System.out.println("receive from: " + event.getSource() + event.getMsg());
	}

}
