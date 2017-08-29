package com.leozhang.mapper;

import com.leozhang.entity.User;
import com.leozhang.entity.UserExample;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByName(String userName);
    
    List<User> select(String name);
    /*User login(String userName,String password);*/
}