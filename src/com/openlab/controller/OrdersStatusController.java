package com.openlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.service.OrdersStatusImpl;

@Controller
@RequestMapping("/OrdersStatusController")
public class OrdersStatusController {
	@Autowired
	OrdersStatusImpl OrdersStatusImpl;
	@RequestMapping("/updateOrdersStatus")
	public String updateOrdersStatus(int o_id,int od_id,String od_status){
		OrdersStatusImpl.updateOrdersdetailStatus(od_id, od_status);
		OrdersStatusImpl.updateOrdersStatus(o_id, od_status);
		return "/ManagerController/findAllOrdersDetail.action";
	}
}
