<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRM系统 - 发件箱</title>
	<link rel="stylesheet" href='<c:url value="/css/main.css"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/lib/font-awesome/css/font-awesome.css"></c:url>'>
</head>
<body>
<div class="box">
	<h3>发件箱</h3>
	<form action="update" method="post">
		<table class="form-table">
			<tr>
				<td>编号</td>
				<td colspan="3" class="control">
					<input type="text" name="mid" placeholder="序号" value="${maintain.mid }" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>关联房屋</td>
				<td colspan="3" class="control">
					<input type="text" name="mhid" placeholder="关联房屋" value="${maintain.mhid }">
				</td>
			</tr>
		</table>
		<div class="buttons">
			<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
			<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
		</div>
	</form>
</div>
</body>
</html>