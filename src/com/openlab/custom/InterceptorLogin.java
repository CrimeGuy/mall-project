package com.openlab.custom;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.openlab.bean.User;



public class InterceptorLogin implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("loginUser");
		if(user!=null){
			return true;
		}
		String uri = request.getRequestURI();
		System.out.println(uri);
		if(uri.indexOf("LoginController")>0){
			return true;
		}
		if(uri.indexOf("registerController")>0){
			return true;
		}
		if(uri.indexOf("getImage.action")>0){
			return true;
		}
		if(uri.indexOf("getPageGoods.action")>0){
			return true;
		}
		response.sendRedirect("/mall-project/Jsp/login.jsp");
		return false;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
