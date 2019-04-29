<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   	<base href="<%=basePath%>">
    
    <title>My JSP 'addRole.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<script type="text/javascript" src="DTree/jquery/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="DTree/js/dtree.js"></script>
	<link rel="stylesheet" type="text/css" href="css/dtree.css">
	<link rel="stylesheet" type="text/css" href="css/common.css">
	<script type="text/javascript">
		$(function(){
			$.ajax({
				type: "get",
				url:"${pageContext.request.contextPath}/AddRoleController/findAllPrivilege.action",
				dataType:"json",
				success:function(data){
					d = new dTree('d');
					d.add(0,-1,"系统");
					for(var i=0;i<data.length;i++){
						d.add(data[i].p_id,data[i].p_parent,data[i].p_name);
					}
					var sp = document.getElementById("sp");
					sp.innerHTML=d;
				}
			})
			$("#sp").click(function(){
				$("#r_describe").val(d.getText());
				$("#p_id").val(d.getTextID());
			})
			$("#form1").click("submit",function(){
				var p_id = document.getElementById("p_id").value;
				var num = 0;
				if(p_id.length!=0){
					num++;
				}else{
					return false;			
				}
				if(num!=0){
					return true;
				}
			})
		})
	
	</script>
	<style type="text/css">
		#div1{
			width:280;
			height:230;
			position: relative;
			margin-top: 10%;
			margin-left: 35%;
			background-color:#00cc33;
		}
	</style>
  </head>
  
  <body bgcolor="#ccffff">
  <h3>修改角色</h3>
  <div id="div1">
    <form action="${pageContext.request.contextPath}/AddRoleController/updateRole.action" method="post" id="form1" >
    	<table>
    		<tr>
    			<td>
    				请输入角色名称:<input type="text" value = "${r_name}" name="r_name"/>
    				<input type="hidden" value="${r_id}" name="r_id"/>
    			</td>
    			<td colspan="2">
    				<input type="hidden" name="r_describe" id="r_describe"/>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				请选择角色权限：<center><span id="sp"></span></center> 
    			</td>
    			<td>
    				<input type="hidden" name="p_id" id="p_id"/>
    			</td>
    		</tr>
    		<tr>
    			<td colspan="3"><center><input type="submit" value="提交"/></center></td>
    		</tr>
    	</table>
    </form>
   </div>
  </body>
</html>
