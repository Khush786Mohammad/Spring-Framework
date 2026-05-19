package com.spring.springsecurity.spring_sec_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.springsecurity.spring_sec_demo.entity.User;
import com.spring.springsecurity.spring_sec_demo.entity.UserPrincipal;
import com.spring.springsecurity.spring_sec_demo.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("Username not found");
		}
		return new UserPrincipal(user);
	}

}
