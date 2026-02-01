package com.demo.spring.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/assignment/config.xml");
		ShoppingCart user1 = (ShoppingCart) ctx.getBean("user1");
		System.out.println(user1.getItems());
		ShoppingCart user2 = (ShoppingCart) ctx.getBean("user2");
		System.out.println(user2.getItems());
		ShoppingCart user3 = (ShoppingCart) ctx.getBean("user3");
		System.out.println(user3.getItems());
	}

}
