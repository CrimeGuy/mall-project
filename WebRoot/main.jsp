<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{margin:0}
	ul { 
		padding-left:1px;
		} 
	a{
		text-decoration:none;/* 去掉下划线 */
		font-size:16px;
		color:black;
	}
	li{
		list-style-type:none;
		font-size:16px;
		font-family:"SimSun";/* 宋体 */
		font-weight:bold; 加粗
	}
</style>
<!-- Jquery核心文件 -->
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<!-- eaui的css文件 -->
<link rel="stylesheet" type="text/css" href="jq/jquery-easyui-1.2.6/themes/default/easyui.css">
<!-- eaui的css文件，图标  -->
<link rel="stylesheet" type="text/css" href="jq/jquery-easyui-1.2.6/themes/icon.css">
<!-- eaui的核心文件 -->
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
<!-- 国际化文件 -->
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
$(function(){
	$('a[title]').each(function(index,element){
		var title_2 = $(element).html();//标题
		var src_3 = $(element).attr('title');
		if(title_2=='手机'){
			$('#tt').tabs('add',{
				title:title_2,
				content:'<iframe iframeborder="1" style="width:100%;height:100%" src='+src_3+'></iframe>',
				closable:true
			});
		}
	})
	
	//获取a[title]，并绑定点击事件
	$('a[title]').click(function(){
		//几点的谁就代表谁
		var title_1 = $(this).html();//标题
		var src_1 = $(this).attr('title');//url
		//获取title_1的选项卡是否存在
		var tt = $('#tt').tabs('exists',title_1);
		if(src_1=="Exit"){//退出
			window.location.href="Login.jsp";
		}else if(src_1=='CloseTabs'){//关闭工作卡
			var tabsList = $('#tt').tabs('tabs');
			$.messager.confirm("通知","你确定要关闭吗",function(a){
				if(a){
					for(var i = tabsList.length-1;i>0;i--){
						$('#tt').tabs('close',i);
					}
				}
			})
		}else if(tt){//选中
			//如果这个标题的选项卡存在就选中
			$('#tt').tabs('select',title_1);
		}else{//新建
			$('#tt').tabs('add',{
				title:title_1,
				content:'<iframe iframeborder="1" style="width:100%;height:100%" src='+src_1+'></iframe>',
				closable:true
			});
		}
		
		//alert(src_1)
	})
})
</script>

</head>
<body bgcolor="#ccffff">

<div id="cc" class="easyui-layout" style="width:100%;height:720px;">  
   	<!--  <div region="east" title="东" iconCls="icon-reload" split="false" style="width:100px;"></div>   -->
    <!-- <div region="south" title="南" split="false" style="height:100px;"></div>   -->
    <div region="west" title="服务" split="false" style="width:150px;">
    	<div id="aa" class="easyui-accordion" style="width:300px;height:200px;" fit="true">  
		    <div title="导航" iconCls="icon-reload"  style="overflow:auto;padding:10px;">  
				<ul>
					<li><a href="#" title="${pageContext.request.contextPath}/ShowGoodsController/getPageGoods.action">手机</a></li>
					<li><a href="#" title="CloseTabs">关闭所有</a></li>
					
				</ul>
			</div>
			<c:if test="${loginUser!=null}">
		    <div title="个人中心" iconCls="icon-reload" selected="true"style="padding:10px;">  
		    	<ul>
		    		<c:forEach items="${privilegeList}" var="privilege">
		    			<li><a href="#" title="${pageContext.request.contextPath}/${privilege.p_uri}">${privilege.p_name}</a></li>
		    		</c:forEach>
		    			<li><a href="${pageContext.request.contextPath}/ExitController/exit.action" title=>安全退出</a></li>
		    	</ul>
		    </div> 
		    </c:if>  
		</div> 
    </div>  
    <div region="north" title="欢迎光临" split="false" style="height:70px;">
    	<c:if test="${loginUser==null}">
    		<h3><a href="./Jsp/login.jsp">用户登录</a></h3>
    	</c:if>
    	<c:if test="${loginUser!=null}">
    		<h3>欢迎:${loginUser.u_name}！&nbsp;/&nbsp;<a href="#" title="${pageContext.request.contextPath}/AddCarController/getAllCarByU_id.action">我的购物车</a>&nbsp;/&nbsp;
    		<a href="#" title="${pageContext.request.contextPath}/OrdersController/getAllOrdersByU_id.action?u_id=${loginUser.u_id}">我的订单</a></h3>
    	</c:if>
    </div>  
    <div region="center" title="商城" style="padding:5px;background:#eee;">
	    <div id="tt" class="easyui-tabs" fit="true">
	    
	    </div> 
    </div>  
</div>  

</body>
</html>