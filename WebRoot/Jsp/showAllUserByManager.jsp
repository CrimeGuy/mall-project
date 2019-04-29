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
    
    <title>My JSP 'showAllUser.jsp' starting page</title>
    
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
			width:1000px;
			
		}
		td{
			text-align: center;
			
		}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
    <h3>用户信息</h3>
    <table border="1px" cellpadding="0px" cellspacing="0px">
    	<tr>
    		<th>用户ID</th>
    		<th>用户密码</th>
    		<th>用户名</th>
    		<th>联系电话</th>
    		<th>用户地址</th>
    		<th>权限ID</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${AllUser}" var="user">
    	<tr>
    		<td>${user.u_id}</td>
    		<td>${user.u_pwd}</td>
    		<td>${user.u_name}</td>
    		<td>${user.u_phone}</td>
    		<td>${user.u_address}</td>
    		<td>${user.r_id}</td>
    		<td id="caozuo">
    			<a href="${pageContext.request.contextPath}/updateRoleController/findUserByU_id.action?u_id=${user.u_id}">修改角色</a> ||
    			<a href="${pageContext.request.contextPath}/DeleteUserController/deleteUser.action?u_id=${user.u_id}">删除用户</a>
    		</td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>
