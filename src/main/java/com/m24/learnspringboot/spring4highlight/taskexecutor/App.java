package com.m24.learnspringboot.spring4highlight.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(Config.class);
		 System.out.println(context.getBean("demoService"));
		 context.close();
    }
}
