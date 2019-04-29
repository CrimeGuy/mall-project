package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.dao.DeleteUserMapper;

@Service
public class DeleteUserImpl implements IDeleteUser {
	@Autowired
	DeleteUserMapper DeleteUserMapper;

	@Override
	public void deleteOrdersdetail(String u_id) {
		DeleteUserMapper.deleteOrdersdetail(u_id);
	}

	@Override
	public void deleteOrders(String u_id) {
		DeleteUserMapper.deleteOrders(u_id);
	}

	@Override
	public void deleteCar(String u_id) {
		DeleteUserMapper.deleteCar(u_id);
	}

	@Override
	public void deleteUser(String u_id) {
		DeleteUserMapper.deleteUser(u_id);
	}

}
