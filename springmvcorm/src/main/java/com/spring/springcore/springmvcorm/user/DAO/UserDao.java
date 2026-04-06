package com.spring.springcore.springmvcorm.user.DAO;

import java.util.List;

import com.spring.springcore.springmvcorm.user.entity.User;

public interface UserDao {
	int create(User user);

	User fetchUserById(int id);

	List<User> getAllUser();
}
