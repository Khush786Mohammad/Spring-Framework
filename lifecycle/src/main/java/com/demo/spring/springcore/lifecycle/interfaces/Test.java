package com.demo.spring.springcore.lifecycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/lifecycle/interfaces/config.xml");
		Patient p1 = (Patient) ctx.getBean("patient");
		System.out.println(p1.getId());
		ctx.registerShutdownHook();
	}

}
