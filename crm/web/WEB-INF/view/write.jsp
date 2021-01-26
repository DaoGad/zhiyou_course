<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRM系统 - 写邮件</title>
	<link rel="stylesheet" href='<c:url value="/css/main.css"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/lib/font-awesome/css/font-awesome.css"></c:url>'>
</head>
<body>
<div class="box">
	<h3>写邮件</h3>
	<form action="write" method="post">
	<table class="form-table">
			<tr>
				<td>收件人</td>
				<td colspan="3" class="control">
						<select name="uname">
					<c:forEach items="${list}" var="user" varStatus="i">
							<option value="${user.uid}">${user.uname}</option>
					</c:forEach>
						</select>
				</td>
			</tr>
			<tr>
				<td>主题</td>
				<td colspan="3" class="control">
					<input type="text" name="mtheme" placeholder="主题" >
				</td>
			</tr>
			<tr>
				<td>内容</td>
				<td colspan="3" class="control">
<%--					<input type="text" name="mcontent" placeholder="内容" >--%>
					<textarea name="mcontent" placeholder="内容"></textarea>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="hidden" name="hidden" value="1" id="b1">
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="hidden" name="username" value="${username}">
				</td>
			</tr>
	</table>
	<div class="buttons">
		<input class="btn btn-primary va-bottom" type="submit" value="发送" name="send">&nbsp;&nbsp;
		<input class="btn btn-primary va-bottom" type="submit" value="保存草稿箱" name="save" onclick="c1()">&nbsp;&nbsp;
		<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
	</div>
	</form>
</div>
<script src="<c:url value="/lib/jquery/jquery.js"/> "></script>
<script>
	function c1() {
		$("#b1").val(2);
	}
</script>
</body>
</html>