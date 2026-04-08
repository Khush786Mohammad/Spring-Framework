package com.spring.springcore.springjavaconfig.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.springcore.springjavaconfig.SpringConfig;
import com.spring.springcore.springjavaconfig.dao.Dao;
import com.spring.springcore.springjavaconfig.service.Service;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service bean = (Service) ctx.getBean(Service.class);
		bean.save();
		System.out.println(bean.hashCode());
		
//		Dao bean2 = (Dao) ctx.getBean(Dao.class);
//		bean2.create();
//		System.out.println(bean2.hashCode());
		ctx.close();
	}

}
