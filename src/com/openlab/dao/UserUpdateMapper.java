package com.openlab.dao;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.User;

public interface UserUpdateMapper {
	public void updatePwd(@Param("u_id")String u_id,@Param("u_pwd")String u_pwd);
	public void updateName(@Param("u_id")String u_id, @Param("u_name")String u_name);//修改用户名
	public void updateUserPhone(@Param("u_id")String u_id,@Param("u_phone")String u_phone);//修改手机号
	public void updateUserAddress(@Param("u_id")String u_id,@Param("u_address")String u_address);//修改地址
	public User findUserByU_id(String u_id);//更改密码之后需要更新session中loginUser对象，所以需要再次执行查询操作
}
