package com.spring.springcore.springadvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Address address; 
	
	@Autowired(required=false)
	Employee(@Qualifier("address2") Address add){
		this.address = add;
	}

	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
