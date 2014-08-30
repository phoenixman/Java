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

import com.man.spring.jdbc.entity.User;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;


	
	public void addUser(User user){
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("name",user.getName());
		params.put("age", user.getAge());
		params.put("create_time",user.getCreate_time());
		//位置要对应
		String sql="insert into user(age,name,create_time) values(:age,:name,:create_time)";
		namedJdbcTemplate.update(sql, params);
	}
	
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
