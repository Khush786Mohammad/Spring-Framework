package com.demo.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/list/listconfig.xml");
		Hospital h1 = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name is: " +h1.getName());
		System.out.println("Hospital Departments: "+h1.getDepartments().getClass());
	}

}
