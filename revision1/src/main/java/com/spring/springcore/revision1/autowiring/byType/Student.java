package com.spring.springcore.revision1.autowiring.byType;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int id;
	private String name;
	private int age;
	
	@Qualifier("subject2")
	private Subject subj;

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

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Subject getSubj() {
		return subj;
	}

	@Required
	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", subj=" + subj + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Bean has been initialized");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Bean is ready to destroy");
	}
}