package com.spring.springsecurity.spring_sec_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private int id;
	private String name;
	private String email;
}
