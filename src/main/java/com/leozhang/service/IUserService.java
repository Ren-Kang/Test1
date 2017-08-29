package com.leozhang.service;

import java.util.List;
import java.util.Map;

import com.leozhang.entity.User;
import com.leozhang.entity.UserExample;

public interface IUserService {

	List<User> queryUser(UserExample e);

	User queryUserByName(String userName);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(User record);
	
	User selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKey(User record);
	
	List<User> select(String name);
	
	/*User login(String userName,String password);*/
}
