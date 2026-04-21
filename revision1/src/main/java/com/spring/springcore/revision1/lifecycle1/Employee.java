package com.spring.springcore.revision1.lifecycle1;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int YoE;
	private List<String> skill;
	
	public Employee() {
		System.out.println("Bean Created");
	}

	// lifecycle start method
	public void start() {
		System.out.println("Bean lifecycle method has been initialized");
	}

	// lifecycle destroy method
	public void destroy() {
		System.out.println("Bean lifecycle method has been destroyed");
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

	public int getYoE() {
		return YoE;
	}

	public void setYoE(int yoE) {
		YoE = yoE;
	}

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", YoE=" + YoE + ", skill=" + skill + "]";
	}
}
