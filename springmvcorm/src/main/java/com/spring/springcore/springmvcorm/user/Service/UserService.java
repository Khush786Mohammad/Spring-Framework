package com.spring.springcore.springmvcorm.user.Service;

import java.util.List;

import com.spring.springcore.springmvcorm.user.entity.User;

public interface UserService {
	int save(User user);

	User getUser(int id);

	List<User> fetchAllUsers();
}
