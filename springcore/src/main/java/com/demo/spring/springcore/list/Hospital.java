package com.demo.spring.springcore.list;
import java.util.List;

public class Hospital {
	private String name;
	private List<String> departments;
	
	public String getName() {
		return this.name;
	}
	
	public List<String> getDepartments(){
		return this.departments;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartments(List<String> dep) {
		this.departments = dep;
	}
	
}
