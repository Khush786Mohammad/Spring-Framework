package com.spring.springcore.revision1.constructorInjection.ambiguity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/constructorInjection/ambiguity/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);

		Student stdStudent = (Student) ctx.getBean("student");
		ctx.close();
	}
}
