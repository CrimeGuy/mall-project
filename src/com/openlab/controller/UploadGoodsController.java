package com.openlab.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.openlab.bean.Goods;
import com.openlab.service.IUploadGoods;

@Controller
@RequestMapping("/UploadGoodsController")
public class UploadGoodsController {
	@Autowired
	IUploadGoods iUploadGoods;
	@RequestMapping("/uploadGoods")
	public String uploadGoods(String g_name,int g_money,MultipartFile image,HttpServletRequest request) throws IllegalStateException, IOException{
		Goods goods = new Goods();
		System.out.println(image);
		String g_image = image.getOriginalFilename();
		goods.setG_name(g_name);
		goods.setG_money(g_money);
		goods.setG_image(g_image);
		goods.setG_status("正常销售");
		iUploadGoods.uploadGoods(goods);
	
		File f = new File("/usr/local/apache-tomcat-8.5.39/webapps/mall-project/image/"+g_image);
		image.transferTo(f);
		//C:/Users/83763/Desktop/myworkspace/mall-project/WebRoot/image
		///usr/local/apache-tomcat-8.5.39/webapps/mall-project/image/
		return "/ManagerController/findAllGoods.action";
	}
}
