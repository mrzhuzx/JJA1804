<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1 0001
  Time: 上午 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../appcomm/basePath.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="userinfo/update.do?userId=${search.userId}" method="post">
    <table style="width:50%;border:1px ">
        <tr>
            <td>userCode</td>
            <td>userName</td>
            <td>userPassword</td>
            <td>userPhone</td>
            <td>userAddress</td>
            <td></td>
        </tr>
        <tr>
            <td> <input type="text" name="userCode" value="${search.userCode}"></td>
            <td> <input type="text" name="userName" value="${search.userName}"></td>
            <td> <input type="text" name="userPassword" value="${search.userPassword}"></td>
            <td> <input type="text" name="userPhone" value="${search.userPhone}"></td>
            <td> <input type="text" name="userAddress" value="${search.userAddress}"></td>
            <td><button class="button" type="submit">修改</button></td>
        </tr>

    </table>
</form>

</body>
</html>
