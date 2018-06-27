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
    
    <title>MAGAZINE</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/music.css" />
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
		<div class="main" id="example1">
			<div class="main-left animated fadeInLeft">
				<div class="ui segment container basic vertical">
					<div class="ui rounded image">
						<img src="img/music/music_backgrud.jpg"/>
					</div>
				</div>
				
				<div class="musici">
					<i class="music big loading icon" style="margin-top: 100px;"></i>
					<i class="music big loading icon" style="margin-top: 100px;"></i>
					<i class="music big loading icon" style="margin-top: 100px;"></i>
					<i class="music big loading icon" style="margin-top: 100px;"></i>
					<i class="music big loading icon" style="margin-top: 100px;"></i>
					<i class="music big loading icon" style="margin-top: 100px;"></i>
				</div>
				<!--音乐清单-->
				<table class="ui yellow table">
					<tbody>
						<c:forEach items ="${musicList}" var = "music" begin="0" end ="10">
						    <tr>
							    <td class="musicName">
							    	<a href="<%=path %>/video/${music.getMusicID()}">
							    		<i class="ui large  icon video play  blue "></i>
							    	</a>
							    	${music.getMusicID()}
							    </td>
							    
							    <td class="musicAuthor">${music.getName()}</td>
							    <td class="musicText">${music.getMusicText()}</td>
							    <td class="musicPeople">
							    	<button class="ui circular facebook icon button"
							    		onclick="addweight('${music.getMusicID()}','${music.getWeight()}')">
										<i class="thumbs mini outline up icon">
										</i>
										${music.getWeight()}
									</button>
							    </td>
						    </tr>
					    </c:forEach>
				 	</tbody>
				</table>
				<!--分页-->
				<div class="ui circular labels" style="margin-top: 50px;">
					<a class="ui label">
				    	上一页
				  	</a>
					<a class="ui label">
					  	首页
					</a>
					<a class="ui label">
					    1
					</a>
					<a class="ui label">
					    2
					</a>
					<a class="ui label">
					    3
					</a>
					<a class="ui label">
					    ...
					</a>
					<a class="ui label">
					    99
					</a>
					<a class="ui label">
					   	下一页
					</a>
					<a class="ui label">
					   	尾页
					</a>
				</div>
			</div>
			
			<!--右边-->
			<div id="none" class="main-right">
				<div class="ui rail">
				  	<div class="ui sticky animated fadeInDown">
				     	<div class="ui header">最近热门期刊</div>
						<c:forEach items ="${magazineList}" var = "magazine">
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
		/* 点赞 */
		addweight = function(musicID,weight){
			$.ajax({
				type:"post",
				url:"${basePath}/addweight",
				data:{"musicID":musicID,"weight":weight},
				success:function(data){
					if(data=="success"){
						location.reload();
					}else if(data=="fail"){
						alert("请登陆！");
						window.location.href = "${basePath}/login";
					}
				}
			});
		};
		
		var vm = new Vue({
			el:"#box",
			data:{
				a:2,
			},
			methods:{
			}
		})
		</script>
		<script type="text/javascript">
			/*右侧黏贴*/
			$('.ui.sticky').sticky({
				context: '#example1',
				offset: 110,
				bottomOffset : 120,
			});
			/*顶部滚动响应*/
		 	setInterval(function() {
				//var Top = document.documentElement.scrollTop;
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
