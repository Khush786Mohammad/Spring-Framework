package com.demo.spring.springcore.dependencycheck.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class University {
	private int id;
	private String name;
	private String location;
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("University called");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("University Destroy");
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
}
