package com.openlab.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.Goods;
import com.openlab.bean.Ordersdetail;
import com.openlab.bean.Role;
import com.openlab.bean.User;

public interface ManagerMapper {
	public List<Role> findAllRole();
	public List<User> findAllUser();
	public List<Goods> getPageGoods(@Param("currentPage")int currentPage,@Param("pageSize")int pageSize);
	public int getCount();
	public List<Ordersdetail> findAllOrdersDetail();
}
