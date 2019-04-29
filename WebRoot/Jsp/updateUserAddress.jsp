<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateUserAddress.jsp' starting page</title>
    
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
			var u_address = document.getElementById("u_address").value;
			var spu_address = document.getElementById("spu_address");
			var flag = false;
			if(u_address.length<10||u_address.length>30){
				spu_address.innerHTML = "请输入有效地址";
			}else{
				spu_address.innerHTML = "√";
				flag = true; 
			}
			return flag;
		}
	</script>
	<style type="text/css">
		span{
			color: red;
			font-size: 15px;
		}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
  <h3>请修改地址</h3>
     <form action="${pageContext.request.contextPath}/UserController/updateUserAddress.action" method="post" onsubmit="return abc()">
    	<table>
	    	<tr>
	    	<td>请输入新地址:</td>
	    	<td><input type="text" name="u_address" id="u_address"/><span id="spu_address"></span></td>
	    	</tr>
	    	<tr>
	    		<td colspan="2"><center><input type="submit" value="提交"/></center></td>
	    	</tr>
    	</table>
    </form>
  </body>
</html>
