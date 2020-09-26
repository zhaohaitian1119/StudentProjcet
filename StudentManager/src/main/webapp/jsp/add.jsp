<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/9/26
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doadd" method="post">
    <table border="1px">
        <tr>
            <td colspan="2">
                <h3>学员信息添加</h3>
            </td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="text" name="gender"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>电话:</td>
            <td><input type="text" name="telephone"></td>
        </tr>
        <tr>
            <td>email:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>班级:</td>
            <td>
                <select name="classid">
                    <c:forEach items="${classes}" var="item">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
                <input type="button" onclick="javascript:history.back(-1);" value="返回">
            </td>
        </tr>
    </table>
</form>
<script src="/static/js/jquery-1.12.4.js"></script>
<script>
    $("form").submit(function () {
        var name = $("[name ='name']").val();
        var gender = $("[name ='gender']").val();
        var age = $("[name ='age']").val();
        var telephone = $("[name ='telephone']").val();
        var email = $("[name ='email']").val();
        if(name == ""){
            alert("姓名不能为空");
            return false;
        }
        if(gender == ""){
            alert("性别不能为空");
            return false;
        }
        if(age == ""){
            alert("年龄不能为空");
            return false;
        }
        if(telephone == ""){
            alert("电话不能为空");
            return false;
        }
        if(email == ""){
            alert("邮箱能为空");
            return false;
        }
        return true;

    })
</script>
</body>
</html>
