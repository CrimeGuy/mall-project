package com.openlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Privilege;
import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.dao.RoleMapper;

@Service
public class RoleImpl implements IRole {
	@Autowired
	RoleMapper roleMapper;

	@Override
	public List<Role> findAllRole() {
		List<Role> allRole = roleMapper.findAllRole();
		return allRole;
	}

	@Override
	public User findUserByU_id(String u_id) {
		User user = roleMapper.findUserByU_id(u_id);
		return user;
	}

	@Override
	public void updateUserRole(String u_id, int r_id) {
		roleMapper.updateUserRole(u_id, r_id);
	}

	@Override
	public List<Privilege> findAllPrivilege() {
		List<Privilege> allPrivilege = roleMapper.findAllPrivilege();
		return allPrivilege;
	}

	@Override
	public void addRole(Role role) {
		roleMapper.addRole(role);
	}

	@Override
	public int getLastR_idInDb() {
		int r_id = roleMapper.getLastR_idInDb();
		return r_id;
	}

	@Override
	public void addrRp(int r_id, String p_id) {
		roleMapper.addrRp(r_id, p_id);
	}

	@Override
	public void deleteRpByR_id(int r_id) {
		roleMapper.deleteRpByR_id(r_id);
	}

	@Override
	public void updateRoleDesc(int r_id, String r_describe) {
		roleMapper.updateRoleDesc(r_id, r_describe);
	}

	@Override
	public void deleteRole(int r_id) {
		roleMapper.deleteRole(r_id);
	}

	@Override
	public List<User> findUserByR_id(int r_id) {
		List<User> userList = roleMapper.findUserByR_id(r_id);
		return userList;
	}

}
