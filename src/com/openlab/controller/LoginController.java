package com.openlab.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.Privilege;
import com.openlab.bean.User;
import com.openlab.service.IUser;
import com.openlab.service.PrivilegeImpl;
import com.openlab.service.UserImpl;
import com.openlab.util.VerifyCode;

@Controller
@RequestMapping("/LoginController")
public class LoginController {
	@Autowired
	IUser IUser;
	@Autowired
	com.openlab.service.IPrivilege IPrivilege;

	// 登陆判断
	@RequestMapping("/login")
	public String login(String u_name, String u_pwd, String t_code, HttpSession session, HttpServletResponse res)
			throws IOException {
		User loginUser = IUser.getUserByname(u_name);
		String vccode = (String) session.getAttribute("session_vcode");
		res.setCharacterEncoding("utf-8");
		System.out.println(loginUser);
		// 异步验证-->只验证用户名
		if (loginUser != null && u_pwd == null && t_code == null) {
			System.out.println("u_name=" + u_name);
			PrintWriter out = res.getWriter();
			out.print("√");
			out.flush();
			out.close();
		} else if (loginUser == null && u_pwd == null && t_code == null) {
			PrintWriter out = res.getWriter();
			out.print("×");
			out.flush();
			out.close();
		}

		// 登陆验证
		if (loginUser != null && u_pwd != null && t_code != null) {
			if (loginUser.getU_pwd().equals(u_pwd) && vccode.equals(t_code)) {
				int r_id = loginUser.getR_id();
				System.out.println("+=========" + IPrivilege);
				List<Privilege> privilegeList = IPrivilege.getPrivilegeByR_id(r_id);
				System.out.println(privilegeList);
				session.setAttribute("loginUser", loginUser);
				session.setAttribute("privilegeList", privilegeList);
				System.out.println(loginUser);
				return "redirect:/main.jsp";
			}
		}
		return "/Jsp/login.jsp";
	}

	// 获取验证码
	@RequestMapping("/getImage")
	public void getImage(HttpServletRequest req, HttpServletResponse res) throws IOException {
		VerifyCode vc = new VerifyCode();
		BufferedImage image = vc.getImage();
		req.getSession().setAttribute("session_vcode", vc.getText());
		VerifyCode.output(image, res.getOutputStream());
	}
}
