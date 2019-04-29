package com.openlab.dao;

import java.util.List;

import com.openlab.bean.Car;
import com.openlab.bean.Orders;
import com.openlab.bean.Ordersdetail;

public interface OrdersMapper {
	public Car getOrdersCarByC_id(int c_id);
	public void addOrders(Orders orders);
	public int getMaxO_id();
	public void addOrdersdetail(Ordersdetail Ordersdetail);
	public void deleteOrdersCarByC_id(int c_id);
	public List<Ordersdetail> getAllOrdersdetailByO_id(int o_id);
	public List<Orders> getAllOrdersByU_id(String u_id);
	public void deleteOrdersDetailByO_id(int o_id);
	public void deleteOrderByO_id(int o_id);
	
}
