package com.openlab.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.Goods;
import com.openlab.service.IGoods;
import com.openlab.util.PageGoods;

@Controller
@RequestMapping("/ShowGoodsController")
public class ShowGoodsController {
	@Autowired
	IGoods IGoods;

	@RequestMapping("/getPageGoods")
	public String getPageGoods(String currentPage,HttpSession session){
		int intCurrentPage = 0;
		PageGoods<Goods> page= null;
		if(currentPage==null){
			intCurrentPage = 1;
			page = IGoods.pageMethod(intCurrentPage);
		}else{
			intCurrentPage = Integer.parseInt(currentPage);
			page = IGoods.pageMethod(intCurrentPage);
		}
		
		session.setAttribute("page", page);
		return "/Jsp/firstPage.jsp";
	}
	
	@RequestMapping("/getGoodsDetailByU_id")
	public String getGoodsDetailByU_id(int g_id,HttpSession session){
		Goods goodsDetail = IGoods.getGoodsDetailByG_id(g_id);
		session.setAttribute("goodsDetail", goodsDetail);
		return "/Jsp/showGoodsDetail.jsp";
	}
	
}
