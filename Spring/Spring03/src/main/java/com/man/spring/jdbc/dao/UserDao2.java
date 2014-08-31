package com.man.spring.jdbc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.man.spring.jdbc.entity.User;
//声明事务，所有方法都不一定需要事务，且只读
@Repository
@Transactional(propagation=Propagation.SUPPORTS ,readOnly=true)
public class UserDao2 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	//在方法上声明事务，需要事务
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void addUser(User user){
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("name",user.getName());
		params.put("age", user.getAge());
		params.put("create_time",user.getCreate_time());
		//位置要对应
		String sql="insert into user(age,name,create_time) values(:age,:name,:create_time)";
		namedJdbcTemplate.update(sql, params);
	}
	//在方法上声明事务，需要事务
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void banchAddUsers(List<User> users){
		String sql="insert into user(name,age,create_time) values(:name,:age,:create_time)";
		Object[] beans=new Object[users.size()];
		for(int i=0;i<users.size();i++){
			beans[i]=users.get(i);
		}
		SqlParameterSource[]  params=SqlParameterSourceUtils.createBatch(beans); 
		namedJdbcTemplate.batchUpdate(sql, params);
	}
}
