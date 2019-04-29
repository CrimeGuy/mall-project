package com.openlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Role;
import com.openlab.dao.UpdateRoleMessageMapper;

@Service
public class UpdateRoleMessageImpl implements IUpdateRoleMessage {
	@Autowired
	UpdateRoleMessageMapper UpdateRoleMessageMapper;
	
	@Override
	public void updateRoleMessage(Role role) {
		UpdateRoleMessageMapper.updateRoleMessage(role);
	}
	
}
