package com.spring.springcore.springjavaconfig.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.springcore.springjavaconfig.dao.Dao;

public class Service {
	@Autowired
	private Dao dao;
	
	public void start() {
		System.out.println("Life cycle Started");
	}
	public void destroy() {
		System.out.println("Life cycle Destroyed");
	}
	
	public void save() {
		this.dao.create();
	}
}
