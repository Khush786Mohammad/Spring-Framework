package com.spring.springcore.revision1.lifecycle2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	private int id;
	private String name;
	private int YoE;

	public Employee() {
		System.out.println("Bean Created");
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
		YoE = yoE;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", YoE=" + YoE + "]";
	}
	
	@Override
	public void afterPropertiesSet() {
		System.out.println("Bean is initialized");
	}
	
	@Override
	public void destroy() {
		System.out.println("Bean is destroyed");
	}
}
