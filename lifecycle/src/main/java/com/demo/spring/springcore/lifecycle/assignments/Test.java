package com.demo.spring.springcore.lifecycle.assignments;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/lifecycle/assignments/config.xml");
		TicketReservation tr = (TicketReservation) ctx.getBean("tkt-reserve");
		System.out.println(tr.toString());
		ctx.registerShutdownHook();
	}

}
