package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.User;
import com.openlab.dao.UserMapper;

@Service
public class UserImpl implements IUser {
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserByname(String u_name) {
		User user = userMapper.getUserByname(u_name);
		return user;
	}

}
