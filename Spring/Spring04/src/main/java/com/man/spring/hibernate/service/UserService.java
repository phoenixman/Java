package com.man.spring.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.man.spring.hibernate.dao.UserDao;
import com.man.spring.hibernate.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void addUser(User user){
		userDao.saveUser(user);
	}
}
