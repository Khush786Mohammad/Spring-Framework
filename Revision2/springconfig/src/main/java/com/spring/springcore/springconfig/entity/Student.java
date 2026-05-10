package com.spring.springcore.springconfig.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int id;
	private String name;
	private String email;
	private Subject subject;

	@PostConstruct
	public void start() {
		System.out.println("Student bean is initialized");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Student bean is about to destroy");
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject + "]";
	}

}
