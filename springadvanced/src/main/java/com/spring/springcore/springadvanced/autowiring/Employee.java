package com.spring.springcore.springadvanced.autowiring;

public class Employee {
	private Address address; 
	
	Employee(Address add){
		this.address = add;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
