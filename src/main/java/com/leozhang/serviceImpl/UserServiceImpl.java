package com.leozhang.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leozhang.entity.User;
import com.leozhang.entity.UserExample;
import com.leozhang.mapper.UserMapper;
import com.leozhang.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserMapper mapper;
	
	public List<User> queryUser(UserExample e) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(e);
	}

	public User queryUserByName(String userName) {
		// TODO Auto-generated method stub
		return mapper.selectByName(userName);
	}

	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	public int insert(User record) {
		return mapper.insert(record);
	}

	public User selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKey(User record) {
		return mapper.updateByPrimaryKey(record);
	}

	public List<User> select(String name) {
		return mapper.select("%"+name+"%");
	}

	/*public User login(String userName, String password) {
		// TODO Auto-generated method stub
		return mapper.login(userName, password);
	}*/
	
}
