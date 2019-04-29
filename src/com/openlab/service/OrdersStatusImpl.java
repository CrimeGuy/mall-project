package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openlab.dao.OrdersStatusMapper;
import com.openlab.service.IOrdersStatus;
@Service
public class OrdersStatusImpl implements IOrdersStatus{
	@Autowired
	OrdersStatusMapper OrdersStatusMapper;
	@Override
	public void updateOrdersdetailStatus(int od_id, String od_status) {
		OrdersStatusMapper.updateOrdersdetailStatus(od_id, od_status);
	}
	@Override
	public void updateOrdersStatus(int o_id, String o_status) {
		OrdersStatusMapper.updateOrdersStatus(o_id, o_status);
	}
	
}
