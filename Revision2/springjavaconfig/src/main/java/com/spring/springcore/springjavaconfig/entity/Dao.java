package com.spring.springcore.springjavaconfig.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	public void create(Student s1) {
		System.out.println("Student has been created with id: " +s1.getId());
	}
}
