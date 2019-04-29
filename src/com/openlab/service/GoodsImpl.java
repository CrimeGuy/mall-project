package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Goods;
import com.openlab.dao.GoodsMapper;
import com.openlab.util.PageGoods;

@Service
public class GoodsImpl implements IGoods {
	
	@Autowired
	GoodsMapper goodsMapper;
	
	@Override
	public PageGoods<Goods> pageMethod(int currentPage) {
		PageGoods<Goods> page = new PageGoods<Goods>();
		int pageSize = 15;
		int TotalSize = goodsMapper.getCount();
		page.setPageSize(pageSize);
		page.setCurrentPage(currentPage);
		page.setTotalSize(TotalSize);
		page.setGlist(goodsMapper.getPageGoods((currentPage-1)*pageSize, pageSize));
		return page;
	}

	@Override
	public Goods getGoodsDetailByG_id(int g_id) {
		Goods goods = goodsMapper.getGoodsDetailByG_id(g_id);
		return goods;
	}

}
