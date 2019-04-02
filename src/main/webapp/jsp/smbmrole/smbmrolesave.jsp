<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28 0028
  Time: 下午 5:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../appcomm/basePath.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="smbmrole/save.do" method="post">
<table style="width:50%;border:1px ">
   <tr>
       <td>roleCode</td>
       <td>roleName</td>
       <td>roleDesc</td>
       <td>roleStatus</td>
       <td></td>
   </tr>
    <tr>
        <td> <input type="text" name="roleCode" value=NO.1200022></td>
        <td> <input type="text" name="roleName" value=李天然></td>
        <td> <input type="text" name="roleDesc" value=店员></td>
        <td> <input type="text" name="roleStatus" value=0></td>
        <td><button class="button" type="submit">添加</button></td>
    </tr>

</table>
</form>
</body>
</html>
