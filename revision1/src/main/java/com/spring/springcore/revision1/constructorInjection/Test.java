package com.spring.springcore.revision1.constructorInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/revision1/constructorInjection/config.xml");
		Phone phone = (Phone) ctx.getBean("phone");
		System.out.println(phone);

		Phone iphone = (Phone) ctx.getBean("iphone");
		System.out.println(iphone);

		Phone iphoneAir = (Phone) ctx.getBean("iphoneAir");
		System.out.println(iphoneAir);

		ctx.close();
	}
}
