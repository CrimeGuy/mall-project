package com.openlab.dao;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.User;

public interface UserUpdateMapper {
	public void updatePwd(@Param("u_id")String u_id,@Param("u_pwd")String u_pwd);
	public void updateName(@Param("u_id")String u_id, @Param("u_name")String u_name);//�޸��û���
	public void updateUserPhone(@Param("u_id")String u_id,@Param("u_phone")String u_phone);//�޸��ֻ���
	public void updateUserAddress(@Param("u_id")String u_id,@Param("u_address")String u_address);//�޸ĵ�ַ
	public User findUserByU_id(String u_id);//��������֮����Ҫ����session��loginUser����������Ҫ�ٴ�ִ�в�ѯ����
}
