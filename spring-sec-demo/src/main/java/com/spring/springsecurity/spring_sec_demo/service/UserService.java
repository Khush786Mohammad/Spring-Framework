package com.spring.springsecurity.spring_sec_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springsecurity.spring_sec_demo.entity.User;
import com.spring.springsecurity.spring_sec_demo.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	@Autowired
	public UserService(UserRepository repo) {
		this.repository = repo;
	}
}
