package com.openlab.service;

import java.util.List;

import com.openlab.bean.Goods;
import com.openlab.bean.Ordersdetail;
import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.util.PageGoods;

public interface IManager {
	public List<Role> findAllRole();//获取权限列表
	public List<User> findAllUser();//获取全部用户信息
	public PageGoods<Goods> findAllGoods(int currentPage);//获取全部商品信息
	public List<Ordersdetail> findAllOrdersDetail();//获取全部商品详情
}
