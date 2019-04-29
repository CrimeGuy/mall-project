package com.openlab.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.Car;
import com.openlab.bean.Goods;
import com.openlab.bean.User;
import com.openlab.service.ICar;
import com.openlab.util.PageGoods;
@Controller
@RequestMapping("/AddCarController")
public class AddCarController {
	
	@Autowired
	 ICar ICar;
	
	//�����Ʒ�����ﳵ
	@RequestMapping("/addCar")
	public String addCar(int g_id,HttpSession session){
		User user = (User) session.getAttribute("loginUser");
		PageGoods<Goods> page = (PageGoods<Goods>)session.getAttribute("page");
		List<Goods> goodsList = page.getGlist();
		Car car = ICar.getCarByU_id(user.getU_id(), g_id);//�����û�id����Ʒid���ң�Ϊ��ȷ�������Ʒ�Ƿ������ӹ��ﳵ
		Goods g = null;
		for (Goods good: goodsList) {
			if(good.getG_id()==g_id){
				g = good;
				break;
			}
		}
		if(car==null){
			car = new Car(0,g.getG_money(),1,g.getG_name(),g.getG_image(),g.getG_status(),g.getG_id(),user.getU_id(),g.getG_money());
			ICar.addCarFirst(car);
		}else{
			System.out.println(car.getC_id());
			System.out.println(car.getC_num()+1);
			ICar.updateCar(car.getC_id(), car.getC_num()+1,car.getC_money()*(car.getC_num()+1));
		}
		return "/Jsp/addCarSuccess.jsp";
	}
	//�����û�id��ѯ���ﳵ��������Ʒ
	@RequestMapping("/getAllCarByU_id")
	public String getAllCarByU_id(HttpSession session){
		User user = (User) session.getAttribute("loginUser");
		List<Car> carList = ICar.getAllCarByU_id(user.getU_id());
		session.setAttribute("carList", carList);
		return "/Jsp/showCar.jsp";
	}
	//��Ʒ�Ƴ����ﳵ
	@RequestMapping("/deleteCarByC_id")
	public String deleteCarByC_id(int c_id){
		ICar.deleteCarByC_id(c_id);
		return "getAllCarByU_id.action";
	}
	
	//����ɾ��
	@RequestMapping("/deleteBatch")
	public String deleteBatch(String[] c_ids){
		for(int i=0;i<c_ids.length;i++){
			int c_id = Integer.parseInt(c_ids[i]);
			ICar.deleteCarByC_id(c_id);
		}
		return "getAllCarByU_id.action";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
