package com.openlab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.User;
import com.openlab.service.IUpdateUser;

@Controller
@RequestMapping("/UserController")
public class UserController {
	
	@Autowired
	IUpdateUser IUpdateUser;
	
	//修改密码
	@RequestMapping("/updatePwd")
	public String updatePwd(String u_pwd,HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("loginUser");
		String u_id = user.getU_id();
		IUpdateUser.updatePwd(u_id, u_pwd);
		User loginUser = IUpdateUser.findUserByU_id(u_id);
		request.getSession().setAttribute("loginUser", loginUser);
		return "/Jsp/userInfo.jsp";
	}
	
	//修改用户名
	@RequestMapping("/updateName")
	public String updateName(String u_name,HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("loginUser");
		String u_id = user.getU_id();
		IUpdateUser.updateName(u_id, u_name);
		User loginUser = IUpdateUser.findUserByU_id(u_id);
		request.getSession().setAttribute("loginUser", loginUser);
		return "/Jsp/userInfo.jsp";
	}
	//修改手机号
	@RequestMapping("/updateUserPhone")
	public String updateUserPhone(String u_phone,HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("loginUser");
		String u_id = user.getU_id();
		IUpdateUser.updateUserPhone(u_id, u_phone);
		User loginUser = IUpdateUser.findUserByU_id(u_id);
		request.getSession().setAttribute("loginUser", loginUser);
		return "/Jsp/userInfo.jsp";
	}
	//修改地址
	@RequestMapping("/updateUserAddress")
	public String updateUserAddress(String u_address,HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("loginUser");
		String u_id = user.getU_id();
		IUpdateUser.updateUserAddress(u_id, u_address);
		User loginUser = IUpdateUser.findUserByU_id(u_id);
		request.getSession().setAttribute("loginUser", loginUser);
		return "/Jsp/userInfo.jsp";
		
	}
}
