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
    
    <title>My JSP 'showAllGoodsByManager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	table{
		width:950px;
	}
	td{
		width:130px;
	}
	.claimage{
		width:300px;
	}
	
	#divspan{
		margin-top: 50px;
	}
</style>
  </head>
  
  <body bgcolor="#ccffff">
   	<h3>商品管理</h3>
   	<h4><a href="${pageContext.request.contextPath}/Jsp/uploadGoodsByManager.jsp">上架商品</a></h4>
   	<center>
   	<table border="1px" cellpadding="0px" cellspacing="0px">
   		<tr>
   			<th>商品ID</th>
   			<th>商品价格</th>
   			<th>商品名称</th>
   			<th>图片链接</th>
   			<th>商品状态</th>
   			<th>更改状态</th>
   		</tr>
   		<c:forEach items="${pageGoods.glist}" var="goods">
   			<tr>
   				<td>${goods.g_id}</td>
   				<td>￥${goods.g_money}</td>
   				<td>${goods.g_name}</td>
   				<td class = "claimage">${goods.g_image}</td>
   				<td>${goods.g_status}</td>
   				<td><a href="${pageContext.request.contextPath}/updateGoodsStatusController/updateGoodsStatus.action?g_id=${goods.g_id}&g_status=缺货&currentPage=${pageGoods.currentPage}">缺货</a>
   				|| <a href="${pageContext.request.contextPath}/updateGoodsStatusController/updateGoodsStatus.action?g_id=${goods.g_id}&g_status=正常销售&currentPage=${pageGoods.currentPage}">正常销售</a></td>
   			</tr>
   		</c:forEach>
   	</table>
   	</center>
   	<div id = "divspan">
   		<center>
		    <a href="${pageContext.request.contextPath}/ManagerController/findAllGoods.action"><span>首页</span></a>
			<c:if test="${pageGoods.currentPage!=1}">
				<a href="${pageContext.request.contextPath}/ManagerController/findAllGoods.action?currentPage=${pageGoods.currentPage-1}"><span>上一页</span></a>
			</c:if>
			<c:if test="${pageGoods.currentPage!=page.pageTotal}">
				<a href="${pageContext.request.contextPath}/ManagerController/findAllGoods.action?currentPage=${pageGoods.currentPage+1}"><span>下一页</span></a>
			</c:if>
			<a href="${pageContext.request.contextPath}/ManagerController/findAllGoods.action?currentPage=${pageGoods.pageTotal}"><span>末页</span></a>
			<span>页数：${pageGoods.currentPage}/${pageGoods.pageTotal}</span>
		</center>
   	</div>
  </body>
</html>
