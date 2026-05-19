package com.spring.springsecurity.spring_sec_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springsecurity.spring_sec_demo.entity.User;
import com.spring.springsecurity.spring_sec_demo.service.UserService;

@RestController
@RequestMapping("/enroll")
public class UserRegistrationController {
	
	@Autowired
	private UserService service;

	@PostMapping(value="/register", consumes = "application/json")
	public User register(@RequestBody User user) {
		return this.service.saveUser(user);
	}
}
