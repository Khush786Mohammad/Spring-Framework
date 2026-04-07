package com.spring.springcore.springaop.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.springaop.ProductService;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/springaop/test/config.xml");
		ProductService productService = (ProductService) ctx.getBean("productService");
		System.out.println(productService.multiply(2, 2));
	}
}
