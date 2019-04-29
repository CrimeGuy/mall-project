<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userInfo.jsp' starting page</title>
    
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
			text-align: center;
		}
		table{
			width:700px;
		}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
  	<h3>用户信息</h3>
    <center>
	    <table border="1px" cellpadding="0px" cellspacing="0px" width="300px">
	    	<tr>
	    		<td>用户ID</td>
	    		<td colspan="2">${loginUser.u_id}</td>
	    	</tr>
	    	<tr>
	    		<td>用户密码</td>
	    		<td>${loginUser.u_pwd}</td><td><a href="${pageContext.request.contextPath}/Jsp/updatePwd.jsp">修改</a></td>
	    	</tr>
	    	<tr>
	    		<td>用户名</td>
	    		<td>${loginUser.u_name}</td><td><a href="${pageContext.request.contextPath}/Jsp/updateUserName.jsp">修改</a></td>
	    	</tr>
	    	<tr>
	    		<td>联系电话</td>
	    		<td>${loginUser.u_phone}</td><td><a href="${pageContext.request.contextPath}/Jsp/updateUserPhone.jsp">修改</a></td>
	    	</tr>
	    	<tr>
	    		<td>地址</td>
	    		<td>${loginUser.u_address}</td><td><a href="${pageContext.request.contextPath}/Jsp/updateUserAddress.jsp">修改</a></td>
	    	</tr>
	    	<tr>
	    		<td>角色ID</td>
	    		<td colspan="2">${loginUser.r_id}</td>
	    	</tr>
	    </table>
    </center>
  </body>
</html>
