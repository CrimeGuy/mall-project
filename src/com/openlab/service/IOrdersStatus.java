package com.openlab.service;

public interface IOrdersStatus {
	public void updateOrdersdetailStatus(int od_id,String od_status);
	public void updateOrdersStatus(int o_id,String o_status);
}
