<%@page import="cn.acl.entity.t_users"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<link rel="stylesheet" href="css/logins.css" type="text/css" />
<style type="text/css">
</style>
</head>
<body>
<div class="wrapper">
	<div class="container">
		<h1>棋牌云网站后台系统</h1>
		<form class="form"  action="${pageContext.request.contextPath }/logins" method="POST">
			<input id="uName" placeholder="用户名" name="userName" type="text" /> <br/>
			<input id="uPass" placeholder=" 密码"  name="userPassword" type="password" /> <br/>
			<button type="submit" id="login-button" >登录</button><br/>
		</form>
		<h2 style="color: red">${msg }</h2>
	</div>
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>
</body>
</html>