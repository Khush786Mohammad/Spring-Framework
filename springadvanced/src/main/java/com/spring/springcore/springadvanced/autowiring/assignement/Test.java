package com.spring.springcore.springadvanced.autowiring.assignement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/springadvanced/autowiring/assignement/config.xml");
		Customer c1 = (Customer) ctx.getBean("customer1");
		System.out.println(c1);
	}
}
