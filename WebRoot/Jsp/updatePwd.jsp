<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatePwd.jsp' starting page</title>
    
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
			var u_pwd = document.getElementById("u_pwd").value;
			var reNewPwd = document.getElementById("reNewPwd").value;
			var spreu_pwd = document.getElementById("spreu_pwd");
			var spu_pwd = document.getElementById("spu_pwd");
			var flag = false;
			if(u_pwd.length>=8&&u_pwd.length<=10&&u_pwd==reNewPwd){
				flag = true;
				spreu_pwd.innerHTML= "";
				spu_pwd.innerHTML= "";
			}else if(u_pwd!=reNewPwd){
				spreu_pwd.innerHTML="两次输入的密码不同！";
			}else if(u_pwd.length<8||u_pwd.length>10){
				spu_pwd.innerHTML="至少八位以上十位以下字符";
			}
			return flag;
		}
	</script>
	<style type="text/css">
		span{
			font-size: 15px;
			color:red;
		}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
  <h3>请修改密码</h3>
    <form action="${pageContext.request.contextPath}/UserController/updatePwd.action" method="post" onsubmit="return abc()">
    	<table>
    		<tr>
	    	<td>请输入新密码:</td>
	    	<td><input type="password" name="u_pwd" id="u_pwd"/><span id="spu_pwd"></span></td>
	    	</tr>
	    	<tr>
	    	<td>请确认密码:</td>
	    	<td><input type="password" name="reNewPwd" id="reNewPwd"/><span id="spreu_pwd"></span></td>
	    	</tr>
	    	<tr>
	    		<td colspan="2"><center><input type="submit" value="提交"/></center></td>
	    	</tr>
    	</table>
    </form>
  </body>
</html>
