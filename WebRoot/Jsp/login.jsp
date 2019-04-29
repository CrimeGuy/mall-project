<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
	<link rel="stylesheet" type="text/css" href="../jq/jquery-easyui-1.2.6/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../jq/jquery-easyui-1.2.6/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../jq/jquery-easyui-1.2.6/demo/demo.css">
	<script type="text/javascript" src="../jq/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="../jq/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<style>
		.toolbar{
			height:30px;
			padding:5px;
		}
	</style>
	<script>
		function enable(){
			$('a.easyui-linkbutton').linkbutton('enable');
		}
		function disable(){
			$('a.easyui-linkbutton').linkbutton('disable');
		}
		function changetext(){
			$('#add').linkbutton({text:'new add'});
		}
	</script>
	<script>
		function enable(){
			$('a.easyui-linkbutton').linkbutton('enable');
		}
		function disable(){
			$('a.easyui-linkbutton').linkbutton('disable');
		}
		function changetext(){
			$('#add').linkbutton({text:'new add'});
		}
	</script>
<script type="text/javascript"
	src="jq/jquery-easyui-1.2.6/jquery-1.11.1.js"></script>
<script type="text/javascript">
	function _change() {
		var imagesEle = document.getElementById("images");
		imagesEle.src = "${pageContext.request.contextPath}/LoginController/getImage.action?a=" + new Date().getTime();
	}

	$(document).ready(function() {
		var sp = $("#sp");
		$("#username").blur(function() {
			$.ajax({
				type : "GET",
				url : "${pageContext.request.contextPath}/LoginController/login.action?u_name=" + $("#username").val(),
				dataType : "text",
				success : function(data) {
					if(data=="×"){
						$("#sp").text(data);
						$("#sp").css("color","red");
					}
					else if(data=="√"){
						$("#sp").text(data);
						$("#sp").css("color","green");
					}
				}
			});
		});
	});
	
	
</script>
<style type="text/css">
	.toolbar{
			height:30px;
			padding:5px;
		}
	td{
		height:50px;
		width: 110px
	}
	#div1{
		position: absolute;
		margin-left: 420;
		margin-top: 200; 
		background-color: silver;
		width: 430px;
	}
	.clas1{
		text-align: right;	
	}
	table{
		position: relative;
		margin-top: 20px;
	}
	
	a{
		text-decoration:none;/* 去掉下划线 */
		color:black;
	}
	span{
		font-size:13px;
		color: red;
	}
</style>
</head>

<body bgcolor="#ccffff">
	<div id="div1" align="center">
		<form
			action="${pageContext.request.contextPath}/LoginController/login.action"
			method="post">
			<table border="0" cellpadding="0" cellspacing="0" width="430px" height="200px">
				<tr>
					<th colspan="3">登陆</th>
				</tr>
				<tr>
					<td class="clas1">用户名:</td>
					<td colspan="2"><input type="text" name="u_name" id="username" /><span
						id="sp"></span></td>
				</tr>
				<tr>
					<td class="clas1">密&nbsp;&nbsp;&nbsp;码:</td>
					<td colspan="2"><input type="password" name="u_pwd" /></td>
				</tr>
				<tr>
					<td class="clas1">验证码:</td>
					<td><input type="text" name="t_code" /> </td>
					<td><a
						href="javascript:_change()"><img
							src="${pageContext.request.contextPath}/LoginController/getImage.action"
							id="images" /></a></td>
				</tr>
				<tr>
					<td colspan="3"><center><input type="submit" value="登陆" />
					
					<a
						href="${pageContext.request.contextPath}/Jsp/register.jsp"><input
							type="button" value="注册" /></a>
							<%-- <a href="${pageContext.request.contextPath}/Jsp/register.jsp" class="easyui-linkbutton" >注册</a> --%>
							</center></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
