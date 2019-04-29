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
    
    <title>My JSP 'OrdersDetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	img{
		width:100px;
		height:100px;
	}
	
	#div1{
		position: absolute;
		margin-top: 100px;
		margin-left: 800px;
	}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
  	<a href="${pageContext.request.contextPath}/ShowGoodsController/getPageGoods.action">返回首页</a>
  	<h4>订单详情</h4>
    <table>
    		<c:forEach items="${allOrdersdetail}" var="Ordersdetail">
	    		<tr>
	    			<td>订单编号：${Ordersdetail.o_id}</td>
	    		</tr>
	    		<tr>
	    			<td><img src="./image/${Ordersdetail.goods.g_image}"/></td>
	    			<td width="300px">型号:${Ordersdetail.goods.g_name}</td>
	    			<td width="100px">数量:x${Ordersdetail.od_num}</td>
	    			<td width="100px">价格:￥${Ordersdetail.od_totalmoney}</td>
	    			<td>状态:${Ordersdetail.od_status}</td>
	    		</tr>
    		</c:forEach>
    </table>
    <div id="div1">
    	总额:￥${OrdersTotalmoney}
    </div>
  </body>
</html>
