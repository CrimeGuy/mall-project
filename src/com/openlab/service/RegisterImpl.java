package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.User;
import com.openlab.dao.RegisterMapper;
@Service
public class RegisterImpl implements IRegister{
	@Autowired
	RegisterMapper RegisterMapper;
	public User findUserByRegister(String u_name){
		User user = RegisterMapper.findUserByRegister(u_name);
		return user;
	}
	@Override
	public void addUser(User user) {
		RegisterMapper.addUser(user);
	}
}
