package com.demo.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/spring/springcore/map/mapconfig.xml");
		Customer cs = (Customer) cxt.getBean("cst");
		
		System.out.println("Customer id is: " +cs.getId());
		System.out.println("Customer Products: " +cs.getProduct());
		System.out.println("Class: "+cs.getProduct().getClass());

	}

}
