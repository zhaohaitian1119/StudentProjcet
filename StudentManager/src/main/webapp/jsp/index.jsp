<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/9/26
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr align="center">
        <td colspan="7">
            <h3 style="color:red">学员信息列表</h3>
        </td>
    </tr>
    <tr>
        <td colspan="7" align="right">
            <a href="/add">添加学员</a>
        </td>
    </tr>
    <tr align="center">
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>电话</td>
        <td>Email</td>
        <td>班级</td>
    </tr>
    <c:forEach items="${student}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.gender}</td>
            <td>${item.age}</td>
            <td>${item.telephone}</td>
            <td>${item.email}</td>
            <td>
                <c:if test="${item.classid == 1}">
                    TCMP075
                </c:if>
                <c:if test="${item.classid == 2}">
                    TCMP076
                </c:if>
                <c:if test="${item.classid == 3}">
                    TCMP077
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
