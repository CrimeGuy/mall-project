<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'register.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function abc() {
		var u_name = document.getElementById("u_name").value;
		var u_pwd = document.getElementById("u_pwd").value;
		var re_pwd = document.getElementById("re_pwd").value;
		var u_phone = document.getElementById("u_phone").value;
		var u_address = document.getElementById("u_address").value;
		var spu_pwd = document.getElementById("spu_pwd");
		var spre_pwd = document.getElementById("spre_pwd");
		var spu_phone = document.getElementById("spu_phone");
		var spu_address = document.getElementById("spu_address");
		var spu_name = document.getElementById("spu_name");
		var num = 0;
		var flag = false;
		if(u_name==""||u_name==null){
			spu_name.innerHTML = "用户名不得为空！";
		}else{
			num++;
		}
		if (u_pwd != re_pwd) {
			spre_pwd.innerHTML = "两次输入的密码不一致";
		} else if (u_pwd.length <= 8||u_pwd.length>10) {
			spu_pwd.innerHTML = "至少八位以上十位以下字符";
		}else if(u_pwd==""){
			spu_pwd.innerHTML = "密码不得为空！";
		}else {
			spu_pwd.innerHTML = "√";
			spu_pwd.style.color = "green";
			spre_pwd.innerHTML = "";
			num++;
		}
		if (u_phone.length!=11) {
			spu_phone.innerHTML = "请输入11位手机号";
		} else {
			spu_phone.innerHTML = "√";
			spu_phone.style.color = "green";
			num++;
		}
		if (u_address.length < 10||u_address>15) {
			spu_address.innerHTML = "请输入长度大于10位小于15位有效地址";
		}else if(u_address == ""){
			spu_address.innerHTML = "地址不得为空！";
		} 
		else {
			spu_address.innerHTML = "√";
			spu_address.style.color = "green";
			num++;
		}
		if (num == 4) {
			flag = true;
		}
		return flag;
	}
	var xhr;
	function creatxhr() {
		if (window.XMLHttpRequest) {
			xhr = new XMLHttpRequest();
		} else {
			xhr = new ActiveXObject("Msxml2.XMLHTTP");
		}
	}
	function bcd() {
		creatxhr();
		var spu_name = document.getElementById("spu_name");
		var u_name = document.getElementById("u_name").value;
		
		xhr.open("POST", "${pageContext.request.contextPath}/registerController/registerAjax.action", true);
		xhr.setRequestHeader("content-Type", "application/x-www-form-urlencoded");
		xhr.send("u_name=" + u_name);
		xhr.onreadystatechange = function() {
			if(u_name==""||u_name==null){
				spu_name.innerHTML = "用户名不得为空！";
			}
			if (xhr.status == 200 && xhr.readyState == 4) {
				if (xhr.responseText == "1") {
					spu_name.innerHTML = "用户名已存在！";
				} else if (xhr.responseText == "2") {
					spu_name.innerHTML = "用户名可用！";
					spu_name.style.color = "green";
				}else if(xhr.responseText == "3"){
					spu_name.innerHTML = "请输入十位以下字符！";
				}else if(xhr.responseText == "4"){
					spu_name.innerHTML = "用户名不得为空！";
				}
			}
		}
	}
</script>

<style type="text/css">
span {
	color: red;
	font-size: 10px;
}

table {
	width: 500px;
	height: 200px;
}

.cls1 {
	text-align: center;
}

.cls2 {
	text-align: left;
}
</style>
</head>

<body bgcolor="#ccffff">
	<form
		action="${pageContext.request.contextPath}/registerController/register.action"
		method="post" onsubmit="return abc()">
		<table border="1px" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<th colspan="2"><center>注册</center></th>
			</tr>
			<tr>
				<td class="cls1">用户名</td>
				<td class="cls2"><input type="text" name="u_name" id="u_name"
					onblur="bcd()" /><span id="spu_name"></span></td>
			</tr>
			<tr>
				<td class="cls1">密码</td>
				<td class="cls2"><input type="password" name="u_pwd" id="u_pwd" /><span
					id="spu_pwd"></span></td>
			</tr>
			<tr>
				<td class="cls1">确认密码</td>
				<td class="cls2"><input type="password" id="re_pwd" /><span
					id="spre_pwd"></span></td>
			</tr>
			<tr>
				<td class="cls1">手机号</td>
				<td class="cls2"><input type="text" name="u_phone" id="u_phone" /><span
					id="spu_phone"></span></td>
			</tr>
			<tr>
				<td class="cls1">地址</td>
				<td class="cls2"><input type="text" name="u_address"
					id="u_address" /><span id="spu_address"></span></td>
			</tr>
			<tr>
				<td colspan="2"><center>
						<input type="submit" value="提交" />
					</center></td>
			</tr>
		</table>
	</form>
</body>
</html>
