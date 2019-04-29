package com.openlab.controller;


import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TotalMoneyController")
public class TotalMoneyController {
	public static int Totalmoney=0;
	@RequestMapping("/TotalMoney")
	public String TotalMoney(int c_money,String c_name,int c_num,HttpSession session){
		HashMap<String, Integer> mapList = (HashMap<String, Integer>) session.getAttribute("mapList");
		if(mapList==null){
			mapList = new HashMap<String, Integer>();
			mapList.put(c_name,1);
			System.out.println("=========="+mapList);
		}else if(mapList.containsKey(c_name)){
			int num = mapList.get(c_name);
			mapList.put(c_name,num+1);
		}else if(!mapList.containsKey(c_name)){
			mapList.put(c_name, 1);
		}
		session.setAttribute("mapList", mapList);
		System.out.println(mapList.get(c_name));
		if(mapList.get(c_name)%2==0){
			Totalmoney=Totalmoney-c_money*c_num;
			session.setAttribute("checked", null);
		}else{
			Totalmoney=Totalmoney+c_money*c_num;
			String checked = "checked";
			session.setAttribute("checked", checked);
		}
		session.setAttribute("Totalmoney", Totalmoney);
		return "/Jsp/showCar.jsp";
	}
}
