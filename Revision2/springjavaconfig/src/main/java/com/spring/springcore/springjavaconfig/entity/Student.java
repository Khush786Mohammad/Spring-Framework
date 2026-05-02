package com.spring.springcore.springjavaconfig.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("123")
	private int id;
	@Value("John Cena")
	private String name;
	private Subject sujbect;

	public void start() {
		System.out.println("Student bean is initialized");
		;
	}

	public void destroy() {
		System.out.println("Student bean is about to destroyed");
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

	public Subject getSujbect() {
		return sujbect;
	}

	@Autowired
	public void setSujbect(@Qualifier("dsa") Subject sujbect) {
		this.sujbect = sujbect;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sujbect=" + sujbect + "]";
	}
}
