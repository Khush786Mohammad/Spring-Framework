package com.spring.springcore.revision1.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Warehouse {
	private int id;
	private String address;

	@Autowired
	@Qualifier("inv2")
	private Inventory inventory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Inventory getInventory() {
		return inventory;
	}

	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", address=" + address + ", inventory=" + inventory + "]";
	}
}
