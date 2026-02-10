package com.spring.springcore.springadvanced.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/springadvanced/autowiring/annotation/config.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
		
	}

}
