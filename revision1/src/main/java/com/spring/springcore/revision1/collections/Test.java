package com.spring.springcore.revision1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/collections/config.xml");
		Students stdStudents = (Students) ctx.getBean("students");
		System.out.println(stdStudents);
	}
}
