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
	    <script type="text/javascript">
     $(function(){
		  $(".pws").hover(function(){
                $(".pwss").css("display","block")
            },$(this).click(function(){
                $(".pwss").css("display","none")
            }));
              $(".yc").hover(function(){
                $("#yc").css("display","block")
            },$(this).click(function(){
                $("#yc").css("display","none")
            }))
		    
		    
		    });
		function delet() {
		    return confirm("是否删除");}
	</script>
</head>

<body>
	<div class="topbar-wrap white">
		<div class="topbar-inner clearfix">
			<div class="topbar-logo-wrap clearfix">
				<h1 class="topbar-logo none">
					<a href="${pageContext.request.contextPath}/admin/user/indexa" class="navbar-brand">后台管理</a>
				</h1>
				<ul class="navbar-list clearfix">
					<li><a class="on"
						href="${pageContext.request.contextPath}/admin/user/indexa">首页</a></li>
					<li><a href="#" target="_blank">网站首页</a></li>
				</ul>
			</div>
			<div class="top-info-wrap">
				<ul class="top-info-list clearfix">
					<li><a href="${pageContext.request.contextPath}/admin/user/select7"> 
							<shiro:principal/>
					</a></li>
					<li><a
						href="#">修改密码</a></li>
					<li><a href="${pageContext.request.contextPath }/admin/user/logins">退出</a></li>
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
						<ul class="sub-menu">
							<li><a href="${pageContext.request.contextPath}/select"><i
									class="icon-font">&#xe008;</i>棋牌文化管理</a></li>
							<li><a href="${pageContext.request.contextPath}/select1"><i
									class="icon-font">&#xe005;</i>新聞管理</a></li>
							<li><a href="${pageContext.request.contextPath}/select9"><i class="icon-font">&#xe006;</i>赛事管理</a></li>
						 <li style=" margin: 0px; padding: 0px;"><a href="#" class="pws" ><i class="icon-font">&#xe012;</i>网站管理</a>
                        	<ul style="display: none;" class="pwss">
                        		<li><a href="${pageContext.request.contextPath}/select4">&nbsp;&nbsp;&nbsp;&nbsp;概况管理</a></li>
                        		<li><a href="${pageContext.request.contextPath}/select5">&nbsp;&nbsp;&nbsp;&nbsp;联系我们</a></li>
                        		<li><a href="${pageContext.request.contextPath}/select6">&nbsp;&nbsp;&nbsp;&nbsp;通知公告</a></li>
                        		<li><a href="${pageContext.request.contextPath}/select">&nbsp;&nbsp;&nbsp;&nbsp;政策法规</a></li>
                        		<li><a href="${pageContext.request.contextPath}/select7">&nbsp;&nbsp;&nbsp;&nbsp;轮播图</a></li>
                        	</ul>
                        </li>
						</ul></li>
					<li><a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
						<ul class="sub-menu">
							<li><a href="${pageContext.request.contextPath}/admin/user/select7"><i class="icon-font">&#xe017;</i>角色管理</a></li>
							<li><a href="${pageContext.request.contextPath}/admin/qpgame/select0"><i class="icon-font">&#xe037;</i>用户信息</a></li>
							<li><a href="system.jsp"><i class="icon-font">&#xe046;</i>部门管理</a></li>
							<li><a href="system.jsp"><i class="icon-font">&#xe045;</i>个性化设置</a></li>
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
						action="${pageContext.request.contextPath}/admin/qpgame/update5.do"
						method="post">
						<table class="insert-tab" width="100%">
							<tbody>
								<tr>
									<th width="120"><i class="require-red"></i>编号：</th>
									<td><input class="common-text" type="text" id="keyid" value="${f.keyid}"
										name="keyid" /></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>标题：</th>
									<td><textarea class="common-textarea" name="title" value="${f.title}"
											id="title" cols="30" style="width: 90%;" rows="7"></textarea></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>标题图片：</th>
									<td><input class="common-text required" id="titleimg"
										name="titleimg" size="50" value="${f.titleimg}" type="text"></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>时间：</th>
									<td><input class="common-text required" id="gtime"
										name="gtime" size="50" value="${f.gtime}" type="text"></td>
								</tr>
								<tr>
									<th><i class="require-red"></i>开始时间：</th>
									<td><input class="common-text required" id="starttime"
										name="starttime" size="50" value="${f.starttime}" type="text"></td>
								</tr>
								<tr> 
								<th></th>
									<td><input class="btn btn-primary btn6 mr10" value="提交"
										type="submit"> <input class="btn btn6"
										onclick="history.go(-1)" value="返回" type="button"></td>
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