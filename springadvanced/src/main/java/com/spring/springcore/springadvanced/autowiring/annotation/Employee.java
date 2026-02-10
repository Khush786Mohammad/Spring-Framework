package com.spring.springcore.springadvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
//	@Autowired
	private Address address; 
	
	@Autowired
	Employee(Address add){
		this.address = add;
	}

	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
