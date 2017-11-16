package com.m24.learnspringboot.spring4highlight.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	@Pointcut("execution(* com.m24.learn_springboot.spring4highlight.aop.DemoMethodService.*(..))")
	public void myExecution() {}
	
	@Before("myExecution()")
	public void before(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName());
	}
}
