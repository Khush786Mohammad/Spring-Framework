package com.spring.springcore.revision1.autowiring.byName;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int id;
	private String name;
	private int age;
	private Subject subj;

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
	public void setVishya(Subject subj) {
		this.subj = subj;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", subj=" + subj + "]";
	}

}
