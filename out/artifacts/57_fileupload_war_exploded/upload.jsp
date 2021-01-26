<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/upload" method="post" enctype="multipart/form-data">
        姓名：<input type="text" name="username" placeholder="姓名" />
        头像：<input type="file" name="headImage" />
        <input type="submit" value="上传">
    </form>
</body>
</html>
