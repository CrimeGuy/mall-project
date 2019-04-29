package com.openlab.dao;

import java.util.List;

import com.openlab.bean.Privilege;

public interface PrivilegeMapper {
	public List<Privilege> getPrivilegeByR_id(int r_id);
}
