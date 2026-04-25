package com.spring.springcore.revision1.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Inventory {
	private int inventoryId;
	private int quantity;
	private Product product;

	public Inventory(int id, int quantity) {
		this.inventoryId = id;
		this.quantity = quantity;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	@Autowired
	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", quantity=" + quantity + ", product=" + product + "]";
	}
}
