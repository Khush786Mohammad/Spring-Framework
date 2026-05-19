package com.spring.springsecurity.spring_sec_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springsecurity.spring_sec_demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
