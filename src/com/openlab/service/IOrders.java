package com.openlab.service;

import java.util.List;

import com.openlab.bean.Car;
import com.openlab.bean.Orders;
import com.openlab.bean.Ordersdetail;

public interface IOrders {
	public Car getOrdersCarByC_id(int c_id);
	public void addOrders (Orders orders);
	public int getMaxO_id();//获取数据库中总的订单数量，为了确定最后一条订单的订单编号来完成订单详情对象的创建
	public void addOrdersdetail(Ordersdetail Ordersdetail);
	public void deleteOrdersCarByC_id(int c_id);
	public List<Ordersdetail> getAllOrdersdetailByO_id(int o_id);
	public List<Orders> getAllOrdersByU_id(String u_id);
	public void deleteOrdersDetailByO_id(int o_id);
	public void deleteOrderByO_id(int o_id);
	
}
