package com.spring.springcore.springadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderBOImpl implements OrderBO {

	@Autowired
	private OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO");
		dao.createOrder();
	}
}
