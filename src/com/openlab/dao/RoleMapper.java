package com.openlab.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.Privilege;
import com.openlab.bean.Role;
import com.openlab.bean.User;

public interface RoleMapper {
	public List<Role> findAllRole();
	public User findUserByU_id(String u_id);
	public void updateUserRole(@Param("u_id")String u_id,@Param("r_id")int r_id);
	public List<Privilege> findAllPrivilege();
	public void addRole(Role role);
	public int getLastR_idInDb();
	public void addrRp(@Param("r_id")int r_id,@Param("p_id")String p_id);
	public void deleteRpByR_id(int r_id);
	public void updateRoleDesc(@Param("r_id")int r_id,@Param("r_describe")String r_describe);
	public void deleteRole(int r_id);
	public List<User> findUserByR_id(int r_id);
}
