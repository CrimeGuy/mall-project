<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showAllOrders.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		td{
			height: 50px;
			width:300px;
			text-align: center;
		}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
  	<a href="${pageContext.request.contextPath}/ShowGoodsController/getPageGoods.action">继续浏览</a>
   	<h3>我的订单</h3>
   	<table border="1px" cellpadding="0px" cellspacing="0px">
   		<c:forEach items="${allOrders}" var="orders">
   			<tr>
   				<td>
   					订单编号:${orders.o_id}
   				</td>
   				<td>下单时间:<br>
   				${orders.o_time}</td>
   				<td>订单总额:￥${orders.o_totalmoney}</td>
   				<td rowspan="2"><a href="${pageContext.request.contextPath}/OrdersController/getOrderByO_id.action?o_id=${orders.o_id}&o_totalmoney=${orders.o_totalmoney}">订单详情</a>
   					<%-- <a href="${pageContext.request.contextPath}/OrdersController/deleteOrderByO_id.action?o_id=${orders.o_id}&u_id=${loginUser.u_id}">删除订单</a> --%>
   				</td>
   			</tr>
   			<tr>
   				<td>收货信息:</td>
   				<td colspan="2">${orders.o_address}</td>
   			</tr>
   		</c:forEach>
   	</table>
  </body>
</html>
