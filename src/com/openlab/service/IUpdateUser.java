package com.openlab.service;

import com.openlab.bean.User;

public interface IUpdateUser {
	public void updatePwd(String u_id ,String newPwd);
	public void updateName(String u_id ,String u_name);
	public void updateUserPhone(String u_id,String u_phone);
	public User findUserByU_id(String u_id);
	public void updateUserAddress(String u_id,String u_address);
}
