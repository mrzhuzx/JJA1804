<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28 0028
  Time: 下午 5:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../appcomm/basePath.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="userinfo/save.do" method="post">
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



        <td> <input type="text" name="userCode" value=NO.11000020></td>
        <td> <input type="text" name="userName" value=李天然></td>
        <td> <input type="text" name="userPassword" value=122332></td>
        <td> <input type="text" name="userPhone" value=15095957878></td>
        <td> <input type="text" name="userAddress" value=福建省厦门市集美区湖里小区2栋1号></td>
        <td><button class="button" type="submit">添加</button></td>
    </tr>

</table>
</form>
</body>
</html>
