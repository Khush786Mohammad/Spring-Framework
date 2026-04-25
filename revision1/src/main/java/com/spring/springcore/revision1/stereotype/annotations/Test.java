package com.spring.springcore.revision1.stereotype.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/stereotype/annotations/config.xml");
		Inventory inventory = (Inventory) ctx.getBean("inv");
		System.out.println(inventory + " \nhashCode: " + inventory.hashCode());
		Inventory inventory2 = (Inventory) ctx.getBean("inv");
		System.out.println(inventory2 + " \nhashCode: " + inventory2.hashCode());
		
		Product product = (Product) ctx.getBean("product");
		System.out.println(product)
		;
	}
}
