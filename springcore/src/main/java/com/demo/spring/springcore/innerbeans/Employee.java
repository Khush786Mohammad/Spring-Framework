package com.demo.spring.springcore.innerbeans;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int id;
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Address address;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
}
