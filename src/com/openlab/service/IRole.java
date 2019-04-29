package com.openlab.service;

import java.util.List;

import com.openlab.bean.Privilege;
import com.openlab.bean.Role;
import com.openlab.bean.User;

public interface IRole {
	public User findUserByU_id(String u_id);
	public List<Role> findAllRole();
	public void updateUserRole(String u_id,int r_id);
	public List<Privilege> findAllPrivilege();
	public void addRole(Role role);//添加新角色
	public int getLastR_idInDb();//获得新添加的角色id
	public void addrRp(int r_id,String p_id);//添加中间表权限
	public void deleteRpByR_id(int r_id);//执行修改权限时需要清空中间表rp中角色对应的所有权限，之后再根据选择添加权限
	public void updateRoleDesc(int r_id,String r_describe);
	public void deleteRole(int r_id);
	public List<User> findUserByR_id(int r_id);
}
