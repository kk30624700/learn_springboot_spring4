package com.m24.learnspringboot.spring4highlight.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
@ActiveProfiles("qa")
public class Main {
	@Autowired
	private TestBean testBean;
	
	@Test
	public void test() {
		Assert.assertEquals("qa", testBean.getContent());
	}
}
