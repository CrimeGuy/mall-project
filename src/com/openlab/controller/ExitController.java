package com.openlab.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ExitController")
public class ExitController {
	@RequestMapping("/exit")
	public String exit(HttpSession session){
		session.invalidate();
		return "/Jsp/login.jsp";
	}
}
