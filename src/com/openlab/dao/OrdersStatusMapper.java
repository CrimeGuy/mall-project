package com.openlab.dao;

import org.apache.ibatis.annotations.Param;

public interface OrdersStatusMapper {
	public void updateOrdersdetailStatus(@Param("od_id")int od_id,@Param("od_status")String od_status);
	public void updateOrdersStatus(@Param("o_id")int o_id,@Param("o_status")String o_status);
}
