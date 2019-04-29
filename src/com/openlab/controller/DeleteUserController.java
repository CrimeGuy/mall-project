package com.openlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.service.IDeleteUser;

@Controller
@RequestMapping("/DeleteUserController")

public class DeleteUserController {
	@Autowired
	IDeleteUser IDeleteUser;
	
	@RequestMapping("/deleteUser")
	public String deleteUser(String u_id){
		IDeleteUser.deleteOrdersdetail(u_id);
		IDeleteUser.deleteOrders(u_id);
		IDeleteUser.deleteCar(u_id);
		IDeleteUser.deleteUser(u_id);
		return "/ManagerController/findAllUser.action";
	}
}
