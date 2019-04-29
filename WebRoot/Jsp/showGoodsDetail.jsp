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
    
    <title>My JSP 'showGoodsDetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		div{
			width:300px;
			height:300px;
			position: absolute;
			margin-top: 100px;
			margin-left: 320px;
		}
		img{
			width:300px;
			height:250px;
		}
		span{
			font-size:15px;
		}
	</style>
	</head>
  <body bgcolor="#ccffff">
	  	<div>
	   	 	<img src="./image/${goodsDetail.g_image}"/><br>
	   	 		<center>
			    	${goodsDetail.g_name}
			    	￥${goodsDetail.g_money}<br>
			    	<c:if test="${goodsDetail.g_status=='正常销售'}">
			    		<span>库存:充足</span>&nbsp;&nbsp;<br>
			    	</c:if>
			    	<c:if test="${goodsDetail.g_status=='缺货'}">
			    		<span>库存:缺货</span>&nbsp;&nbsp;<br>
			    	</c:if>
			    	<a href="${pageContext.request.contextPath}/AddCarController/addCar.action?g_id=${goodsDetail.g_id}"><span>加入购物车</span></a>
	    		</center>
	    		
	    </div>
  </body>
</html>
