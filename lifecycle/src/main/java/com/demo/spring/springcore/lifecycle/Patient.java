package com.demo.spring.springcore.lifecycle;

//POJO Class
public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void init() {
		System.out.println("Lifecycle Initialization Method");
	}
	
	public void destroy() {
		System.out.println("Lifecycle Destroy method");
	}
}
