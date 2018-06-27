<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>LOOCMUSIC</title>
    
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css" />
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

		<!--分类-->
		<div class="music_style">
			<div class="ui very padded segment red animated fadeInLeft">
				<i class="ui  large asterisk loading  icon"></i>
				<span class="font">类型</span>
				<!--分割线-->
				 <div class="ui clearing divider"></div>
				 <br />
				<!--风格1-->
				<div class="ui four column doubling stackable grid  container ">
					<div class="column "
							v-on:mouseover="no1 = 'flipInX'" 
							v-on:mouseout="no1 = ''">
						<div class="ui card animated {{no1}}">
							<div class="ui image">
						    	<a href="${basePath}/stylemagazine/1" class="ui medium image">
								  <img class="" src="img/style/style-1.jpg"/>
								</a>
								<p class="fonts"><strong>流行 </strong></p>
		 					</div>
						</div>
					   
					</div>
					
					<div class="column"
						v-on:mouseover="no2 = 'flipInX'" 
							v-on:mouseout="no2 = ''">
						<div class="ui card animated {{no2}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/2" class="ui medium image">
								  <img src="img/style/style-2.jpg"/>
								</a>
								<p class="fonts"><strong>摇滚</strong></p>
		 					</div>
						</div>
					   
					</div> 
					
					<div class="column"
						v-on:mouseover="no3 = 'flipInX'" 
							v-on:mouseout="no3 = ''">
						<div class="ui card animated {{no3}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/3" class="ui medium image">
								  <img src="img/style/style-3.jpg"/>
								</a>
								<p class="fonts"><strong>民谣</strong></p>
		 					</div>
						</div>
					   
					</div>
					
					<div class="column"
						v-on:mouseover="no4 = 'flipInX'" 
							v-on:mouseout="no4 = ''">
						<div class="ui card animated {{no4}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/4" class="ui medium image">
								  <img src="img/style/style-4.jpg"/>
								</a>
								<p class="fonts"><strong>轻音乐</strong></p>
		 					</div>
						</div>
					</div>	 	
				</div>
			
				<!--风格2-->
				<div class="ui four column doubling stackable grid  container">
					<div class="column"
						v-on:mouseover="no5 = 'flipInX'" 
							v-on:mouseout="no5 = ''">
						<div class="ui card animated {{no5}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/5" class="ui medium image">
								  <img src="img/style/style-5.jpg"/>
								</a>
								<p class="fonts"><strong>金属</strong></p>
		 					</div>
						</div>
					   
					</div>
					
					<div class="column"
						v-on:mouseover="no6 = 'flipInX'" 
							v-on:mouseout="no6 = ''">
						<div class="ui card animated {{no6}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/6" class="ui medium image">
								  <img src="img/style/style-6.jpg"/>
								</a>
								<p class="fonts"><strong>古典</strong></p>
		 					</div>
						</div>
					   
					</div> 
					
					<div class="column"
						v-on:mouseover="no7 = 'flipInX'" 
							v-on:mouseout="no7 = ''">
						<div class="ui card animated {{no7}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/7" class="ui medium image">
								  <img src="img/style/style-7.jpg"/>
								</a>
								<p class="fonts"><strong>英伦</strong></p>
		 					</div>
						</div>
					   
					</div> 
					
					<div class="column"
						v-on:mouseover="no8 = 'flipInX'" 
							v-on:mouseout="no8 = ''">
						<div class="ui card animated {{no8}}">
							 <div class="ui image ">
						    	<a href="${basePath}/stylemagazine/8" class="ui medium image">
								  <img src="img/style/style-8.jpg"/>
								</a>
								<p class="fonts"><strong>古风</strong></p>
		 					</div>
						</div>  
					</div>	
				</div>		
			</div>
		
			<!--场景-->
			<div class="ui very padded segment red animated fadeInRight">
				<i class="ui  large asterisk loading  icon"></i>
				<span class="font">场景</span>
				<!--分割线-->
				<div class="ui clearing divider">
				</div>
				<br />
				<!--场景1-->
				<div class="ui four column doubling stackable grid  container">
					<div class="column"
						v-on:mouseover="no9 = 'flipInX'" 
							v-on:mouseout="no9 = ''">
						<div class="ui card animated {{no9}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/4" class="ui medium image">
								  <img src="img/style/style-9.jpg"/>
								</a>
								<p class="fonts"><strong>清晨</strong></p>
		 					</div>
						</div>
					</div>
					
					<div class="column"
						v-on:mouseover="no10 = 'flipInX'" 
							v-on:mouseout="no10 = ''">
						<div class="ui card animated {{no10}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/3" class="ui medium image">
								  <img src="img/style/style-10.jpg"/>
								</a>
								<p class="fonts"><strong>午休</strong></p>
		 					</div>
						</div>
					</div> 
					
					<div class="column"
						v-on:mouseover="no11 = 'flipInX'" 
							v-on:mouseout="no11 = ''">
						<div class="ui card animated {{no11}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/6" class="ui medium image">
								  <img src="img/style/style-11.jpg"/>
								</a>
								<p class="fonts"><strong>下午茶</strong></p>
		 					</div>
						</div>
					</div>
					
					<div class="column"
						v-on:mouseover="no12 = 'flipInX'" 
							v-on:mouseout="no12 = ''">
						<div class="ui card animated {{no12}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/4" class="ui medium image">
								  <img src="img/style/style-12.jpg"/>
								</a>
								<p class="fonts"><strong>夜晚</strong></p>
		 					</div>
						</div>  
					</div>	
				</div>	
				
				<!--场景2-->
				<div class="ui four column doubling stackable grid  container">
					<div class="column"
						v-on:mouseover="no13 = 'flipInX'" 
							v-on:mouseout="no13 = ''">
						<div class="ui card animated {{no13}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/2" class="ui medium image">
								  <img src="img/style/style-13.jpg"/>
								</a>
								<p class="fonts"><strong>旅行</strong></p>
		 					</div>
						</div>
					   
					</div>
					
					<div class="column"
						v-on:mouseover="no14 = 'flipInX'" 
							v-on:mouseout="no14 = ''">
						<div class="ui card animated {{no14}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/1" class="ui medium image">
								  <img src="img/style/style-14.jpg"/>
								</a>
								<p class="fonts"><strong>散步</strong></p>
		 					</div>
						</div>
					   
					</div> 
					
					<div class="column"
						v-on:mouseover="no15 = 'flipInX'" 
							v-on:mouseout="no15 = ''">
						<div class="ui card animated {{no15}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/4" class="ui medium image">
								  <img src="img/style/style-15.jpg"/>
								</a>
								<p class="fonts"><strong>学习</strong></p>
		 					</div>
						</div>
					   
					</div>
					
					<div class="column"
						v-on:mouseover="no16 = 'flipInX'" 
							v-on:mouseout="no16 = ''">
						<div class="ui card animated {{no16}}">
							 <div class="ui image">
						    	<a href="${basePath}/stylemagazine/2" class="ui medium image">
								  <img src="img/style/style-16.jpg"/>
								</a>
								<p class="fonts"><strong>运动</strong></p>
		 					</div>
						</div>
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
					no1:'',no2:'',no3:'',no4:'',
					no5:'',no6:'',no7:'',no8:'',
					no9:'',no10:'',no11:'',no12:'',
					no13:'',no14:'',no15:'',no16:'',
				},
			})
		</script>
		<script type="text/javascript">
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