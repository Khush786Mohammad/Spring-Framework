package com.springboot.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.springbootdemo.dao.SpringBootDao;

@Component
public class SpringBootService {
	private SpringBootDao dao;

	@Autowired
	public SpringBootService(SpringBootDao dao) {
		this.dao = dao;
	}

	public void save() {
		this.dao.create();
	}
}
