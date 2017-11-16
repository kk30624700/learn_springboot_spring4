package com.m24.learnspringboot.spring4highlight.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(Config.class);
		 DemoService service = context.getBean(DemoService.class);
		 for (int i=0; i<3; i++)
			 for (int j=0; j<10; j++)
				 service.sayHello(i+"");
		 context.close();
    }
}
