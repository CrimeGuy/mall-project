package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.dao.GoodsStatusMapper;
@Service
public class GoodsStatusImpl implements IGoodsStatus {
	@Autowired
	GoodsStatusMapper GoodsStatusMapper;

	@Override
	public void updateGoodsStatus(int g_id,String g_status) {
		GoodsStatusMapper.updateGoodsStatus(g_id, g_status);
	}

	@Override
	public void updateCarStatus(int g_id, String g_status) {
		GoodsStatusMapper.updateCarStatus(g_id, g_status);
	}

}
