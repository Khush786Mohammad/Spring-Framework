package com.spring.springsecurity.spring_sec_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.springsecurity.spring_sec_demo.entity.User;
import com.spring.springsecurity.spring_sec_demo.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository repository;
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println("Encoded password is: " + user.getPassword());
		return repository.save(user);
	}

	@Autowired
	public UserService(UserRepository repo) {
		this.repository = repo;
	}
}
