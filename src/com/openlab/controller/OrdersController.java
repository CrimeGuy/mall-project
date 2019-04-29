package com.openlab.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.bean.Car;
import com.openlab.bean.Orders;
import com.openlab.bean.Ordersdetail;
import com.openlab.bean.User;
import com.openlab.service.OrdersImpl;

@Controller
@RequestMapping("/OrdersController")
public class OrdersController {
	@Autowired
	OrdersImpl OrdersImpl;

	@RequestMapping("/toSubmitOrder")
	public String toSubmitOrder(String totalmoney, String[] c_ids, HttpServletRequest request) {
		System.out.println(totalmoney);
		for (int i = 0; i < c_ids.length; i++) {
			System.out.println(c_ids[i]);
		}
		List<Car> OrdersCarList = new ArrayList<Car>();
		for (int i = 0; i < c_ids.length; i++) {
			int c_id = Integer.parseInt(c_ids[i]);
			System.out.println(c_id);
			Car ordersCar = OrdersImpl.getOrdersCarByC_id(c_id);
			OrdersCarList.add(ordersCar);
			OrdersImpl.deleteOrdersCarByC_id(c_id);// �ύ����ʱͬʱɾ�����ﳵ�е���Ʒ
		}
		request.getSession().setAttribute("OrdersTotalmoney", totalmoney);//��Ӷ�����Ҳ��Ҫ�õ�
		request.getSession().setAttribute("OrdersCarList", OrdersCarList);

		return "/Jsp/submitOrder.jsp";
	}

	// ��Ӷ���
	@RequestMapping("/addOrders")
	public String addOrders(String address, String aname, String aphone, HttpSession session) {
		String o_address = address + "," + aname + "," + aphone;
		int o_totalmoney = Integer.parseInt((String) session.getAttribute("OrdersTotalmoney"));
		User user = (User) session.getAttribute("loginUser");
		String u_id = user.getU_id();
		Date date = new Date();
		System.out.println(date);
		String o_time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);// ��ȡʱ��
		Orders orders = new Orders(o_totalmoney, o_address, o_time, "�ȴ�����", u_id);
		OrdersImpl.addOrders(orders);// ��Ӷ���֮�����ϲ�ѯ���ݿ��е����������Ի�ñ������Ķ������
		int o_id = OrdersImpl.getMaxO_id();
		System.out.println(o_id);
		session.setAttribute("orders", orders);// ��Ӷ�������Ҫ�õ� ֧���ɹ���Ĳ鿴����Ҫ�õ�
		session.setAttribute("ordersO_id", o_id);
		System.out.println(orders);
		return "addOrdersdetail.action?o_id=" + o_id;
	}

	// ��Ӷ�������
	@RequestMapping("/addOrdersdetail")
	public String addOrdersdetail(HttpSession session, int o_id) {
		Orders orders = (Orders) session.getAttribute("orders");
		String o_address = orders.getO_address();
		List<Car> OrdersCarList = (List<Car>) session.getAttribute("OrdersCarList");
		for (Car car : OrdersCarList) {
			Ordersdetail Ordersdetail = new Ordersdetail(car.getC_num(), car.getC_money(), car.getTotalmoney(),
					o_address, "�ȴ�����", o_id, car.getG_id());
			OrdersImpl.addOrdersdetail(Ordersdetail);
		}

		return "/Jsp/paySuccess.jsp";
	}

	@RequestMapping("/getAllOrdersdetailByO_id")//֧���ɹ���Ķ�������
	public String getAllOrdersdetailByO_id(int o_id, HttpServletRequest request) {
		System.out.println(o_id);
		List<Ordersdetail> allOrdersdetail = OrdersImpl.getAllOrdersdetailByO_id(o_id);
		System.out.println(allOrdersdetail);
		request.setAttribute("allOrdersdetail", allOrdersdetail);
		return "/Jsp/ordersDetail.jsp";
	}
	
	@RequestMapping("/getAllOrdersByU_id")
	public String getAllOrdersByU_id(String u_id,HttpServletRequest request){
		List<Orders> allOrders = OrdersImpl.getAllOrdersByU_id(u_id);
		request.setAttribute("allOrders", allOrders);
		return "/Jsp/showAllOrders.jsp";
	}
	
	@RequestMapping("/getOrderByO_id")//����ҳ�浽��������
	public String getOrderByO_id(int o_id,int o_totalmoney,HttpServletRequest request){
		System.out.println(o_id);
		List<Ordersdetail> allOrdersdetail = OrdersImpl.getAllOrdersdetailByO_id(o_id);
		System.out.println(allOrdersdetail);
		request.setAttribute("allOrdersdetail", allOrdersdetail);
		request.setAttribute("o_totalmoney", o_totalmoney);
		return "/Jsp/showOrdersDetailfromOrders.jsp";
	}
	//ɾ������ҳ���е�ĳ������
	@RequestMapping("/deleteOrderByO_id")
	public String deleteOrderByO_id(int o_id,String u_id){
		OrdersImpl.deleteOrdersDetailByO_id(o_id);
		OrdersImpl.deleteOrderByO_id(o_id);
		return "/Jsp/deleteOrderSuccess.jsp";
	}
	
}
