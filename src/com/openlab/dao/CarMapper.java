package com.openlab.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.Car;

public interface CarMapper {
	public Car getCarByU_id(@Param("u_id")String u_id,@Param("g_id")int g_id);//��ȡ�û���Ӧ�����й��ﳵ
	public void addCarFirst(Car car);//��ӹ��ﳵ
	public void updateCar(@Param("c_id")int c_id,@Param("c_num")int c_num,@Param("totalmoney")int totalmoney);//���¹��ﳵ��Ʒ���������ܼ�
	public List<Car> getAllCarByU_id(String u_id);//���ﳵ����
	public void deleteCarByC_id(int c_id);//����c_id�Ƴ���Ʒ
}
