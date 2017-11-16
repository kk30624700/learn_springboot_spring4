package com.m24.learnspringboot.spring4highlight.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(Config.class);
		 
		 Config resourceService = context.getBean(Config.class);
		 
		 resourceService.outputResource();
		 
		 context.close();
    }
}
