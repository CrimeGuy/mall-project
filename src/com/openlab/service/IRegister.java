package com.openlab.service;

import com.openlab.bean.User;

public interface IRegister {
	public User findUserByRegister(String u_name);
	public void addUser(User user); 
}
