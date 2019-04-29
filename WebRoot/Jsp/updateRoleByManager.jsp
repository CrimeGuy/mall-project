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

<title>My JSP 'updateRole.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript"
	src="jq/jquery-easyui-1.2.6/jquery-1.11.1.js"></script>
<script type="text/javascript">
		$(function(){
			$.ajax({
				type:"post",
				url:"${pageContext.request.contextPath}/updateRoleController/findAllRole.action",
				cache:false,
				dataType: "json",
				success: function(data){
					for(var i=0;i<data.length;i++){
						$("#selectRole").append("<option id="+data[i].r_id + " value="+data[i].r_name+">"+data[i].r_name+"</option>")
					}
				}
			})
		
			$("select").click(function(){
				var selectId = $("select option:checked").attr("id");

				$("#r_id").val(selectId);
			})
		})
	</script>
</head>

<body bgcolor="#ccffff">
	<form
		action="${pageContext.request.contextPath}/updateRoleController/updateRole.action"
		method="post">
		<table>
			<tr>
				<td>用户ID</td>
				<td><input type="text" value="${R_user.u_id}" name="u_id"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input type="text" value="${R_user.u_name}"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td><input type="hidden" id="r_id" value="${R_user.r_id}" name="r_id" /></td>
			</tr>
			<tr>
				<td><select id="selectRole"><option id="${R_user.r_id}">--请选择--</option></select></td>
				<td><input type="submit" value="确认修改" /></td>
			</tr>
		</table>

	</form>
</body>
</html>
