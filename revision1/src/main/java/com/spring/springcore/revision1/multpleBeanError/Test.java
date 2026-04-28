package com.spring.springcore.revision1.multpleBeanError;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/revision1/multpleBeanError/config.xml");
		Computer c1 = (Computer) ctx.getBean("com");
		System.out.println(c1);
		
		Processor p1 = (Processor) ctx.getBean("pro");
		System.out.println(p1);
	}
}
