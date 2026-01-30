package com.demo.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Cars {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/set/setconfig.xml");
		
		CarDealer cd = (CarDealer) ctx.getBean("carDealer");
		System.out.println("Car name is: "+cd.getName());
		System.out.println("All Dealers are: "+cd.getModels());
		
	}
}
