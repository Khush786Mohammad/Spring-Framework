package com.spring.springcore.springadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("daoImpl2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl2 createOrder");;
	}
}
