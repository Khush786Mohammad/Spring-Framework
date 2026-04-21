package com.spring.springcore.revision1.innerbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/revision1/innerbeans/config.xml");
		Employee emp1 = (Employee) ctx.getBean("employee");
		System.out.println(emp1);
		System.out.println(emp1.hashCode()); //bean scope
		Employee emp2 = (Employee) ctx.getBean("employee");
		System.out.println(emp2.hashCode());
		ctx.registerShutdownHook();
	}
}
