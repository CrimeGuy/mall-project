package com.openlab.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.Goods;
import com.openlab.bean.Ordersdetail;
import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.service.IManager;
import com.openlab.util.PageGoods;

@Controller
@RequestMapping("/ManagerController")
public class ManagerController {
	@Autowired
	IManager IManager;

	@RequestMapping("/findAllRole")
	public String findAllRole(HttpServletRequest request) {
		List<Role> roleList = IManager.findAllRole();
		System.out.println(roleList);
		request.setAttribute("roleList", roleList);
		return "/Jsp/showAllRoleByManager.jsp";
	}
	
	@RequestMapping("/findAllUser")
	public String findAllUser( HttpServletRequest request){
		List<User> AllUser = IManager.findAllUser();
		request.setAttribute("AllUser", AllUser);
		return "/Jsp/showAllUserByManager.jsp";
	}
	
	@RequestMapping("/findAllGoods")
	public String findAllGoods(HttpServletRequest request,String currentPage){
		int intcurrentPage = 0;
		PageGoods<Goods> pageGoods = null;
		if(currentPage==null){
			intcurrentPage=1;
			pageGoods = IManager.findAllGoods(intcurrentPage);
		}else{
			System.out.println(currentPage);
			intcurrentPage = Integer.parseInt(currentPage);
			pageGoods = IManager.findAllGoods(intcurrentPage);
		}
		request.setAttribute("pageGoods", pageGoods);
		return "/Jsp/showAllGoodsByManager.jsp";
		/*List<Goods> AllGoods = IManager.findAllGoods();
		request.setAttribute("AllGoods", AllGoods);
		return "/Jsp/showAllGoodsByManager.jsp";*/
	}
	
	@RequestMapping("/findAllOrdersDetail")
	public String findAllOrdersDetail(HttpServletRequest request){
		List<Ordersdetail> AllOrdersDetail = IManager.findAllOrdersDetail();
		request.setAttribute("AllOrdersDetail", AllOrdersDetail);
		return "/Jsp/showAllOrdersDetailByManager.jsp";
	}
}
