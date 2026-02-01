package com.demo.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/reftypes/config.xml");
		Student std = (Student) ctx.getBean("student");
		System.out.println(std.getScores());
	}

}
