package com.demo.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee Id: " +emp.getId());
		System.out.println("Employee Name: " +emp.getName());
		
		Employee emp2 = (Employee) ctx.getBean("emp2");
		System.out.println("Employee Id: " +emp2.getId());
		System.out.println("Employee Name: " +emp2.getName());
	}
}
