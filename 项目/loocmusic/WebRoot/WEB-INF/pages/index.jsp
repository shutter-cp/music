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
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/index.css" />
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
		
		<!--主体部分-->
		<div class="main">
			<!--轮播-->
			<div class="ui basic vertical segment animated fadeInDown">
				<div class="ui basic image massive medium rounded container">
					<img v-if="indexs==1" class="animated fadeIn" src="img/index/1.jpg"/>
					<img v-if="indexs==2" class="animated fadeIn" src="img/index/2.jpg"/>
					<img v-if="indexs==3" class="animated fadeIn" src="img/index/3.jpg"/>
				</div>
				<div id="none" class="ui basic segment vertical iocl">
					<i class="ui inverted grey big angle double left icon"
						v-on:click="lunBoSun"
						></i>
				</div>
				<div id="none" class="ui basic segment vertical iocr">
					<i class="ui inverted grey big angle double right icon"
						v-on:click="lunBoSub"
						></i>
				</div>
			</div>
			<!--音乐期刊-->
			<div class="ui segment vertical basic b">
				<!--菜单-->
				<div class="ui segment text menu  animated fadeInDown">
					<h1 class="ui header floated leaf"><i class="ui red large list layout icon"></i>音乐期刊</h1>
					<div id="none" class="ui floated right text menu">
						<a href="${basePath}/stylemagazine/1" class="ui item">流行</a>
						<a href="${basePath}/stylemagazine/2" class="ui item">摇滚</a>
						<a href="${basePath}/stylemagazine/3" class="ui item">民谣</a>
						<a href="${basePath}/stylemagazine/4" class="ui item">轻音乐</a>
						<a href="${basePath}/stylemagazine/5" class="ui item">金属</a>
						<a href="${basePath}/stylemagazine/6" class="ui item">古典</a>
						<a href="${basePath}/stylemagazine/7" class="ui item">英伦</a>
						<a href="${basePath}/stylemagazine/8" class="ui item">古风</a>
					</div>
				</div>
				<div id="yesList" class="ui container  padded inverted segment 
					center aligned medium rounded animated fadeInDown" 
					style="background: #f2f2f2;">
					<a href="${basePath}/stylemagazine/1">流行</a>
					<a href="${basePath}/stylemagazine/2">摇滚</a>
					<a href="${basePath}/stylemagazine/3">民谣</a>
					<a href="${basePath}/stylemagazine/4">轻音乐</a>
					<a href="${basePath}/stylemagazine/5">金属</a>
					<a href="${basePath}/stylemagazine/6">古典</a>
					<a href="${basePath}/stylemagazine/7">英伦</a>
					<a href="${basePath}/stylemagazine/8">古风</a>
				</div>
				<!--三个-->
				<div id="none" class="ui grid container">
					<div class="eleven wide column container animated fadeInLeft">
						<div class="ui rounded image">
							<a href="${basePath}/magazine/${magazine.get(0).getMagazineID()}">
								<img src="${basePath}/img/magazine/${magazine.get(0).getImg()}"/>
							</a>
							<p>V.${magazine.get(0).getMagazineID()}&nbsp;${magazine.get(0).getTitle()}</p>
						</div>
					</div>
					<div class="five wide column container animated fadeInRight">
						<div class="ui image rounded ">
							<a href="${basePath}/magazine/${magazine.get(1).getMagazineID()}">
								<img src="${basePath}/img/magazine/${magazine.get(1).getImg()}"/>
							</a>
							<p>V.${magazine.get(1).getMagazineID()}&nbsp;${magazine.get(1).getTitle()}</p>
						</div>
						<div class="btt clearing" style="height: 42px;"></div>
						<div class="ui image rounded bt">
							<a href="${basePath}/magazine/${magazine.get(2).getMagazineID()}">
								<img src="${basePath}/img/magazine/${magazine.get(2).getImg()}"/>
							</a>
							<p>V.${magazine.get(2).getMagazineID()}&nbsp;${magazine.get(2).getTitle()}</p>
						</div>
					</div>
				</div>
				<!-- 三个手机版 -->
				<div id="yes" class="ui grid container">
					<div class="sixteen wide column container animated fadeInLeft">
						<div class="ui rounded image">
							<a href="${basePath}/magazine/${magazine.get(0).getMagazineID()}">
								<img src="${basePath}/img/magazine/${magazine.get(0).getImg()}"/>
							</a>
							<p>V.${magazine.get(0).getMagazineID()}&nbsp;${magazine.get(0).getTitle()}</p>
						</div>
					</div>
					<div class="sixteen wide column container animated fadeInLeft">
						<div class="ui rounded image">
							<a href="${basePath}/magazine/${magazine.get(1).getMagazineID()}">
								<img src="${basePath}/img/magazine/${magazine.get(1).getImg()}"/>
							</a>
							<p>V.${magazine.get(1).getMagazineID()}&nbsp;${magazine.get(1).getTitle()}</p>
						</div>
					</div>
					<div class="sixteen wide column container animated fadeInLeft">
						<div class="ui rounded image">
							<a href="${basePath}/magazine/${magazine.get(2).getMagazineID()}">
								<img src="${basePath}/img/magazine/${magazine.get(2).getImg()}"/>
							</a>
							<p>V.${magazine.get(2).getMagazineID()}&nbsp;${magazine.get(2).getTitle()}</p>
						</div>
					</div>
				</div>
				
				<!--单曲-->
				<div class="ui segment vertical basic musics animated fadeInDown">
					<h1 class="ui header  leaf"><i class="ui red large list layout icon"></i>单曲音乐</h1>
				</div><br />
				<div class="ui four column doubling stackable grid container clearing">
					<div class="column animated {{event.no1}}">
						<a href="${basePath}/video/${music.get(0).getMusicID()}">
							<div class="ui image medium rounded " 
								v-on:mouseover="event.no1 = 'flip'" 
								v-on:mouseout="event.no1 = ''">
								<img src="<%=path %>/img/music/${music.get(0).getImg()}"/>
							</div>
						</a>
						<p>${music.get(0).getMusicID()}&nbsp;&nbsp;${music.get(0).getName()}</p>
					</div>
					<div class="column  animated {{event.no2}}">
						<a href="${basePath}/video/${music.get(1).getMusicID()}">
							<div class="ui image medium rounded" 
								v-on:mouseover="event.no2 = 'flip'" 
								v-on:mouseout="event.no2 = ''">
								<img src="<%=path %>/img/music/${music.get(1).getImg()}"/>
							</div>
						</a>
						<p>${music.get(1).getMusicID()}&nbsp;&nbsp;${music.get(1).getName()}</p>
					</div>
					<div class="column animated {{event.no3}}">
						<a href="<%=path %>/video/${music.get(2).getMusicID()}">
							<div class="ui image medium rounded " 
								v-on:mouseover="event.no3 = 'flip'" 
								v-on:mouseout="event.no3 = ''">
								<img src="<%=path %>/img/music/${music.get(2).getImg()}"/>
							</div>
						</a>
						<p>${music.get(2).getMusicID()}&nbsp;&nbsp;${music.get(2).getName()}</p>
					</div>
					<div class="column animated {{event.no4}}">
						<a href="<%=path %>/video/${music.get(3).getMusicID()}">
							<div class="ui image medium rounded " 
								v-on:mouseover="event.no4 = 'flip'" 
								v-on:mouseout="event.no4 = ''">
								<img src="<%=path %>/img/music/${music.get(3).getImg()}"/>
							</div>
						</a>
						<p>${music.get(3).getMusicID()}&nbsp;&nbsp;${music.get(3).getName()}</p>
					</div>
				</div>
				<div class="ui four column doubling stackable grid container clearing">
					<div class="column animated {{event.no5}}">
						<a href="<%=path %>/video/${music.get(4).getMusicID()}">
							<div class="ui image medium rounded " 
								v-on:mouseover="event.no5 = 'flip'" 
								v-on:mouseout="event.no5 = ''">
								<img src="<%=path %>/img/music/${music.get(4).getImg()}"/>
							</div>
						</a>
						<p>${music.get(4).getMusicID()}&nbsp;&nbsp;${music.get(4).getName()}</p>
					</div>
					<div class="column animated {{event.no6}}">
						<a href="<%=path %>/video/${music.get(5).getMusicID()}">
							<div class="ui image medium rounded " 
								v-on:mouseover="event.no6 = 'flip'" 
								v-on:mouseout="event.no6 = ''">
								<img src="<%=path %>/img/music/${music.get(5).getImg()}"/>
							</div>
						</a>
						<p>${music.get(5).getMusicID()}&nbsp;&nbsp;${music.get(5).getName()}</p>
					</div>
					<div class="column animated {{event.no7}}">
						<a href="<%=path %>/video/${music.get(6).getMusicID()}">
							<div class="ui image medium rounded " 
								v-on:mouseover="event.no7 = 'flip'" 
								v-on:mouseout="event.no7 = ''">
								<img src="<%=path %>/img/music/${music.get(6).getImg()}"/>
							</div>
						</a>
						<p>${music.get(6).getMusicID()}&nbsp;&nbsp;${music.get(6).getName()}</p>
					</div>
					<div class="column animated {{event.no8}}">
						<a href="<%=path %>/video/${music.get(7).getMusicID()}">
						<div class="ui image medium rounded " 
							v-on:mouseover="event.no8 = 'flip'" 
							v-on:mouseout="event.no8 = ''">
							<img src="<%=path %>/img/music/${music.get(7).getImg()}"/>
						</div>
						</a>
						<p>${music.get(7).getMusicID()}&nbsp;&nbsp;${music.get(7).getName()}</p>
					</div>
				</div>
			</div>
		</div>
		<!--脚部-->
		<%@include file="common/food.jsp" %>
		
		<script type="text/javascript">
		function fonded(obj){
			var string = $("#string").val();
			$.ajax({
				type:"post",
				url:"${basePath}/fond",
				data:{"string":string},
				success:function(data){
					if(data=="success"){
						window.location.href = "${basePath}/magazinelist";
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
				indexs:1,
				event:{
					no1:'',
					no2:'',
					no3:'',
					no4:'',
					no5:'',
					no6:'',
					no7:'',
					no8:'',
				},
			},
			methods:{
				/*轮播按钮*/
				lunBoSub:function(){
					if(this.indexs<3){
			 			this.indexs+=1;
			 		}else{
			 			this.indexs=1;
			 		}
				},
				lunBoSun:function(){
					if(this.indexs>1){
			 			this.indexs-=1;
			 		}else{
			 			this.indexs=3;
			 		}
				}
			}
		});
		
		/*顶部滚动响应*/
		setInterval(function() {
			var Top = document.body.scrollTop;
			var Height = document.body.scrollHeight; /*屏幕高度*/
			var width = document.documentElement.clientWidth; /*屏幕宽度*/
			var Height2 = document.body.clientHeight; /*屏幕可见高度*/
			var a = ((Top / (Height - Height2))) * (width);
			var b = "width:" + a + "px";
			document.querySelector(".title-top").setAttribute("style", b);
		});
		/*轮播*/
	 	var lun = setInterval(function fun() {
	 		if(vm.indexs<3){
	 			vm.indexs+=1;
	 		}else{
	 			vm.indexs=1;
	 		}
	 	},5000);
		 	
		</script>
		
	</body>
</html>
