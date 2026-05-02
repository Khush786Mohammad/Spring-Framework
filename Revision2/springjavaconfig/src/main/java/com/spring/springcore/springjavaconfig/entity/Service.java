package com.spring.springcore.springjavaconfig.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	private Dao dao;
	public void save(Student s) {
		this.dao.create(s);
	}
}
