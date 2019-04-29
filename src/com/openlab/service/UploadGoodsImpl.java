package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Goods;
import com.openlab.dao.UploadGoodsMapper;
@Service
public class UploadGoodsImpl implements IUploadGoods{
	@Autowired
	UploadGoodsMapper UploadGoodsMapper;
	public void uploadGoods(Goods goods){
		UploadGoodsMapper.uploadGoods(goods);
	}
}
