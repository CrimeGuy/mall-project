<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'submitOrder.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function abc(){
			var username = document.getElementById("username").value;
			var userphone = document.getElementById("userphone").value;
			var uaddress = document.getElementById("uaddress").value;
			var spname = document.getElementById("spname");
			var	spphone = document.getElementById("spphone");
			var spaddress = document.getElementById("spaddress");
			var num = 0;
			var flag = false;
			if(username.length>0){
				num++;
			}else{
				spname.innerHTML="请输入联系人";
			}
			if(userphone.length==11){
				num++;
			}else{
				spphone.innerHTML="请输入正确的联系电话";
			}
			if (uaddress.length < 10||uaddress>15) {
				spaddress.innerHTML = "请输入长度大于10位小于15位有效地址";
			}else if(uaddress == ""||uaddress==null){
				spaddress.innerHTML = "地址不得为空！";
			} 
			else {
				spaddress.innerHTML = "√";
				spaddress.style.color = "green";
				num++;
			}
			if(num==3){
				flag = true;
			}
			return flag;
		}
	</script>
	<style type="text/css">
		span{
			font-size: 10px;
			color: red;
		}
		#tds{
			position: absolute;
			margin-left: 100px;
		}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
  	<h4>请填写收货信息</h4>
    <form action="${pageContext.request.contextPath}/OrdersController/addOrders.action" method="post" onsubmit="return abc()">
    	<table>
    		<tr>
    			<td>联系人姓名:</td>
    			<td><input type="text" value="${loginUser.u_name}" name="aname" id="username"/><span id="spname"></span></td>
    		</tr>
    		<tr>
    			<td>联系电话:</td>
    			<td><input type="text" value="${loginUser.u_phone}" name="aphone" id="userphone"/><span id="spphone"></span></td>
    		</tr>
    		<tr>
    			<td>收货地址:</td>
    			<td><input type="text" name="address" id="uaddress"/><span id="spaddress"></span></td>
    		</tr>
    		<tr>
    			<td colspan="2" id="tds">
    				<center><input type="submit" value="立即支付:"/>￥${OrdersTotalmoney}</center>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
