package com.openlab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openlab.bean.Privilege;
import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.service.IRole;

@Controller
@RequestMapping("/AddRoleController")
public class AddRoleController {
	@Autowired
	IRole iRole;

	@RequestMapping("/findAllPrivilege")
	@ResponseBody
	public List<Privilege> findAllPrivilege() {
		List<Privilege> allPrivilege = iRole.findAllPrivilege();
		return allPrivilege;
	}
	
	@RequestMapping("/addRoleAndRp")
	public String addRoleAndRp(Role role,String p_id){
			iRole.addRole(role);
			int r_id = iRole.getLastR_idInDb();
			String[] p_idList = p_id.split(",");
			for(int i=1;i<p_idList.length;i++){
				iRole.addrRp(r_id, p_idList[i]);
			}
		return "/ManagerController/findAllRole.action";
	}
	
	@RequestMapping("/setRole")
	public String setRole(int r_id,String r_name,HttpServletRequest request){
		request.setAttribute("r_id", r_id);
		request.setAttribute("r_name", r_name);
		return "/DTree/updateRole.jsp";
	}
	
	@RequestMapping("/updateRole")
	public String updateRole(String r_id,String r_describe,String p_id){
		int r_idInt = Integer.parseInt(r_id);
		iRole.deleteRpByR_id(r_idInt);
		iRole.updateRoleDesc(r_idInt, r_describe);
		String[] p_idList = p_id.split(",");
		for(int i=1;i<p_idList.length;i++){
			iRole.addrRp(r_idInt, p_idList[i]);
		}
		return "/ManagerController/findAllRole.action";
	}
	
	@RequestMapping("/deleteRole")
	public String deleteRole(int r_id,HttpServletRequest request) throws IOException{
		List<User> userList = iRole.findUserByR_id(r_id);
		System.out.println(userList.size());
		if(userList.size()==0){
			iRole.deleteRpByR_id(r_id);
			iRole.deleteRole(r_id);
			
		}else{
			request.setAttribute("message", "改权限已被用户引用！");
		}
		return "/ManagerController/findAllRole.action";
		
	}
	
}
