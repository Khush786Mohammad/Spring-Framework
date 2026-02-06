package com.spring.springcore.external.externalProperty;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/external/externalProperty/config.xml");
		SpringDAO dao = (SpringDAO) ctx.getBean("dao");
		System.out.println(dao);
		ctx.registerShutdownHook();
	}
}
