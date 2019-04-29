package com.openlab.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.Goods;

public interface GoodsMapper {
	public List<Goods> getPageGoods(@Param("currentPage")int currentPage,@Param("pageSize")int pageSize);
	public int getCount();
	public Goods getGoodsDetailByG_id(int g_id); 
}
