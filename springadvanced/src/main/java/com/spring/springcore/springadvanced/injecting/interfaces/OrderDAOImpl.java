package com.spring.springcore.springadvanced.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside the OrderDAOImpl method..");
	}
}
