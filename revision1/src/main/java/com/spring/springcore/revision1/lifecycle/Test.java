package com.spring.springcore.revision1.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/lifecycle/config.xml");
		Employee emp = (Employee) ctx.getBean("employees");
		System.out.println(emp);

		ctx.registerShutdownHook();
	}
}
