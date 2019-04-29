package com.openlab.service;

import java.util.List;

import com.openlab.bean.Goods;
import com.openlab.bean.Ordersdetail;
import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.util.PageGoods;

public interface IManager {
	public List<Role> findAllRole();//��ȡȨ���б�
	public List<User> findAllUser();//��ȡȫ���û���Ϣ
	public PageGoods<Goods> findAllGoods(int currentPage);//��ȡȫ����Ʒ��Ϣ
	public List<Ordersdetail> findAllOrdersDetail();//��ȡȫ����Ʒ����
}
