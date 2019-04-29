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
    
    <title>My JSP 'showAllOrdersDetailByManager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#ccffff">
  <h3>订单表</h3>
    <table border="1px" cellpadding="0px" cellspacing="0px">
    	<tr>
    		<th>订单详情ID</th>
    		<th>订单数量</th>
    		<th>商品单价</th>
    		<th>总额</th>
    		<th>收货信息</th>
    		<th>商品ID</th>
    		<th>订单ID</th>
    		<th>订单状态</th>
    		<th>操作</th>
    	</tr>
    	
    	<c:forEach items="${AllOrdersDetail}" var="OrdersDetail">
    		<tr>
    			<td>${OrdersDetail.od_id}</td>
    			<td>x${OrdersDetail.od_num}</td>
    			<td>${OrdersDetail.od_money}</td>
    			<td>${OrdersDetail.od_totalmoney}</td>
    			<td>${OrdersDetail.od_adddress}</td>
    			<td>${OrdersDetail.g_id}</td>
    			<td>${OrdersDetail.o_id}</td>
    			<td>${OrdersDetail.od_status}</td>
    			<td>
    				<a href="${pageContext.request.contextPath}/OrdersStatusController/updateOrdersStatus.action?o_id=${OrdersDetail.o_id}&od_id=${OrdersDetail.od_id}&od_status=已发货">发货</a>||
    				<a href="${pageContext.request.contextPath}/OrdersStatusController/updateOrdersStatus.action?o_id=${OrdersDetail.o_id}&od_id=${OrdersDetail.od_id}&od_status=等待处理">等待处理</a>
    			</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
