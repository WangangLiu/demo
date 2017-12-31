<%@page import="cn.acl.entity.Qpnews"%>
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/pws.js"></script>
  </head>  
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <ul class="navbar-list clearfix">
                <li><a class="on" href="${pageContext.request.contextPath}/admin/psurvey/indexa">棋牌云网站后台管理系统</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                 <li><a href="${pageContext.request.contextPath}/admin/user/select7"><shiro:principal/></a></li>
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
                        <li><a href="#"><i class="icon-font">&#xe037;</i>用户信息</a></li>
                        <li><a href="system.jsp"><i class="icon-font">&#xe046;</i>部门管理</a></li>
                        <li><a href="system.jsp"><i class="icon-font">&#xe045;</i>个性化设置</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="${pageContext.request.contextPath}/admin/psurvey/indexa">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">新闻管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
           <form action="${pageContext.request.contextPath}/admin/picture/fenye" method="get">
           					 
            					<input  type="hidden" id="pageNo" name="pageNo" value="1" /> 
						     标题：<input class="common-text" type="text" name="title" value="${sessionScope.title}" /> 
                           		<!-- <input class="common-text" placeholder="关键字" name="keywords" value="" id="" type="text"> -->
                          		<input type="button" name="btnSearch" value="查询" />
           	</form>
                    <table class="search-tab">
                        <tr>
                            <td> <a href="${pageContext.request.contextPath}/admin/picture/insert"><input class="btn btn-success btn2" name="sub" value="新增" type="button"></a></td>
                        </tr>
                    </table>
            </div>
        </div>
        <div class="result-wrap">
                <div class="result-content">
                  <table class="result-tab" style="width:100% " >
                        <tr >
                         	<th style="text-align: center;width: 13%">编号</th>
							<th style="text-align: center;width: 51%">标题</th>
							<th style="text-align: center;width: 12%">时间</th>
							<th style="text-align: center;width: 17%" colspan="2">编辑</th>
                        </tr>
                
                   	</table>
				<table class="result-tab" style="width:100% " >
               		<c:forEach items="${sessionScope.list }" var="ls"> 
						<tr>
							<td style="text-align: center;width: 13%">${ls.keyid}</td>
							<td style="text-align: center;width: 51%"><a href="${pageContext.request.contextPath }/admin/picture/view2?keyid=${ls.keyid}">${ls.title}</a></td>
							<td style="text-align: center;width: 12%">${ls.ntime}</td>
							<td style="text-align: center;width: 17%">
                              <a class="link-update" href="${pageContext.request.contextPath}/admin/picture/update1?keyid=${ls.keyid}">
                              <input class="btn btn-primary btn2" type="button" value="修改"/></a>
                              <a class="link-del" href="${pageContext.request.contextPath}/admin/picture/delete1?keyid=${ls.keyid}">
                              <input class="btn btn-danger" type="button" value="删除" onclick="return delet();" /></a>
                            </td> 
						</tr>
					</c:forEach> 
						<tr>
							<td colspan="9" align="center" valign="middle">
								<a href="javascript:do_page(1)">首页</a>&nbsp;&nbsp;&nbsp; 
								<a href="javascript:do_page(${sessionScope.pageNo-1 })">上一页</a>&nbsp;&nbsp;&nbsp;
								
								<a href="javascript:do_page(${sessionScope.pageNo+1 }		)">下一页</a>&nbsp;&nbsp;&nbsp;
								
								<a href="javascript:do_page(${sessionScope.totalPage })">末页</a>&nbsp;&nbsp;&nbsp;
									第${sessionScope.pageNo}页/共${sessionScope.totalPage}页&nbsp;&nbsp;&nbsp;
				
									<input type="text" id="PageNumber" size="8" />&nbsp;&nbsp; 
									<input type="button" name="btnSearch" id="btnSearch" value="GO"
									onclick='javascript:do_page(document.getElementById("PageNumber").value)' />
							</td>
						</tr>
                    </table>
                </div>
        </div>
    </div>
</div>
</body>
</html>