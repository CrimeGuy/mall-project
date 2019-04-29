package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.User;
import com.openlab.dao.UserUpdateMapper;

@Service
public class updateUserImpl implements IUpdateUser {
	@Autowired
	UserUpdateMapper UserUpdateMapper;
	@Override
	public void updatePwd(String u_id,String newPwd) {
		UserUpdateMapper.updatePwd(u_id, newPwd);
	}
	@Override
	public User findUserByU_id(String u_id) {
		return UserUpdateMapper.findUserByU_id(u_id);
	}
	@Override
	public void updateName(String u_id, String u_name) {
		UserUpdateMapper.updateName(u_id, u_name);
	}
	@Override
	public void updateUserPhone(String u_id, String u_phone) {
		UserUpdateMapper.updateUserPhone(u_id, u_phone);
	}
	@Override
	public void updateUserAddress(String u_id, String u_address) {
		UserUpdateMapper.updateUserAddress(u_id, u_address);
	}
	
}
