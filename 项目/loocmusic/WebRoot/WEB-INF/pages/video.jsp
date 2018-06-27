<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>VIDEO</title>
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
			<div class="wrap" id="wrabox">
				<span class="items"></span>
			</div>
			<img src="<%=path %>/img/video_back.jpg"/>
		</div>
		<div class="ui segment myvideo very padded medium rounded  " 
			style="background: #f2f2f2;position: absolute;">
			<div class="ui segment center aligned  header animated flipInX">
				<h2 class="ui header ">${video.getMusicID()}</h1>
				<p>${video.getName()}</p>
				<div class="ui medium image segment">
					<img class=" rouble" src="<%=path %>/img/music/${video.getImg()}"/>
				</div>
				<div class="buttons">
					<button class="ui button inverted" onclick="stops(this)">
						<i class="ui circular inverted icon stop "></i>
					</button>
					<button class="ui button inverted" onclick="play(this)">
						<i class="ui circular big icon inverted video play {{loging}}"></i>
					</button>
					<button class="ui button inverted" onclick="stop(this)">
						<i class="ui circular inverted icon pause"></i>
					</button>
				</div>
				<!-- 手机进度条 -->
				<div class="ui teal progress inverted blue small" id="example3">
				  <div class="bar"></div>
				</div>
			</div>
			<audio src="<%=path %>/music/${video.getSrc()}" id="mymusic">
				亲 您的浏览器不支持html5的audio标签
			</audio>
			<!-- 进度条 -->
			<div class="ui teal progress inverted blue small" id="example2">
			  <div class="bar"></div>
			</div>
			
		</div>
		<!--加颜色-->
		<script type="text/javascript">
			window.onload = function(){
				cpBar.init();
			};
			//获取id节点
			function dom(id){
				return document.getElementById(id);	
			};
			//随机颜色
			function rendDom(op){
				var r = Math.floor(Math.random()*(256));
				var g = Math.floor(Math.random()*(256));
				var b = Math.floor(Math.random()*(256));
				return "rgba("+r+","+g+","+b+","+(op||1)+")";
			}
			var cpBar = {
				mw:12,
				init:function(){
					//拿到盒子dom
					var boxDom = dom("wrabox");
					//拿到宽度
					var bwidth = boxDom.clientWidth;
					//算列
					var cells = bwidth/this.mw;
					//html缓冲
					var html = '';
					for(var i=0;i<cells;i++){
						html+="<span class='items' style='background:"+rendDom(1)+";left:"+(i*this.mw)+"px'></span>";
					}
					boxDom.innerHTML = html;
					
					
				}
			};
		</script>
		<script type="text/javascript">
			var vm = new Vue({
				el:"#box",
				data:{
					loging:'',
					abd:0,
				}
			});
			/*播放器按钮*/
			var x = document.getElementById("mymusic");
			function play(obj){
				vm.loging = 'loading';
				x.play();
			};
			function stop(obj){
				vm.loging = '';
				x.pause();
			};
			function stops(obj){
				vm.loging = '';
				x.load();
			};
			/*进度条*/
			setInterval(function getTime(){
		 		vm.abd = (x.currentTime/x.duration)*100;
			 	$('#example2').progress({percent: vm.abd});
			 	$('#example3').progress({percent: vm.abd});
		 	});
		</script>
	</body>
</html>

