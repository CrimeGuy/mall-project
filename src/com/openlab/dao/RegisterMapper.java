package com.openlab.dao;

import com.openlab.bean.User;

public interface RegisterMapper {
	public User findUserByRegister(String u_name);
	public void addUser(User user); 
}
