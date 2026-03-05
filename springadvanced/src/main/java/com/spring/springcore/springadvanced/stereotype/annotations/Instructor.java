package com.spring.springcore.springadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mentor")
@Scope("prototype")
public class Instructor {
//	@Value("281")
//	@Value("#{66+44}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	int id;
//	@Value("Khush Mohammad")
	@Value("#{'Khush'.toUpperCase()}")
	String name;
	@Value("#{subject}")
	List<String> subjects;
	
	@Value("#{2+4>5}")
	private boolean active;

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
		return "Instructor [id=" + id + ", name=" + name + ", subjects=" + subjects + ", active=" + active
				+ ", deparmtents=" + deparmtents + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
