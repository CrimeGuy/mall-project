<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'showRole.jsp' starting page</title>

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
			height: 30px;
		}
		
		table{
			position: relative;
			margin-top: 5%;
		}
		#id1{
			text-align: left; 
		}
		
	</style>
</head>

<body bgcolor="#ccffff">
<h3>角色管理</h3>
	<h5><a href="${pageContext.request.contextPath}/DTree/addRole.jsp">添加角色</a></h5>
	<table border="1px" cellpadding="0px" align="center" cellspacing="0px">
		
		<tr>
			<td>角色ID</td>
			<td>角色名称</td>
			<td>角色描述</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${roleList}" var="role">
			<tr>
				<td>${role.r_id}</td>
				<td>${role.r_name}</td>
				<td>${role.r_describe}</td>
				<td>
					<a href="${pageContext.request.contextPath}/AddRoleController/setRole.action?r_id=${role.r_id}&r_name=${role.r_name}">修改</a>
					|| <a href="${pageContext.request.contextPath}/AddRoleController/deleteRole.action?r_id=${role.r_id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${message!=null}">
		<center><font size="3	" color="red">${message}</font></center>
	</c:if>
</body>
</html>
