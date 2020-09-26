
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/doadd" method="post">
    <table align="center" border="1px">
        <tr>
            <td colspan="2" align="center">学员信息添加</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" class="name"/></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="gender" class="gender"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" class="age"/></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="telephone" class="telephone"/></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email" class="email"/></td>
        </tr>
        <tr>
            <td>班级</td>
            <td>
                <select name="classid">
                    <option value="0">请选择</option>
                    <c:forEach var="c" items="${classes}">
                        <option value="${c.id}">${c.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" class="cun" value="保存"/>
                <input type="reset" value="返回" onclick="back()">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script type="text/javascript">
   $(".cun").click(function () {
       var name=$(".name").val();
       var gender=$(".gender").val();
       var age=$(".age").val();
       var telephone=$(".telephone").val();
       var email=$(".email").val();
       if(name==""||gender==""||age==""||telephone==""||email==""){
           alert("请填写完整信息！");
           return false;
       }
   })
    function back() {
        location.href="javascript:history.back(-1)";
    }
</script>
