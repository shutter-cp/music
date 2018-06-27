<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'error.jsp' starting page</title>
    <%@include file="common/context.jsp" %>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <style type="text/css">
		.main{
			width: 960px;
			margin: 20% auto;
		}
	</style>
	<div class="main">
		<div class="ui center aligned red segment">
			<h1>ERROR</h1>
		</div>
		<div class="ui center aligned segment">
			<h2>File upload failure</h2>
			<h3>Please check</h3>
		</div>
	</div>
  </body>
</html>
