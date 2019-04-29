<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateUserPhone.jsp' starting page</title>
    
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
			var u_phone = document.getElementById("u_phone").value;
			var spu_phone = document.getElementById("spu_phone");
			var flag = false;
			if(u_phone.length!=11){
				spu_phone.innerHTML = "请输入正确的手机号！";
				spu_phone.style.color = "red";
			}else{
				spu_phone.innerHTML = "√";
				spu_phone.style.color = "green";
				flag = true;
			}
			return flag;
		}
	</script>
  </head>
  
  <body bgcolor="#ccffff">
  <h3>请修改手机号</h3>
    <form action="${pageContext.request.contextPath}/UserController/updateUserPhone.action" method="post" onsubmit="return abc()">
    	<table>
	    	<tr>
	    	<td>请输入新手机号:</td>
	    	<td><input type="text" name="u_phone" id="u_phone"/><span id="spu_phone"></span></td>
	    	</tr>
	    	<tr>
	    		<td colspan="2"><center><input type="submit" value="提交"/></center></td>
	    	</tr>
    	</table>
    </form>
  </body>
</html>
