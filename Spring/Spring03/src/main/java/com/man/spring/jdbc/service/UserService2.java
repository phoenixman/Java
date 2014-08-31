package com.man.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.man.spring.jdbc.dao.UserDao2;
import com.man.spring.jdbc.entity.User;
@Repository
public class UserService2 {
	@Autowired
	private UserDao2 userDao2;
	
	public void addUser(User user){
		userDao2.addUser(user);
	}
	
	public void banchAdd(List users){
		userDao2.banchAddUsers(users);
	}
	
	
}
