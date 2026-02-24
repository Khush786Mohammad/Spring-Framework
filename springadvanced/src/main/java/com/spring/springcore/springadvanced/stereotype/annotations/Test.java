package com.spring.springcore.springadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/springadvanced/stereotype/annotations/config.xml");

		Instructor instructor = (Instructor) ctx.getBean("mentor");
		Instructor instructor2 = (Instructor) ctx.getBean("mentor");
		System.out.println(instructor.hashCode() + " " +instructor2.hashCode());
		System.out.println(instructor);
	}
}
