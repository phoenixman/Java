package com.man.spring.jdbc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.man.spring.jdbc.dao.UserDao;
import com.man.spring.jdbc.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public void addUser(User user){
		userDao.addUser(user);
	}
	
	public void banchAdd(List users){
		userDao.banchAddUsers(users);
	}
}
