package com.demo.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Patient implements InitializingBean, DisposableBean{
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
	
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("Inside after properties set");
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside the destroy method");
	}
}
