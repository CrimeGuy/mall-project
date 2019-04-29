<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateUsername.jsp' starting page</title>
    
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
			var u_name = document.getElementById("u_name").value;
			var spu_name = document.getElementById("spu_name");
			var flag = false;
			if(u_name==""||u_name==null){
				spu_name.innerHTML = "用户名不得为空！";
				spu_name.style.color = "red";
			}else if(u_name.length>10){
				spu_name.innerHTML = "请输入十位以下有效字符！";
				spu_name.style.color = "red";
			}else {
				spu_name.innerHTML = "√";
				spu_name.style.color = "green";
				flag=true;
			}
			return flag;
		}
		
	</script>
  </head>
  
  <body bgcolor="#ccffff">
  <h3>请修改用户名</h3>
    <form action="${pageContext.request.contextPath}/UserController/updateName.action" method="post" onsubmit="return abc()">
    	<table>
	    	<tr>
	    	<td>请输入新用户名:</td>
	    	<td><input type="text" name="u_name" id="u_name"/><span id="spu_name"></span></td>
	    	</tr>
	    	<tr>
	    		<td colspan="2"><center><input type="submit" value="提交"/></center></td>
	    	</tr>
    	</table>
    </form>
  </body>
</html>
