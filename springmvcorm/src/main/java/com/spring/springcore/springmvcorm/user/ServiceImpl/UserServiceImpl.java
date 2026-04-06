package com.spring.springcore.springmvcorm.user.ServiceImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springcore.springmvcorm.user.DAO.UserDao;
import com.spring.springcore.springmvcorm.user.Service.UserService;
import com.spring.springcore.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public int save(User user) {
		return userDao.create(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Override
	public User getUser(int id) {
		return userDao.fetchUserById(id);
	}

	@Override
	public List<User> fetchAllUsers() {
		List<User> user = userDao.getAllUser();
		Collections.sort(user, Collections.reverseOrder());
		return user;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
