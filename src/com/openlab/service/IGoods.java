package com.openlab.service;

import com.openlab.bean.Goods;
import com.openlab.util.PageGoods;

public interface IGoods {
	public PageGoods<Goods> pageMethod(int currentPage);
	public Goods getGoodsDetailByG_id(int g_id); 
}
