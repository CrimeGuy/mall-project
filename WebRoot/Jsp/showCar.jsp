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

<title>My JSP 'showCar.jsp' starting page</title>

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
		var divMoney = document.getElementById("divMoney");
		var c_id = [];
		var money = 0;
		var che = document.getElementsByName("che");
			for (var i = 0; i < che.length; i++) {
				if (che[i].checked == true) {
					c_id.push(che[i].title);
					var j = parseInt(che[i].value);
					money+=j;
				}	
			}
			divMoney.innerHTML="共计:"+money+"元";
	}
	
	function submitOrder(){
		var che = document.getElementsByName("che");
		var c_id = [];
		var money = 0;
		var num = 0;
		for(var i = 0; i < che.length; i++){
			if (che[i].checked == true) {
				num++;
				c_id.push(che[i].title);
				var j = parseInt(che[i].value);
				money+=j;
			}
		}
		var c_ids=c_id.toString();
		if(num>0){
			window.location.href="${pageContext.request.contextPath}/OrdersController/toSubmitOrder.action?totalmoney="+money+"&"+"c_ids="+c_ids;
		}
	}
	
	function selecteAll(){
		var headcheckbox = document.getElementById("headcheckbox");
		var ches = document.getElementsByName("che");
		for(var i=0;i<ches.length;i++){
			if(headcheckbox.checked==true){
				ches[i].checked=true;
				abc();	
			}else{
				ches[i].checked=false;
				abc();
			}
		}
	}
	
	function deleteBatch(){
		var che = document.getElementsByName("che");
		var c_id = [];
		var num=0;
		for(var i=0;i<che.length;i++){
			if(che[i].checked==true){
				c_id.push(che[i].title);
				num++;
			}
		}
		var c_ids = c_id.toString();
		if(num>0){
			window.location.href="${pageContext.request.contextPath}/AddCarController/deleteBatch.action?c_ids="+c_ids;
		}
	}
</script>

<style type="text/css">
.part {
	width: 500px;
	height: 100px;
}

img {
	width: 100px;
	height: 100px;
}

span {
	position: absolute;
	margin-top: 40px;
}

.cla1 {
	text-align: right;
}

#divMoney {
	position: absolute;
	margin-left: 700px;
}
#a {
	position: absolute;
	margin-left: 700px;
	margin-top: 30px;
}
#sp1{
	color: red;
}
</style>

</head>

<body bgcolor="#ccffff">
	<h2>我的购物车</h2>
	<table>
			<tr>
				<td class="cla1"><input type="checkbox" id="headcheckbox" onclick="selecteAll()"/></td><td>全选&nbsp;&nbsp;<input type="submit" value="批量删除" onclick="deleteBatch()"/></td>
			</tr>
		<c:forEach items="${carList}" var="car">
			<c:if test="${car.c_status!='缺货'}">
				<tr>
					<td class="cla1"><input type="checkbox"
							value="${car.totalmoney}" title="${car.c_id}" name="che"
							onclick="abc()"/>
					</td>
					<td width="600px" height="120px">
						<div class="part">
							<img src="./image/${car.c_image}">&nbsp;&nbsp;<span>型号:${car.c_name}&nbsp;&nbsp;￥${car.c_money}&nbsp;&nbsp;数量:${car.c_num}&nbsp;&nbsp;状态:${car.c_status}&nbsp;&nbsp;总额:￥${car.totalmoney}</span><br>
						</div>
					</td>
					<td><a href="${pageContext.request.contextPath}/AddCarController/deleteCarByC_id.action?c_id=${car.c_id}">移除</a></td>
				</tr>
			</c:if>
			<c:if test="${car.c_status=='缺货'}">
				<tr>
					<td class="cla1"><input type="checkbox"
							value="0" title="${car.c_id}" name="che"
							onclick="abc()"/>
					</td>
					<td width="600px" height="120px">
						<div class="part">
							<img src="./image/${car.c_image}" >&nbsp;&nbsp;<span id="sp1">型号:${car.c_name}&nbsp;&nbsp;￥${car.c_money}&nbsp;&nbsp;数量:${car.c_num}&nbsp;&nbsp;状态:${car.c_status}&nbsp;&nbsp;总额:￥${car.totalmoney}</span><br>
						</div>
					</td>
					<td><a href="${pageContext.request.contextPath}/AddCarController/deleteCarByC_id.action?c_id=${car.c_id}">移除</a></td>
				</tr>
			</c:if>
		</c:forEach>
	</table>
	<div id="divMoney">
		&nbsp;共计:0元
	</div>
	<input type="submit" value="提交订单" id="a" onclick="submitOrder()"/>
</body>
</html>
