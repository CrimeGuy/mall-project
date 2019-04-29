package com.openlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Goods;
import com.openlab.bean.Ordersdetail;
import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.dao.ManagerMapper;
import com.openlab.util.PageGoods;

@Service
public class ManagerImpl implements IManager {
	@Autowired
	ManagerMapper ManagerMapper;

	@Override
	public List<Role> findAllRole() {
		List<Role> RoleList = ManagerMapper.findAllRole();
		return RoleList;
	}

	@Override
	public List<User> findAllUser() {
		List<User> AllUser = ManagerMapper.findAllUser();
		return AllUser;
	}

	@Override
	public PageGoods<Goods> findAllGoods(int currentPage) {
		PageGoods<Goods> pageGoods = new PageGoods<Goods>();
		int pageSize = 15;
		int totalSize = ManagerMapper.getCount();
		List<Goods> pageGoodsList = ManagerMapper.getPageGoods((currentPage-1)*pageSize, pageSize);
		pageGoods.setCurrentPage(currentPage);
		pageGoods.setGlist(pageGoodsList);
		pageGoods.setPageSize(pageSize);
		pageGoods.setTotalSize(totalSize);
		return pageGoods;
		/*List<Goods> AllGoods = ManagerMapper.findAllGoods();
		return AllGoods;*/
	}

	@Override
	public List<Ordersdetail> findAllOrdersDetail() {
		List<Ordersdetail> AllOrdersDetail = ManagerMapper.findAllOrdersDetail();
		return AllOrdersDetail;
	}

}
