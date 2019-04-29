package com.openlab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.User;
import com.openlab.service.IRegister;
import com.openlab.service.RegisterImpl;

@Controller
@RequestMapping("/registerController")
public class RegisterController {
	@Autowired
	IRegister IRegister;
	@RequestMapping("/registerAjax")
	public void registerAjax(String u_name,HttpServletResponse response) throws IOException{
		User user = IRegister.findUserByRegister(u_name);
		PrintWriter out = response.getWriter();
		System.out.println("============"+u_name);
		if(user!=null){
			out.print("1");
		}else if(user==null&&u_name.length()<=10&&u_name.length()>0){
			out.print("2");
		}else if(u_name.length()>10&&u_name.length()!=0){
			out.print("3");
		}else if(u_name.length()==0||u_name==""||u_name==null){
			out.print("4");
		}
	}
	
	@RequestMapping("/register")
	public String register(User user){
		UUID u_id = UUID.randomUUID();
		//System.out.println(u_id.toString());
		System.out.println(user);
		user.setU_id(u_id.toString());
		IRegister.addUser(user);
		return "/Jsp/login.jsp";
	}
}
