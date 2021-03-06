package com.man.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.man.spring.jdbc.dao.UserDao;
import com.man.spring.jdbc.dao.UserDao2;
import com.man.spring.jdbc.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserDao2 userDao2;
	
	public void addUser(User user){
		userDao.addUser(user);
	}
	
	public void banchAdd(List users){
		userDao.banchAddUsers(users);
	}
	
	public void addUser2(User user){
		userDao.addUser(user);
	}
}
