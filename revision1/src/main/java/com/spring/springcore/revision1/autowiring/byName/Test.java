package com.spring.springcore.revision1.autowiring.byName;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/autowiring/byName/config.xml");
		Student s1 = (Student) ctx.getBean("student");

		System.out.println(s1);

		ctx.close();
	}
}
