package com.openlab.service;

public interface IDeleteUser {
	public void deleteOrdersdetail(String u_id);//由于主外键关系删除用户需要先删除订单表，而订单表与订单详情表也有主外键关系故要删除订单表就要先删除订单详情表
	public void deleteOrders(String u_id);//之后删除订单表
	public void deleteCar(String u_id);//之后删除购物车表
	public void deleteUser(String u_id);//最后删除用户
}
