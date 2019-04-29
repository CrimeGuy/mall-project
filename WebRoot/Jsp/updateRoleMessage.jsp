<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateRoleMessage.jsp' starting page</title>
    
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
			var r_name = document.getElementById("r_name").value;
			var r_describe = document.getElementById("r_describe").value;
			var spr_name = document.getElementById("spr_name");
			var spr_describe = document.getElementById("spr_describe");
			var flag = false;
			var num = 0;
			if(r_name.length==0){
				spr_name.innerHTML="不得为空！";
			}else{
				spr_name.innerHTML="";
				num++;
			}
			if(r_describe.length==0){
				spr_describe.innerHTML="不得为空！";
			}else{
				spr_describe.innerHTML="";
				num++;
			}
			if(num==2){
				flag=true;
			}
			return flag;
		}
	</script>
	
  </head>
  
  <body bgcolor="#ccffff">
 
   	<form action="${pageContext.request.contextPath}/UpdateRolesMessageController/UpdateRolesMessage.action" method="post" onsubmit="return abc()">
   		<table>
   			<tr>
   				<td>修改角色名:</td>
   				<td><input type="text" name="r_name" value="${role.r_name}" id="r_name"/><span id="spr_name"></span></td>
   			</tr>
   			<tr>
   				<td>修改角色描述:</td>
   				<td><input type="text" name="r_describe" value="${role.r_describe}" id="r_describe"/><span id="spr_describe"></span>
   					<input type="hidden" name="r_id" value="${role.r_id}">
   				</td>
   			</tr>
   			<tr>
   				<td colspan="2"><input type="submit" value="提交"/></td>
   			</tr>
   		</table>
   	</form>
  </body>
</html>
