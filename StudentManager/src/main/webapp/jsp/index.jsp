<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/9/26
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" border="1px">
    <tr>
        <td style="font-size: 32px;color: red;" colspan="7" align="center">学员信息列表</td>
    </tr>
    <tr>
        <td colspan="7" align="right"><a href="/toadd">添加学员</a></td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>电话</td>
        <td>email</td>
        <td>编辑</td>
    </tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.gender}</td>
            <td>${s.age}</td>
            <td>${s.telephone}</td>
            <td>${s.email}</td>
            <td>${s.className}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
