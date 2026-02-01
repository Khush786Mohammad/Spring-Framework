package com.demo.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	@PostConstruct
	public void init() {
		System.out.println("Lifecycle Initialization Method");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("Destroy Method");
	}
}
