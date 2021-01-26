<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XX系统 - 房屋信息管理</title>
	<link rel="stylesheet" href='<c:url value="/css/main.css"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/lib/font-awesome/css/font-awesome.css"></c:url>'>
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="box">
	<h3>房屋信息管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href='<c:url value="TT"></c:url>'>添加房屋信息</a>
		</div>
	</div>

<a onclick="deleteAll()"><button>确认删除</button> </a>

<form action="like" method="post">
  <input type="text" name="likename" value="${likename }">
  <button type="submit">查询</button>
</form>

	<table class="list">
		<tr>
		    <th>全选<input type="checkbox" id="c" onclick="checkAll()"></th>
			<th>序号</th>
			<th>关联房屋</th>
			<th>关联后勤</th>
			<th>时间</th>
			<th>结果</th>
			<th>房子序号</th>
			<th>小区</th>
			<th>楼层</th>
			<th>房间号</th>
			<th>面积(平米)</th>
			<th>朝向</th>
			<th>装修</th>
			<th>是否双气</th>
			<th>出租价格(元/月)</th>
			<th>出租状态</th>
			<th>添加时间</th>
			<th>更新时间</th>
			<th>后勤序号 </th>
			<th>后勤名字 </th>
			<th>卡号 </th>
			<th>电话 </th>
			<th>性别 </th>
			<th>添加时间 </th>
			<th>工资 </th>
		</tr>
<c:forEach items="${list }" var="maintain" varStatus="i">
		<tr>
		    <td><input type="checkbox" value="${maintain.mid }" class="cc" name="checkOne"></td>
			<td>${maintain.mid }</td>
			<td>${maintain.mhid }</td>
			<td>${maintain.mloid }</td>
			<td>${maintain.mtime }</td>
			<td>${maintain.mresult }</td>
			<td>${maintain.house.hid } </td>
			<td>${maintain.house.haddress } </td>
			<td>${maintain.house.hfloor } </td>
			<td>${maintain.house.hroomNum } </td>
			<td>${maintain.house.harea } </td>
			<td>${maintain.house.hdir } </td>
			<td>${maintain.house.hdeco == 1 ? '毛坯' : maintain.house.hdeco== 2 ? '简装' : '精装' } </td>
			<td>${maintain.house.hair == 1 ? '是' : '否' } </td>
			<td>${maintain.house.hprice } </td>
			<td>${maintain.house.hrentStatus == 1 ? '已出租' : maintain.house.hrentStatus== 2 ? '未出租' : '停止出租' } </td>
			<td>${maintain.house.haddTime } </td>
			<td>${maintain.house.hupdateTime } </td>
			<td>${maintain.logi.loid } </td>
			<td>${maintain.logi.loname } </td>
			<td>${maintain.logi.loidCard } </td>
			<td>${maintain.logi.lotel } </td>
			<td>${maintain.logi.losex } </td>
			<td>${maintain.logi.loaddTime } </td>
			<td>${maintain.logi.losalary } </td>
			<td>
				<a class="fa fa-pencil" title="编辑" href='<c:url value="edit?mid=${maintain.mid }"></c:url>'></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href='<c:url value="delete?mid=${maintain.mid }" ></c:url>'></a>
			</td>
		</tr>
</c:forEach>		
	</table>
	<div class="pager-info">
		<div>共有 ${total } 条记录，第 ${pageNo }/${pageCount } 页 </div>
		<div>
			<ul class="pagination">
			
				<li class="${pageNo <= 1 ? 'disabled' : '' }">
				
			<c:choose>
				<c:when test="${pageNo > 1 && pageNo <= pageCount }">
				<a href='<c:url value="like?pageNo=${pageNo-1 }&likename=${likename } "></c:url>'>上一页</a>
				</c:when>
				<c:otherwise>
				<a href='<c:url value="#"></c:url>'>上一页</a>
				</c:otherwise>
			</c:choose>
			
			    <%-- <a href="${pageNo > 1 && pageNo <= pageCount ? ' "<c:url value='like?pageNo=${pageNo-1 }&likename=${likename } '></c:url>" ' : '#' } ">上一页</a> --%>
			
			
				</li>
				
				<!-- <li class="paginate_button active"><a href="#">1</a></li> -->
				<c:forEach begin="1" end="${pageCount > 5 ? 5 : pageCount }" varStatus="i" >
				  <li class="paginate_button active"><a href='<c:url value="like?pageNo=${i.index }&likename=${likename }"></c:url>'>${i.index }</a></li>
				</c:forEach>
				<%-- <c:if test="${pageCount != null } ">
				</c:if > --%>
				
				<li class="${pageNo >= pageCount ? 'disabled' : '' }">
				
		    <c:choose>
				<c:when test="${pageNo < pageCount }">
				<a href='<c:url value="like?pageNo=${pageNo+1 }&likename=${likename } "></c:url>'>上一页</a>
				</c:when>
				<c:otherwise>
				<a href='<c:url value="#"></c:url>'>下一页</a>
				</c:otherwise>
			</c:choose>
			
				</li>
			</ul>
		</div>
	</div>
</div>
<script src='<c:url value="/lib/jquery/jquery.js"></c:url>' ></script>
<script>
function confirmDelete(id){
	if (confirm("确定要删除码？")) {
		alert('发送删除请求，刷新页面（不要异步）');
	}
	return false;
}
function checkAll(){
	if(c.checked == true){
		var list = document.getElementsByClassName("cc");
		for(var i = 0;i < list.length;i++){
			list[i].checked = true;
		}
	}else if(c.checked == false){
		var list = document.getElementsByClassName("cc");
		for(var i = 0;i < list.length;i++){
			list[i].checked = false;
	    }
    }
}
function deleteAll(){
	var ids = new Array();
	var checkArr = document.getElementsByName("checkOne");
	for(var i = 0;i < checkArr.length;i++){
		if(checkArr[i].checked){
			ids.push(checkArr[i].value);
		}
	}
	if(ids.length > 0){
		window.location.href="deleteAll?ids="+ids;
	}
}

</script>
</body>
</html>