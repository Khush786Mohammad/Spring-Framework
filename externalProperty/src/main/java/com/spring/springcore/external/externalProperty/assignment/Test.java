package com.spring.springcore.external.externalProperty.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/external/externalProperty/assignment/config.xml");
		MyDAO dao = (MyDAO) ctx.getBean("url");
		MyDAO username = (MyDAO) ctx.getBean("username");
		System.out.println(dao+ " "+username);
		ctx.registerShutdownHook();
	}
}
