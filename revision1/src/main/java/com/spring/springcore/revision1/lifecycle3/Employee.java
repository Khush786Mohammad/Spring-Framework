package com.spring.springcore.revision1.lifecycle3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee{
	private int id;
	private String name;
	private int YoE;

	public Employee() {
		System.out.println("Bean Created");
	}

	@PostConstruct
	public void start() {
		System.out.println("Bean is created");
	}
	
	public Employee(int id, String name, int yoE) {
		super();
		System.out.println("Parameterized constructor is called");
		this.id = id;
		this.name = name;
		YoE = yoE;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean has been destroyed");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Dependency Injection for Id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYoE() {
		return YoE;
	}

	public void setYoE(int yoE) {
		this.YoE = yoE;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", YoE=" + YoE + "]";
	}
}
