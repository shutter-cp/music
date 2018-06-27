<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
		<title>MAGAZINE</title>
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/magazine.css" />
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
	<div class="main animated fadeInLeft">
		<div class="ui segment vertical basic">
			<a href="<%=path%>/magazinelist"> &lt;返回期刊首页</a>
			<div class="myright">#${magazine.getStyleName()}</div>
		</div>
		<h1 class="x30 cpLeft">${magazine.getTitle()}</h1>
		<div class="ui segment inverted red circular ids">
			${magazine.getMagazineID()}
		</div>

		<div class="ui segment red boxs">
			<!--图片-->
			<div class="ui segment  rounded image">
				<img class="imgs "
					src="<%=path %>/img/magazine/${magazine.getMagazineImg()}" />
			</div>
			<!--文字-->
			<div class=" ui segment basic  message ">
				<i class="ui icon quote left"></i> <span>
					${magazine.getText()} </span> <i class="ui icon quote right myright"></i>
			</div>
			<!--播放器-->
			<div class="ui segment red">
				<div class="ui segment myvideo very padded medium rounded"
					style="background: #f2f2f2;">
					<div class="ui segment center aligned  header">
						<h2 class="ui header ">${magazine.getMusicID()}</h1>
							<p>${magazine.getName()}</p>
							<div class="ui medium image segment">
								<img class=" rouble"
									src="<%=path %>/img/music/${magazine.getMusicImg()}" />
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
					</div>
					<audio src="<%=path %>/music/${magazine.getSrc()}" id="mymusic"> 亲
					您的浏览器不支持html5的audio标签 </audio>

					<div class="ui teal progress inverted blue small" id="example2">
						<div class="bar"></div>
					</div>

				</div>
			</div>
			<!--评论-->


			<div class="ui comments segment red">
				<h3 class="ui dividing header">评论</h3>
				
				<c:forEach items ="${commentList}" var = "comment">
					<div class="comment">
						<a class="avatar"> <img class="myavatar"
							src="<%=path%>/img/user/${comment.getImg()}">
						</a>
						<div class="content">
								<a class="author">${comment.getUsername()}</a>
								<div class="metadata">
									<span class="date">${comment.getCommentTime()}</span>
								</div>
								<div class="text">
									${comment.getComment()}
									<div class="actions">
									<a class="reply">##${magazine.getName()}</a>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>


				<form class="ui reply form">
					<div class="field">
						<textarea v-model="message"></textarea>
					</div>
					<c:if test="${user == null}">
						<div onclick="alert('请登陆！');" class="ui blue labeled submit icon button">
							<i class="icon edit"></i> 发布
						</div>
					</c:if>
					<c:if test="${user != null}">
						<div onclick="commented(this)" class="ui blue labeled submit icon button">
							<i class="icon edit"></i> 发布
						</div>
					</c:if>
					<div style="float: right;">你还可以输入{{maxlength - message.length}}字</div>
					
				</form>
			</div>
		</div>

	</div>

	
	<!--脚部-->
	<%@include file="common/food.jsp" %>
	
	
	<script type="text/javascript">
		/* 写评论 */
		function commented(obj){
			if(vm.message.length<=5){
				alert("输入内容请大于5个字符");
			}else{
				$.ajax({
					type:"post",
					url:"${basePath}/comment",
					data:{
							"comment":vm.message,
							"magazineID":${magazine.getMagazineID()},
							"userID":${user.getUserID()}
					},
					success:function(data){
						if(data=="success"){
							window.location.href = "${basePath}/magazine/${magazine.getMagazineID()}";
						}else if(data=="fail"){
							alert("提交失败");
						}
					}
				});
			}
		};
	</script>
	<script type="text/javascript">
		
		
		var vm = new Vue({
			el : "#box",
			data : {
				loging :'',
				abd : 0,
				message:'',
				maxlength:200,
			},
			methods : {
	
			}
		});
			
		/*播放器按钮*/
		var x = document.getElementById("mymusic");
		function play(obj) {
			vm.loging = 'loading';
			x.play();
		}
		function stop(obj) {
			vm.loging = '';
			x.pause();
		}
		function stops(obj) {
			vm.loging = '';
			x.load();
		}
		/*进度条*/
		setInterval(function getTime() {
			vm.abd = (x.currentTime / x.duration) * 100;
			$('#example2').progress({
				percent : vm.abd
			});
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
		setInterval(function() {
			if(vm.message.length>vm.maxlength){
						alert("评论超长！");
						vm.message = vm.message.substr(0, vm.maxlength);
				}
		});
	</script>
</body>
</html>
