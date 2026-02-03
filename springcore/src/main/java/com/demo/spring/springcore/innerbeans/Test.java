package com.demo.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/innerbeans/config.xml");
		Employee emp = (Employee) ctx.getBean("Employee");
		System.out.println(emp);
		
		Employee emp2 = (Employee) ctx.getBean("Employee");
		System.out.println(emp2.hashCode());
		
	}
}
