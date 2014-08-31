package com.man.spring.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.man.spring.hibernate.entity.User;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;
		
	private Session getsession(){
		return sessionFactory.openSession();
	}
	public void saveUser(User user){
		Session session=getsession();
		Transaction  ts=session.beginTransaction();
		session.save(user);
		ts.commit();
	}
}
