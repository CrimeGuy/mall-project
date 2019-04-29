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
    
    <title>My JSP 'firstPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery-1.11.1.js"></script>
	<script type="text/javascript">
		$("document").ready(function(){
			$("img").mouseover(function(){
				$(this).fadeTo(10,0.4);
			});
			$("img").mouseout(function(){
				$(this).fadeTo(10,1);
			});
		});
	</script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#row{
			width:1000px;
			height:450px;
			position: absolute;
			margin-top: 50px;
			margin-left: 30px;
		}
		#divsp{
			position: absolute;
			margin-top: 530px;
			margin-left: 470px;
		}
		.part{
			width:200px;
			height:150px;
			float:left;
		}
		span{
			font-size:10px;
		}
	</style>
  </head>
  
  <body>
  <center>
  	<div id="row">
    <c:forEach items="${page.glist}" var="goods">
    	<div class="part">
    		<a href = "${pageContext.request.contextPath}/ShowGoodsController/getGoodsDetailByU_id.action?g_id=${goods.g_id}"><img src="./image/${goods.g_image}" width="100px" height="100px"></a><br>
    		<span>${goods.g_name}</span>&nbsp;&nbsp;<span>￥${goods.g_money}</span><br>
    		<a href="${pageContext.request.contextPath}/AddCarController/addCar.action?g_id=${goods.g_id}"><span>加入购物车</span></a> 
    	</div>
    </c:forEach>
    </div>
    <div id="divsp">
    	<center>
		    <a href="${pageContext.request.contextPath}/ShowGoodsController/getPageGoods.action"><span>首页</span></a>
			<c:if test="${page.currentPage!=1}">
				<a href="${pageContext.request.contextPath}/ShowGoodsController/getPageGoods.action?currentPage=${page.currentPage-1}"><span>上一页</span></a>
			</c:if>
			<c:if test="${page.currentPage!=page.pageTotal}">
				<a href="${pageContext.request.contextPath}/ShowGoodsController/getPageGoods.action?currentPage=${page.currentPage+1}"><span>下一页</span></a>
			</c:if>
			<a href="${pageContext.request.contextPath}/ShowGoodsController/getPageGoods.action?currentPage=${page.pageTotal}"><span>末页</span></a>
			<span>页数：${page.currentPage}/${page.pageTotal}</span>
		</center>
	</div>
	 </center>
	 
  </body>
</html>
