package com.spring.springcore.springjavaconfig.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//fetch bean of Subject first
		Subject subj = (Subject) context.getBean("automata");
		System.out.println(subj);
		
		Student std = (Student) context.getBean("student");
		System.out.println(std);
		
		Service service = context.getBean(Service.class);
		service.save(std);
		
		context.close();
	}
}
