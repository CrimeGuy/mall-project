package com.openlab.service;

import java.util.List;

import com.openlab.bean.Privilege;

public interface IPrivilege {
	public List<Privilege> getPrivilegeByR_id(int r_id);
}
