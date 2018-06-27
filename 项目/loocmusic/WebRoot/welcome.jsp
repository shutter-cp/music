<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>WELCOME</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/welcome.css"/>
   	<link rel="stylesheet" type="text/css" href="<%=path %>/css/semantic.css"/>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/animate.css"/>
	<script type="text/javascript" src="<%=path %>/js/vue1.js"></script>
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
		<div class="back">
			<div class="imgs">
				<img src="<%=path %>/img/1.jpg"/>
			</div>
			<div class="ui active dimmer animated fadeIn">
				<div class="ui segment vertical basic animated flipInX">
					<h1 class="ui header inverted"><p>LOOCMUSIC</p></h1>
					<div class="{{MyAction}}" 
						v-on:mouseover="MyAction='animated rubberBand'"
						v-on:mouseout="MyAction=''"
						>
					 	<a href="${basePath}/index">
					 		<button class="ui button big inverted" type="button">
					 			OPEN
					 		</button>
					 	</a> 
					</div>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			var vm = new Vue({
				el:'#box',
				data:{
					MyAction:''
				}
			});
		</script>
	</body>
</html>
