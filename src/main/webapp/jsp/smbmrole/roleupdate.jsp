<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1 0001
  Time: 下午 5:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../appcomm/basePath.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="smbmrole/update.do?roleId=${role.roleId}" method="post">
    <table style="width:50%;border:1px ">
        <tr>
            <td>roleName</td>
            <td>roleStatus</td>
            <td>roleDesc</td>
            <td>roleCode</td>
        </tr>
        <tr>
            <td> <input type="text" name="roleName" value="${role.roleName}"></td>
            <td> <input type="text" name="roleStatus" value="${role.roleStatus}"></td>
            <td> <input type="text" name="roleDesc" value="${role.roleDesc}"></td>
            <td> <input type="text" name="roleCode" value="${role.roleCode}"></td>
            <td><button class="button" type="submit">修改</button></td>
        </tr>

    </table>
</form>
</body>
</html>
