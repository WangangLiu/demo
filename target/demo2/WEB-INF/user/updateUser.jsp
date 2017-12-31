<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<html>
<head>

<meta charset="UTF-8">
<title>修改密码页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.2.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/logins.css"
	type="text/css" />
</head>

<body>
	<div class="wrapper">
		<div class="container">
			<h1>Hello</h1>
			<form class="form"
				action="${pageContext.request.contextPath }/admin/user/update"
				method="POST">
				<input id="uName" placeholder="请输入用户名" name="userName" /> <br /> <input
					id="uPass" placeholder="请输入旧密码密码" name="userPassword11" /> <br /> <input
					id="uPass" placeholder="请重置密码" name="userPassword" /> <br />
				<button type="submit" id="login-button">确认密码</button>
				<br />
			</form>
			<h2 style="color: red">${msg }</h2>
		</div>
	</div>
</body>
</html>