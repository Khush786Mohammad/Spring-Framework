package com.spring.springcore.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Processor processor = (Processor) ctx.getBean(Processor.class);
//		System.out.println(processor);
		
	}
}
