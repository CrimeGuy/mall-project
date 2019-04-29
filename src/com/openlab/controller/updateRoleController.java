package com.openlab.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.service.IRole;

@Controller
@RequestMapping("/updateRoleController")
public class updateRoleController {
	@Autowired
	IRole IRole;
	@RequestMapping("/findUserByU_id")
	public String findUserByU_id(String u_id,HttpServletRequest request){
		User user = IRole.findUserByU_id(u_id);
		request.setAttribute("R_user", user);
		return "/Jsp/updateRoleByManager.jsp";
	}
	
	@RequestMapping("/findAllRole")
	@ResponseBody
	public List<Role> findAllRole() {
		List<Role> allRole = IRole.findAllRole();
		return allRole;

	}

	  @RequestMapping("/updateRole") 
	  public String updateRole(String u_id,int r_id){
		  IRole.updateUserRole(u_id, r_id);
		  return "/ManagerController/findAllUser.action";
	  }
}
