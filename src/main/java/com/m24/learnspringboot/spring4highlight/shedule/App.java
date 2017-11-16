package com.m24.learnspringboot.spring4highlight.shedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(Config.class);
		 context.getBean(DemoService.class).currentTimeMillis();
		 context.close();
    }
}
