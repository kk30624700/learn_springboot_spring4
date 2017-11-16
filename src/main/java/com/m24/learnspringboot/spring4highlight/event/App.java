package com.m24.learnspringboot.spring4highlight.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext();
		 context.getEnvironment().setActiveProfiles("dev");
		 context.register(Config.class);
		 context.refresh();
		 
		 System.out.println(context.getBean(DemoBean.class).getMsg());
		 context.close();
    }
}
