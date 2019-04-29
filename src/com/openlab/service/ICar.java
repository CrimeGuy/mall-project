package com.openlab.service;

import java.util.List;

import com.openlab.bean.Car;

public interface ICar {
	public Car getCarByU_id(String u_id,int g_id);//寻找用户购物车中是否有与本次添加的商品相同的商品
	public void addCarFirst(Car car);
	public void updateCar(int c_id,int c_num,int totalmoney);//如果购物车有相同的商品执行修改数量操作
	public List<Car> getAllCarByU_id(String u_id);
	public void deleteCarByC_id(int c_id);//删除购物车的商品
}
