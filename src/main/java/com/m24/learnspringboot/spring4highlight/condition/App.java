package com.m24.learnspringboot.spring4highlight.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(Config.class);
		 context.getBean(Service.class).currentTimeMillis();
		 context.close();
    }
}
