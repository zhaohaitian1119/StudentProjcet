<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<center>
    <table border="1px" width="700px">
        <p style="color: red;font-size: 20px">学员信息列表</p>
        <tr>
            <td colspan="7" style="text-align: right;background-color: white;"><a href="/toAdd">添加学员</a></td>
        </tr>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>电话</td>
            <td>email</td>
            <td>班级</td>
        </tr>

        <c:forEach items="${students}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.gender}</td>
                <td>${item.age}</td>
                <td>${item.telephone}</td>
                <td>${item.email}</td>
                <td>${item.classname}</td>
            </tr>

        </c:forEach>

    </table>
</center>

</body>
</html>
<script type="text/javascript">
    $("tr:odd").css("background-color","#ccc");
    $("tr:eq(1)").css("background-color","#CCBBAB");


</script>
