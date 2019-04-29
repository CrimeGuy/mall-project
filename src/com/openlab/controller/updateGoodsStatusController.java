package com.openlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.service.IGoodsStatus;

@Controller
@RequestMapping("/updateGoodsStatusController")
public class updateGoodsStatusController {
	@Autowired
	IGoodsStatus IGoodsStatus;
	@RequestMapping("/updateGoodsStatus")
	public String updateGoodsStatus(int g_id,String g_status){
		IGoodsStatus.updateGoodsStatus(g_id, g_status);
		IGoodsStatus.updateCarStatus(g_id, g_status);
		return "/ManagerController/findAllGoods.action";
	}
}
