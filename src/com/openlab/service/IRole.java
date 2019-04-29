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
	public void addRole(Role role);//����½�ɫ
	public int getLastR_idInDb();//�������ӵĽ�ɫid
	public void addrRp(int r_id,String p_id);//����м��Ȩ��
	public void deleteRpByR_id(int r_id);//ִ���޸�Ȩ��ʱ��Ҫ����м��rp�н�ɫ��Ӧ������Ȩ�ޣ�֮���ٸ���ѡ�����Ȩ��
	public void updateRoleDesc(int r_id,String r_describe);
	public void deleteRole(int r_id);
	public List<User> findUserByR_id(int r_id);
}
