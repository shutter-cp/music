<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>LOGIN</title>
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/video.css" />
		<%@include file="common/context.jsp" %>
		
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
	<div class="ui image back animated fadeInDown">
				<img src="img/video_back.jpg"/>
			</div>
			<!--登陆-->
			<div class="ui segment myvideo very padded medium rounded " 
				style="background: #f2f2f2;position: absolute;"
				v-if="isLogin"
				>
				<div class="ui segment center aligned  header animated flipInX">
					<h1 class="ui header">作者登录</h1>
					<div class="ui clearing divider"></div>
					<form class="ui form" action="${basePath}/index">
						<div class="field">
							作者用户名<input name="username" id="username" 
									type="text" placeholder="用户名" value="">
						</div>
						<div class="field">
							作者密码<input name="password" id="password" 
									type="password" placeholder="密码" value="">
						</div>
					  <button class="ui fluid button blue" type="button" onclick ="login(this)">登录</button>
					</form>
				</div>
			</div>
			
			
			<script type="text/javascript">
				/* 登陆 */
				function login(obj){
					var password = $("#password").val();
					var username = $("#username").val();
					$.ajax({
						type:"post",
						url:"${basePath}/authorlogined",
						data:{"username":username,"password":password},
						success:function(data){
							if(data=="success"){
								window.location.href = "${basePath}/admin/author";
							}else if(data=="fail"){
								alert("密码或账户错误");
								$("#password").val("");
							}
						}
					});
				};
				var vm = new Vue({
					el:"#box",
					data:{
						isLogin:true,
					},
					methods:{
						add:function(){
							this.isLogin = !this.isLogin;
						},
					}
				});
			</script>
		</body>
	</html>
