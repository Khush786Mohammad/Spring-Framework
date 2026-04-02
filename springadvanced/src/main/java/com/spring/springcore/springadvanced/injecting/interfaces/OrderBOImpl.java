package com.spring.springcore.springadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderBO")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("daoImpl1")
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
