package com.spring.springcore.revision1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctxApplicationContext = new ClassPathXmlApplicationContext("com/spring/springcore/revision1/collections/config.xml");
		Students stdStudents = (Students) ctxApplicationContext.getBean("students");
		System.out.println(stdStudents);
	}
}
