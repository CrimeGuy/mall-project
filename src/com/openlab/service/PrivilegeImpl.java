package com.openlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Privilege;
import com.openlab.dao.PrivilegeMapper;
@Service
public class PrivilegeImpl implements IPrivilege {

	@Autowired
	PrivilegeMapper PrivilegeMapper;
	@Override
	public List<Privilege> getPrivilegeByR_id(int r_id) {
		List<Privilege> privilegeList = PrivilegeMapper.getPrivilegeByR_id(r_id);
		return privilegeList;
	}
	
}
