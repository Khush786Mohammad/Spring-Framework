package com.demo.spring.springcore.lifecycle.annotations;

import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/lifecycle/annotations/config.xml");
		Patient p1 = (Patient) ctx.getBean("patient");
		System.out.println(p1.getId());
		ctx.registerShutdownHook();
	}

}
