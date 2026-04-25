package com.spring.springcore.revision1.autowired;

import org.springframework.beans.factory.annotation.Autowired;

//dependent class
public class Order {
	private int orderId;
	@Autowired(required = false)
	private Product product;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + "]";
	}
}
