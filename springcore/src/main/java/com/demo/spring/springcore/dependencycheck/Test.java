package com.demo.spring.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/dependencycheck/config.xml");
		Prescription pres = (Prescription) ctx.getBean("prescription");
		System.out.println(pres);
	}
}
