package com.openlab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.Role;
import com.openlab.service.IUpdateRoleMessage;

@Controller
@RequestMapping("/UpdateRolesMessageController")
public class UpdateRolesMessageController {
	@Autowired
	IUpdateRoleMessage IUpdateRoleMessage;
	@RequestMapping("/UpdateRolesMessage")
	public String UpdateRolesMessage(Role role){
		IUpdateRoleMessage.updateRoleMessage(role);
		return "/ManagerController/findAllRole.action";
	}
	@RequestMapping("/forwardToUpdateJsp")
	public String forwardToUpdateJsp(int r_id,String r_name,String r_describe,HttpServletRequest request){
		System.out.println(r_describe);
		System.out.println(r_id);
		Role role = new Role();
		role.setR_describe(r_describe);
		role.setR_id(r_id);
		role.setR_name(r_name);
		request.setAttribute("role", role);
		return "/Jsp/updateRoleMessage.jsp";
	}
}
