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
    
    <title>author</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/semantic.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/animate.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/admin.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="<%=path %>/js/semantic.js"></script>
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
	<!--头-->
	<div class="ui segment blue secondary  title animated fadeIn">
		<h2 class="ui center aligned icon header">
			<i class="circular users icon"></i>
			WELCOME&nbsp;&nbsp;${authors.getUsername()}
		</h2>
	</div>
		
	<!--主体-->
	<div class="ui segment blue secondary title animated fadeIn">
		<div class="ui top attached tabular menu">
			<a class="item {{show2}}" v-on:click="showAction2">个人作品 </a>
			<a class="item {{show1}}" v-on:click="showAction1">提交作品 </a> 
			<div class="right menu" id="time"></div>
		</div>

		<!--上传-->
		<div class="ui bottom attached segment">
			<div class="ui form" v-if="show==1">
			
			<form id="uploadForm" action="${basePath}/authordo" method="POST" enctype="multipart/form-data">
			
			
			
				<h4 class="ui dividing header">提交作品</h4>
				<div class="three fields">
					<!--第一行-->
					<div class="field">
						<label>文章标题</label> 
						<input type="text" name="title" placeholder="文章标题" value="">
					</div>
					<div class="field">
						<label>音乐名</label> 
						<input type="text" name="musicID" placeholder="音乐名" value="">
					</div>
					<div class="field">
						<label>音乐作者</label> 
						<input type="text" name="name" placeholder="音乐作者" value="">
					</div>
				</div>
				<!--第二行-->
				<div class="field">
					<div class="fields">
						<div class="twelve wide field">
							<label>音乐简介</label> 
							<input name="musicText" type="text" placeholder="音乐简介" value="">
						</div>
						<div class="four wide field">
							<label>音乐类型</label>
							<div class="ui dropdown selection" >
								<input name="musicStyle" type="hidden"> 
								<i class="dropdown icon"></i>
								<div class="default text">请选择</div>
								<div class="menu">
									<div class="item" data-text="流行" data-value="1">
										<i class="life ring icon"></i> 流行
									</div>
									<div class="item" data-text="摇滚" data-value="2">
										<i class="lightning icon"></i> 摇滚
									</div>
									<div class="item" data-text="民谣" data-value="3">
										<i class="umbrella icon"></i> 民谣
									</div>
									<div class="item" data-text="轻音乐" data-value="4">
										<i class="leaf icon"></i> 轻音乐
									</div>
									<div class="item" data-text="金属" data-value="5">
										<i class="legal icon"></i> 金属
									</div>
									<div class="item" data-text="古典" data-value="6">
										<i class="university icon"></i> 古典
									</div>
									<div class="item" data-text="英伦" data-value="7">
										<i class="taxi icon"></i> 英伦
									</div>
									<div class="item" data-text="古风" data-value="8">
										<i class="anchor icon"></i> 古风
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--第三行-->
				<div class="ui form">
					<div class="field">
						<label>文章</label>
						<textarea v-model="message"></textarea>
						<input type="text" name="magazineText" value="{{message}}" style="display: none;">
					</div>
				</div>
				<!--第四行-->
				<h4 class="ui dividing header">上传图片</h4>
				<div class="two fields">
					<div class="field">
						<div class="ui fluid button blue upbutton">
							<input type="file" name="upFile" placeholder="上传音乐图片"  id="musicpicture">
								上传音乐图片
							</input>
						</div>
						<div class="ui segment upbutton rounded image ">
							<img src="img/music/music_1.jpg" id="img0">
						</div>
					</div>
					<div class="field">
						<div class="ui fluid button blue upbutton">
							<input type="file" name="upFile" placeholder="上传文章图片">上传文章图片</input>
						</div>
						<div class="ui segment upbutton image">
							<img src="img/music/music_1.jpg" />
						</div>
					</div>
				</div>

				<!--提交-->
				<h4 class="ui dividing header">提交</h4>
				<div class="two fields">
					<div class="ui fluid button blue upbutton">
							<input type="file" name="upFile" value="上传音乐">上传音乐</input>
						</div>
					<input class="fluid ui blue button" type="submit" value="提交"></input>
				</div>
			</div>
			
			
			
		</form>
		
		
		
			<!--管理-->
			<div class="ui bottom attached segment" v-if="show==2">
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
						</tr>
					</thead>
					<tbody>
						<%@include file="../common/common_author.jsp" %>
					</tbody>
				</table>
			</div>


			<div class="ui basic center aligned segment very padded">
				From &nbsp;ChenPeng &nbsp;&amp; &nbsp;LiXiangYang <i
					class="icon copyright"></i>2018
			</div>
		</div>
</body>

	<script type="text/javascript">
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
						window.location.href = "${basePath}/admin/author";
					}else if(data=="fail"){
						alert("修改失败");
						window.location.href = "${basePath}/admin/author";
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
						window.location.href = "${basePath}/admin/author";
					}else if(data=="fail"){
						alert("修改失败");
						window.location.href = "${basePath}/admin/author";
					}
				}
			});
		};
	</script>

	<script type="text/javascript">
		var vm = new Vue({
			el:"#box",
			data:{
				show:2,
				show1:'',
				show2:'active',
				message:''
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
			}
		});
		
		setInterval(function() {
			var now = (new Date()).toLocaleString();
			$('#time').text(now);
		}, 1000);
		
		setTimeout(function(){$('.ui.dropdown').dropdown()}, 1000);
		setTimeout(function(){$('.ui.dropdown').dropdown()}, 2000);
	</script>
</html>
