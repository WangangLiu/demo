<!doctype html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<html>
<head>
<meta charset="UTF-8">
<title>后台管理</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/main.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/libs/modernizr.min.js"></script>
</head>
<body>
	<div class="topbar-wrap white">
		<div class="topbar-inner clearfix">
			<div class="topbar-logo-wrap clearfix">
				 <ul class="navbar-list clearfix" >
                <li><a class="on" href="${pageContext.request.contextPath}/admin/psurvey/indexa">棋牌云网站后台管理系统</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                 <li><a href="${pageContext.request.contextPath}/admin/user/select7"><shiro:principal/></a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="${pageContext.request.contextPath}/admin/user/logout">退出</a></li>
            </ul>
			</div>
		</div>
	</div>
	<div class="container clearfix">
		<div class="sidebar-wrap">
			<div class="sidebar-title">
				<h1>菜单</h1>
			</div>
			<div class="sidebar-content">
				<ul class="sidebar-list">
					<li><a href="#"><i class="icon-font">&#xe003;</i>列表</a>
					<ul class="sub-menu" >
                        <li style=" margin: 0px; padding: 0px;"><a href="${pageContext.request.contextPath}/admin/picture/select"><i class="icon-font">&#xe008;</i>棋牌文化管理</a></li>
                        <li style=" margin: 0px; padding: 0px;"><a href="${pageContext.request.contextPath}/admin/picture/select1"><i class="icon-font">&#xe005;</i>新闻管理</a></li>
                        <li style=" margin: 0px; padding: 0px;"><a href="${pageContext.request.contextPath}/admin/qpgame/select9"><i class="icon-font">&#xe006;</i>赛事管理</a></li>
                        <li style=" margin: 0px; padding: 0px;"><a href="${pageContext.request.contextPath}/admin/pinterview/select3"><i class="icon-font">&#xe004;</i>人物专访</a></li>
                        <li style=" margin: 0px; padding: 0px;"><a href="#" class="pws" ><i class="icon-font">&#xe012;</i>网站管理</a>
                        	<ul style="display: none;" class="pwss">
                        		<li><a href="${pageContext.request.contextPath}/admin/psurvey/select4">&nbsp;&nbsp;&nbsp;&nbsp;概况管理</a></li>
                        		<li><a href="${pageContext.request.contextPath}/admin/pinformation/select5">&nbsp;&nbsp;&nbsp;&nbsp;联系我们</a></li>
                        		<li><a href="${pageContext.request.contextPath}/admin/pnotice/select6">&nbsp;&nbsp;&nbsp;&nbsp;通知公告</a></li>
                        		<li><a href="${pageContext.request.contextPath}/admin/picture/select">&nbsp;&nbsp;&nbsp;&nbsp;政策法规</a></li>
                        		<li><a href="${pageContext.request.contextPath}/admin/picture/select7">&nbsp;&nbsp;&nbsp;&nbsp;轮播图</a></li>
                        	</ul>
                        </li>
                    </ul>
                    </li>
					<li><a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
						<ul class="sub-menu">
							<li><a href="${pageContext.request.contextPath}/admin/user/select7"><i class="icon-font">&#xe017;</i>角色管理</a></li>
							<li><a href="${pageContext.request.contextPath}/admin/qpuser/select0"><i class="icon-font">&#xe037;</i>用户信息</a></li>
							<li><a href="#"><i class="icon-font">&#xe046;</i>部门管理</a></li>
							<li><a href="#"><i class="icon-font">&#xe045;</i>个性化设置</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!--/sidebar-->
		<div class="main-wrap">

			<div class="crumb-wrap">
				<div class="crumb-list">
					<i class="icon-font"></i><a
						href="${pageContext.request.contextPath}/admin/user/index">首页</a>
						<span
						class="crumb-step">&gt;</span>
						<a class="crumb-name"
						href="${pageContext.request.contextPath}/admin/picture/select">作品管理</a>
						<span
						class="crumb-step">&gt;</span><span>修改</span>
				</div>
			</div>
			<div class="result-wrap">
				<div class="result-content">
					<form
						action="${pageContext.request.contextPath}/admin/qpuser/update0.do"
						method="post">
						<table class="insert-tab" width="100%">
							<tbody>
							<tr>
									<th><i class="require-red"></i>id：</th>
									<td><input class="common-text required" type="text" id="keyid"
										name="keyid"  size="50" value="${f.keyid}"/></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>名称：</th>
									<td><input class="common-text required" type="text" id="username"
										name="username"  size="50" value="${f.username}"/></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>密码：</th>
									<td><input class="common-text required"  type="password" name="pwd"
											id="pwd" size="50" value="${f.pwd}"></input></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>id的名称：</th>
									<td><input class="common-text required" id="idname"
										name="idname" size="50" value="${f.idname}" type="text"></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>id的号码：</th>
									<td><input class="common-text required" id="idcard"
										name="idcard" size="50" value="${f.idcard}" type="text"></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>电话：</th>
									<td><input class="common-text required" id="telephone"
										name="telephone" size="50" value="${f.telephone}" type="text"></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>地址：</th>
									<td><input class="common-text required" id="addres"
										name="addres" size="50" value="${f.addres}" type="text"></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>类型：</th>
									<td><input class="common-text required" id="utype"
										name="utype" size="50" value="${f.utype}" type="text"></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>水平：</th>
									<td><input class="common-text required" id="ulevel"
										name="ulevel" size="50" value="${f.ulevel}" type="text"></td>
								</tr>
								<tr>
									<th></th>
									<td><input class="btn btn-primary btn6 mr10" value="提交"
										type="submit" onclick="return add();"> <input
										class="btn btn6" onclick="history.go(-1)" value="返回"
										type="button"></td>
								</tr>
							</tbody>
						</table>
					</form>
				</div>
			</div>

		</div>
		<!--/main-->
	</div>
</body>
</html>