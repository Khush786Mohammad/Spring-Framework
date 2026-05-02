package com.spring.springcore.springjavaconfig.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value("12")
	private int id;
	@Value("Automata")
	private String name;
	
	public void init() {
		System.out.println("Subject bean initialized");
	}
	
	public void destroy() {
		System.out.println("Subject bean is destroyed");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + "]";
	}
}
