<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ADMIN</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/semantic.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/animate.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/admin.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/semantic.js"></script>
	<script type="text/javascript" src="<%=path %>/js/vue1.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/> 
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
	<body id="box">
		<!--头-->
		<div class="ui segment blue secondary  title animated fadeIn">
			<h2 class="ui center aligned icon header">
				<i class="circular users icon"></i>
				WELCOME&nbsp;&nbsp;${admins.getUsername()}
			</h2>
		</div>
		
		<!--主体-->
		<div class="ui segment blue secondary title animated fadeIn">
			<div class="ui top attached tabular menu">
				<a class="item {{show1}}" v-on:click="showAction1">期刊</a>
				<a class="item {{show2}}" v-on:click="showAction2">用户</a>
				<div class="right menu" id="time"></div>
			</div>
			
			<!--作品管理-->
			<div class="ui bottom attached segment"
				v-if="show==1">
				<table class="ui compact celled definition table">
					<thead>
						<tr>
							<th>发布</th>
							<th>编号</th>
							<th>标题</th>
							<th>音乐名</th>
							<th>时间</th>
							<th>音乐赞数</th>
							<th>是否已发布</th>
							<th>删除</th>
						</tr>
					</thead>
					<tbody>
						<div id="mainContent">
							<%@include file="../common/common_admin.jsp" %>
						</div>
					</tbody>
				</table>
			</div>
			
			
			<!--管理-->
			<div class="ui bottom attached segment"
				v-if="show==2">
				<table class="ui compact celled definition table">
					<thead>
						<tr>
							<th>删除</th>
							<th>用户名</th>
							<th>电话</th>
							<th>email</th>
							<th>等级</th>
							<th>积分</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td class="collapsing">
								<div class="ui fitted slider checkbox">
									<input type="checkbox"> <label></label>
								</div>
							</td>
							<td>${user.getUsername()}</td>
							<td>${user.getTel()}</td>
							<td>${user.getEmail()}</td>
							<td>${user.getLv()}</td>
							<td>${user.getPoints()}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
			
			<div class="ui basic center aligned segment very padded">
				From &nbsp;ChenPeng &nbsp;&amp; &nbsp;LiXiangYang <i class="icon copyright"></i>2018
			</div>
		</div>
	</body>
	<script type="text/javascript">
		$('.ui.dropdown').dropdown();
		//按钮开关
		function off(magazineID){
			$.ajax({
				type:"post",
				url:"${basePath}/offapproval",
				data:{
					"magazineID":magazineID,
					},
				success:function(data){
					if(data=="success"){
						window.location.href = "${basePath}/admin/admin";
					}else if(data=="fail"){
						alert("修改失败");
						window.location.href = "${basePath}/admin/admin";
					}
				}
			});
		};
		function on(magazineID){
			$.ajax({
				type:"post",
				url:"${basePath}/onapproval",
				data:{
					"magazineID":magazineID,
					},
				success:function(data){
					if(data=="success"){
						window.location.href = "${basePath}/admin/admin";
					}else if(data=="fail"){
						alert("修改失败");
						window.location.href = "${basePath}/admin/admin";
					}
				}
			});
		};
		/* 删除跳转 */
		function delet(magazineID){
			confirm("您确定要删除");
			window.location.href = "${basePath}/admin/admin/delet/"+magazineID;
		};
		//vue
		var vm = new Vue({
			el:"#box",
			data:{
				show:1,
				show1:'active',
				show2:''
			},
			methods:{
				showAction1:function(){
					this.show = 1;
					this.show1='active';
					this.show2='';
				},
				showAction2:function(){
					this.show = 2;
					this.show1='';
					this.show2='active';
				}
			},
		});
		setInterval(function() {
			var now = (new Date()).toLocaleString();
			$('#time').text(now);
		}, 1000);
		
	</script>
</html>
