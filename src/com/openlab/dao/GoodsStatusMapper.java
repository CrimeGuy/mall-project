package com.openlab.dao;

import org.apache.ibatis.annotations.Param;

public interface GoodsStatusMapper {
	public void updateGoodsStatus(@Param("g_id")int g_id,@Param("g_status")String g_status);
	public void updateCarStatus(@Param("g_id")int g_id,@Param("g_status")String g_status);
}
