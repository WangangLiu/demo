<!doctype html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/modernizr.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        	function GetTime() {
		var time = new Date();
		var year = time.getFullYear();
		var month = time.getMonth() + 1; // 月份从0开始
		var day = time.getDate(); // 注意是getDate()
		var hour = time.getHours();
		var minute = time.getMinutes();
		var sec = time.getSeconds();
		var timestring;
		if (minute < 10) {
			timestring = year + "年" + month + "月" + day + "日		" + hour + "时 :0"
					+ minute + "分 :" + sec+"秒";
		} else if (sec < 10) {
			timestring = year + "年" + month + "月" + day + "日		" + hour + "时 :"
					+ minute + "分 :0" + sec+"秒";
		} else {
			timestring = year + "年" + month + "月" + day + "日		" + hour+ "时 :"
					+ minute + "分 :" + sec +"秒";
		}
		$("#time1").html(timestring);
	}
	$(function() {
		window.setInterval("GetTime()", 1000);
	});
      
    
		
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
		 
        
    </script>
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
                <li><a href="#">棋牌首页</a></li>
                <li><a href="${pageContext.request.contextPath}/admin/user/logout">退出</a></li>
            </ul>
        </div>
    </div>
</div>
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
             <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>棋牌</a>
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
                <li>
                    <a href="#" class="yc"><i class="icon-font">&#xe018;</i>系统管理</a>
                    <ul class="sub-menu" style="display: none;" id="yc">
                        <li><a href="${pageContext.request.contextPath}/admin/user/select7"><i class="icon-font">&#xe017;</i>角色管理</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/qpuser/select0"><i class="icon-font">&#xe037;</i>用户信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/picture/fenye"><i class="icon-font">&#xe046;</i>fenye</a></li>
                        <li><a href="#"><i class="icon-font">&#xe045;</i>个性化设置</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
    <div class="main-wrap">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font">&#xe06b;</i><span>欢迎使用本系统</span></div>
        </div>
        <div class="result-wrap">
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>湖北省棋牌运动门户后台管理系统</h1>
            </div>
            
        <div class="result-wrap">
            <div class="result-title">
                <h1>用户管理</h1>
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">用户：</label><shiro:authenticated>目前<span style="color: red">【<shiro:principal/>】</span>正在登录中</shiro:authenticated>
                    </li>
                <%--     <li><label class="res-lab">登出：</label> ${info }</li> --%>
                   <!--  <li>
                        <label class="res-lab">欢迎您：</label>
                        <span>
					  		<shiro:hasRole name="admin">
								欢迎拥有admin角色的用户！！这里是显示主体的信息
							</shiro:hasRole>
					
							<shiro:hasPermission name="student:create">
								欢迎有student:create权限的用户！！<shiro:principal/>
							</shiro:hasPermission>
					  	</span>
                    </li> -->
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>