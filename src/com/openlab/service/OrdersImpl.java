package com.openlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Car;
import com.openlab.bean.Orders;
import com.openlab.bean.Ordersdetail;
import com.openlab.dao.OrdersMapper;
@Service
public class OrdersImpl implements IOrders{
	@Autowired
	OrdersMapper OrdersMapper;
	@Override
	public Car getOrdersCarByC_id(int c_id) {
		Car ordersCar = OrdersMapper.getOrdersCarByC_id(c_id);
		return ordersCar;
	}
	@Override
	public void addOrders(Orders orders) {
		OrdersMapper.addOrders(orders);
	}
	@Override
	public int getMaxO_id() {
		return OrdersMapper.getMaxO_id();
		
	}
	@Override
	public void addOrdersdetail(Ordersdetail Ordersdetail) {
		OrdersMapper.addOrdersdetail(Ordersdetail);
	}
	@Override
	public void deleteOrdersCarByC_id(int c_id) {
		OrdersMapper.deleteOrdersCarByC_id(c_id);
		
	}
	@Override
	public List<Ordersdetail> getAllOrdersdetailByO_id(int o_id) {
		List<Ordersdetail> allOrdersdetailList = OrdersMapper.getAllOrdersdetailByO_id(o_id);
		return allOrdersdetailList;
	}
	@Override
	public List<Orders> getAllOrdersByU_id(String u_id) {
		List<Orders> allOrders = OrdersMapper.getAllOrdersByU_id(u_id);
		return allOrders;
		
	}
	public void deleteOrderByO_id(int o_id){
		OrdersMapper.deleteOrderByO_id(o_id);
	}
	@Override
	public void deleteOrdersDetailByO_id(int o_id) {
		OrdersMapper.deleteOrdersDetailByO_id(o_id);
	}
}
