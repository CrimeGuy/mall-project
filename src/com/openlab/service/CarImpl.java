package com.openlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Car;
import com.openlab.dao.CarMapper;

@Service
public class CarImpl implements ICar {

	@Autowired
	CarMapper CarMapper;
	@Override
	public Car getCarByU_id(String u_id, int g_id) {
		Car car = CarMapper.getCarByU_id(u_id, g_id);
		return car;
	}

	@Override
	public void addCarFirst(Car car) {
		CarMapper.addCarFirst(car);
	}

	@Override
	public void updateCar(int c_id,int c_num,int totalmoney) {
		CarMapper.updateCar(c_id, c_num,totalmoney);
	}

	@Override
	public List<Car> getAllCarByU_id(String u_id) {
		List<Car> carList = CarMapper.getAllCarByU_id(u_id);
		return carList;
	}

	@Override
	public void deleteCarByC_id(int c_id) {
		CarMapper.deleteCarByC_id(c_id);
	}

}
