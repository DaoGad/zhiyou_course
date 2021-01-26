<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>客户系统 - 后台管理</title>
	<link rel="stylesheet" href="<c:url value= "/css/admin.css"/>">
	<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css"/>">
</head>
<body>
<div class="header">
	<h1><a href="#">CRM</a></h1>
	<div class="nav">
		<a target="right" href="#">工作台</a>
		<a target="right" href="#">报表</a>
		<a target="right" href="#">客户信息</a>
		<a target="right" href="#">员工信息</a>
		<a target="right" href="#">公告信息</a>
		<a target="right" href="#">发件箱</a>
	</div>
	<div class="user">
		<a href="#">${username} 用户</a>
		<a href=<c:url value="/login.jsp"/>>退出</a>
	</div>
</div>
<div class="main">
	<ul class="left-side">
		<li class="menu-title">
			<a href="#">
				<i class=" fa fa-users"></i>&nbsp;&nbsp;客户管理
			</a>
		</li>
		<li class="sub-menu">
			<ul>
				<li>
					<a href="<c:url value="view/user/list.jsp"/>" target="pageBox">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房屋信息
					</a>
				</li>
			</ul>
		</li>
		<li class="menu-title">
			<a href="#">
				<i class=" fa fa-users"></i>&nbsp;&nbsp;内部信息
			</a>
		</li>
		<li class="sub-menu">
			<ul>
				<li>
					<a  href="#" target="pageBox">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房租信息
					</a>
				</li>

			</ul>
		</li>
		<li class="menu-title active">
			<a href="#">
				<i class=" fa fa-file-text"></i>&nbsp;&nbsp;站内邮件
			</a>
		</li>
		<li class="sub-menu">
			<ul>
				<li class="active">
					<a target="pageBox" href=<c:url value="/mail/write"/> target="pageBox">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;写邮件
					</a>
				</li>
				<li>
					<a target="pageBox" href=<c:url value="/mail/receive"/> target="pageBox">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;收件箱
					</a>
				</li>
				<li>
					<a target="pageBox" href=<c:url value="/mail/send"/> target="pageBox">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;发件箱
					</a>
				</li>
				<li>
					<a target="pageBox" href=<c:url value="/mail/draftBox"/>>
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;草稿箱
					</a>
				</li>
				<li>
					<a  href="<c:url value="/mail/deleteBox"/>" target="pageBox">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;垃圾箱
					</a>
				</li>

			</ul>
		</li>
		<li class="menu-title">
			<a href="#" >
				<i class="fa-sitemap active"></i>&nbsp;&nbsp;管理员
			</a>
		</li>
		<li class="sub-menu">
			<ul class="menu">
				<li>
					<a target="pageBox" href="<c:url value="/notice/list"/>">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;公告管理
					</a>
				</li>
				<li>
					<a target="pageBox" href="<c:url value="/department/findAll"/>">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;部门管理
					</a>
				</li>
				<li>
					<a target="pageBox" href="<c:url value="/role/findAll?currentPage=1"/>">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;角色管理
					</a>
				</li>
				<li class="active">
					<a target="pageBox" href="<c:url value="/user/findAll"/>">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;用户管理
					</a>
				</li>
			</ul>
		</li>
	</ul>
	<div class="right-side">
		<iframe name="pageBox" src="<c:url value="/mail/write"/>"></iframe>
		<div class="footer">
			智游教育 ©2018 河南智游臻龙教育科技有限公司
		</div>
	</div>
</div>
<script src="<c:url value="/lib/jquery/jquery.js"/>">  </script>
<script src="<c:url value="/js/admin.js"/>"> </script>
</body>
</html>