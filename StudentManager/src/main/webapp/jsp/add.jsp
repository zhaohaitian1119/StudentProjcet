<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<center>
    <p style="color: red;font-size: 20px;">学员添加信息</p>
    <form method="post" action="/add">
        <table border="1px">
            <tr>
                <td style="background-color: #ccc;">姓名</td>
                <td><input type="text" name="name" /></td>
            </tr>

            <tr>
                <td style="background-color: #ccc;">性别</td>
                <td><input type="text" name="gender" /></td>
            </tr>

            <tr>
                <td style="background-color: #ccc;">年龄</td>
                <td><input type="text" name="age" /></td>
            </tr>

            <tr>
                <td style="background-color: #ccc;">电话</td>
                <td><input type="text" name="telephone" /></td>
            </tr>

            <tr>
                <td style="background-color: #ccc;">email</td>
                <td><input type="text" name="email" /></td>
            </tr>

            <tr>
                <td style="background-color: #ccc;">班级</td>
                <td>
                        <select name="classid">
                            <option value="请选择">请选择</option>
                                <c:forEach items="${classes}" var="item">
                                    <option value="${item.id}">${item.name}</option>
                                </c:forEach>
                        </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;"><input type="submit" value="保存"><input type="button" value="返回"></td>
            </tr>
        </table>
    </form>
</center>

</body>
</html>
<script type="text/javascript">
   $("form").submit(function () {
       var name=$("[name=name]").val();
       if(name==""){
           alert("姓名不能为空");
           return false;
       }

       var gender=$("[name=gender]").val();
       if(gender==""){
           alert("性别不能为空");
           return false;
       }

       var age=$("[name=age]").val();
       if(age==""){
           alert("年龄不能为空");
           return false;
       }

       var telephone=$("[name=telephone]").val();
       if(telephone==""){
           alert("电话不能为空");
           return false;
       }

       var email=$("[name=email]").val();
       if(email==""){
           alert("邮箱不能为空");
           return false;
       }

       var classid=$("[name=classid]").val();
       if(classid=="请选择"){
           alert("请选择班级");
           return false;
       }

   })
</script>
