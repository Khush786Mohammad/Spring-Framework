package com.demo.spring.springcore.dependencycheck.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/dependencycheck/assignment/config.xml");
		University uni = (University) ctx.getBean("university");
		System.out.println(uni);
		ctx.registerShutdownHook();
	}

}
