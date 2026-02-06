package com.demo.spring.springcore.constructorInjection.ambiguity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/demo/spring/springcore/constructorInjection/ambiguity/config.xml");
		Addition addition = (Addition) ctx.getBean("addition");
		System.out.println(addition);
	}

}
