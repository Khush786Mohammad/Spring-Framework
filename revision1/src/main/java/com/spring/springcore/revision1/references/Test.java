package com.spring.springcore.revision1.references;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/references/config.xml");
		Student s1 = (Student) ctx.getBean("student1");
		System.out.println(s1);
		Student s2 = (Student) ctx.getBean("student2");
		System.out.println(s2);
		Student s3 = (Student) ctx.getBean("student3");
		System.out.println(s3);
	}
}
