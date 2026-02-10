package com.spring.springcore.springadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/springadvanced/autowiring/config.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
		
		Employee emp2 = (Employee) ctx.getBean("employee2");
		System.out.println(emp2);
		
		Employee emp3 = (Employee) ctx.getBean("employee3");
		System.out.println(emp3);
	}

}
