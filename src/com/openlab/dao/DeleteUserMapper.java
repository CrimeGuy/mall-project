package com.openlab.dao;

public interface DeleteUserMapper {
	public void deleteOrdersdetail(String u_id);
	public void deleteOrders(String u_id);
	public void deleteCar(String u_id);//之后删除购物车表
	public void deleteUser(String u_id);//最后删除用户
}
