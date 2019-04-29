package com.openlab.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.Car;

public interface CarMapper {
	public Car getCarByU_id(@Param("u_id")String u_id,@Param("g_id")int g_id);//获取用户对应的所有购物车
	public void addCarFirst(Car car);//添加购物车
	public void updateCar(@Param("c_id")int c_id,@Param("c_num")int c_num,@Param("totalmoney")int totalmoney);//更新购物车商品的数量和总价
	public List<Car> getAllCarByU_id(String u_id);//购物车遍历
	public void deleteCarByC_id(int c_id);//根据c_id移除商品
}
