package com.openlab.service;

import java.util.List;

import com.openlab.bean.Car;

public interface ICar {
	public Car getCarByU_id(String u_id,int g_id);//Ѱ���û����ﳵ���Ƿ����뱾����ӵ���Ʒ��ͬ����Ʒ
	public void addCarFirst(Car car);
	public void updateCar(int c_id,int c_num,int totalmoney);//������ﳵ����ͬ����Ʒִ���޸���������
	public List<Car> getAllCarByU_id(String u_id);
	public void deleteCarByC_id(int c_id);//ɾ�����ﳵ����Ʒ
}
