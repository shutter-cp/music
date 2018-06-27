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
		
		<title>MAGAZINE</title>
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/magazinelist.css" />
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
	<!-- 导航栏 -->
	<%@include file="common/top.jsp" %>


	<!--主体-->
	<div class="main" id="context">
		<!-- 手机版 -->
		<div id="yes" class="ui container  padded inverted segment 
				center aligned medium rounded animated fadeInDown"
			style="background: #f2f2f2;">
			<a><strong>风格</strong></a> 
			<i class="red puzzle icon"></i> 
			<a href="${basePath}/stylemagazine/1">流行</a> 
			<a href="${basePath}/stylemagazine/2">摇滚</a>
			<a href="${basePath}/stylemagazine/3">民谣</a> 
			<a href="${basePath}/stylemagazine/4">轻音乐</a>
			<a href="${basePath}/stylemagazine/5">金属</a> 
			<a href="${basePath}/stylemagazine/6">古典</a> 
			<a href="${basePath}/stylemagazine/7">英伦</a> 
			<a href="${basePath}/stylemagazine/8">古风</a>
		</div>

		<!--期刊卡片-->
		<div id="yes" class="ui link cards animated fadeInLeft" id="example1" style="margin:0 auto;">
			<c:forEach items="${magazineLists}" var="magazine" begin="0" end="10">
				<div class="card " style="width: 380px;">
					<div class="image">
						<img src="<%=path %>/img/magazine/${magazine.getImg()}">
					</div>
					<div class="content">
						<div class="header">
							<a href="${basePath}/magazine/${magazine.getMagazineID()}">
								V.${magazine.getMagazineID()}&nbsp;&nbsp;${magazine.getTitle()}
							</a>
						</div>
						<div class="meta">
							<a>${magazine.getUsername()}</a>
						</div>
						<div class="description">
							<a href="${basePath}/magazine/${magazine.getMagazineID()}">
								${magazine.getMusicText()}
							</a>
						</div>
					</div>
					<div class="extra content">
						<span class="right floated">${magazine.getCommentTime()}
						</span> <span>
						<i class="user icon"></i>${magazine.getWeight()}</span>
					</div>
				</div>
			</c:forEach>
		</div>
		<!-- 手机版结束 -->
		
		<!--左边-->
		<div class="main-left">
			<div id="none" class="ui container  padded inverted segment 
					center aligned medium rounded animated fadeInDown"
				style="background: #f2f2f2;">
				<a><strong>风格</strong></a> 
				<i class="red puzzle icon"></i> 
				<a href="${basePath}/stylemagazine/1">流行</a> 
				<a href="${basePath}/stylemagazine/2">摇滚</a>
				<a href="${basePath}/stylemagazine/3">民谣</a> 
				<a href="${basePath}/stylemagazine/4">轻音乐</a>
				<a href="${basePath}/stylemagazine/5">金属</a> 
				<a href="${basePath}/stylemagazine/6">古典</a> 
				<a href="${basePath}/stylemagazine/7">英伦</a> 
				<a href="${basePath}/stylemagazine/8">古风</a>
			</div>

			<!--期刊卡片-->
			<div id="none" class="ui link cards animated fadeInLeft" id="example1">
				<c:forEach items="${magazineLists}" var="magazine" begin="0" end="10">
					<div class="card " style="width: 590px;">
						<div class="image">
							<img src="<%=path %>/img/magazine/${magazine.getImg()}">
						</div>
						<div class="content">
							<div class="header">
								<a href="${basePath}/magazine/${magazine.getMagazineID()}">
									V.${magazine.getMagazineID()}&nbsp;&nbsp;${magazine.getTitle()}
								</a>
							</div>
							<div class="meta">
								<a>${magazine.getUsername()}</a>
							</div>
							<div class="description">
								<a href="${basePath}/magazine/${magazine.getMagazineID()}">
									${magazine.getMusicText()}
								</a>
							</div>
						</div>
						<div class="extra content">
							<span class="right floated">${magazine.getCommentTime()}
							</span> <span>
							<i class="user icon"></i>${magazine.getWeight()}</span>
						</div>
					</div>
				</c:forEach>
			</div>

			<!--分页-->
			<div class="ui circular labels" style="margin-top: 50px;">
				<a class="ui label"> 上一页 </a> <a class="ui label"> 首页 </a> <a
					class="ui label"> 1 </a> <a class="ui label"> 2 </a> <a
					class="ui label"> 3 </a> <a class="ui label"> ... </a> <a
					class="ui label"> 99 </a> <a class="ui label"> 下一页 </a> <a
					class="ui label"> 尾页 </a>
			</div>


		</div>
		<!--右边-->
		<!--右边-->
		<div id="none" class="main-right">
			<div class="ui rail">
				<div class="ui sticky animated fadeInDown">
					<div class="ui header">最近热门期刊</div>
					<c:forEach items="${magazineList}" var="magazine">
						<a href="${basePath}/magazine/${magazine.getMagazineID()}">
							<img class="ui top aligned tiny rounded image"
								src="<%=path %>/img/magazine/${magazine.getImg()}">
						</a>
						<span>${magazine.getTitle()}—${magazine.getUsername()}</span>
						<div class="ui divider"></div>
					</c:forEach>
				</div>
			</div>
		</div>

	</div>

	<!--脚部-->
	<%@include file="common/food.jsp" %>

	<script type="text/javascript">
		var vm = new Vue({
			el:"#box",
			data:{
			},
			methods:{
				
			}
		})
		</script>
	<script type="text/javascript">
			$('.ui.sticky').sticky({
				context: '#example1',
				offset: 110,
				bottomOffset : 120
			});
			/*顶部滚动响应*/
		 	setInterval(function() {
				var Top = document.body.scrollTop;
				var Height = document.body.scrollHeight;/*屏幕高度*/
				var width = document.documentElement.clientWidth;/*屏幕宽度*/
				var Height2 =  document.body.clientHeight;/*屏幕可见高度*/
				var a = ((Top/(Height-Height2)))*(width);
				var b = "width:"+a+"px";
				document.querySelector(".title-top").setAttribute("style",b);
			});
		</script>

</body>
</html>

