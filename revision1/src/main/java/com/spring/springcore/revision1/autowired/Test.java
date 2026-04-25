package com.spring.springcore.revision1.autowired;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/autowired/config.xml");
		Order order = (Order) ctx.getBean("order");
		System.out.println(order);

		Inventory inventory = (Inventory) ctx.getBean("inv");
		System.out.println(inventory);

		Warehouse warehouse = (Warehouse) ctx.getBean("war");
		System.out.println(warehouse);
	}
}
