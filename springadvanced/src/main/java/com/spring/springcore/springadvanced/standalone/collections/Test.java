package com.spring.springcore.springadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/springadvanced/standalone/collections/config.xml");

		ProductsList pl = (ProductsList) ctx.getBean("myProducts");
		System.out.println(pl);
	}
}
