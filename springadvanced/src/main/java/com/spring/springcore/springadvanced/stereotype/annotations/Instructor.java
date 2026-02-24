package com.spring.springcore.springadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mentor")
@Scope("prototype")
public class Instructor {
	@Value("2812573")
	int id;
	@Value("Khush Mohammad")
	String name;
	@Value("#{subject}")
	List<String> subjects;

	@Autowired
	private Departments deparmtents;
	
	public Instructor(Departments dp) {
		this.deparmtents = dp;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
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

	public Departments getDeparmtents() {
		return deparmtents;
	}

//	@Autowired
	public void setDeparmtents(Departments deparmtents) {
		this.deparmtents = deparmtents;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", subjects=" + subjects + ", deparmtents=" + deparmtents
				+ "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
