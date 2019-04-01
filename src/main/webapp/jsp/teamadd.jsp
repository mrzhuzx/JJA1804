<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\3\28 0028
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/team/save.do"method="post>
    <table border="1">
        <tr>
            <td>teamId</td>
            <td>teamDesc</td>
            <td>teamIcon</td>
            <td>teamName</td>
            <td>teamSlogen</td>
            <td>teamState</td>

        </tr>
        <tr>
            <td><input type="text"name="teamId"VALUE="1"></td>
            <td><input type="text"name="teamDesc"VALUE="1"></td>
            <td><input type="text"name="teamIcon"VALUE="1"></td>
            <td><input type="text"name="teamName"VALUE="1"></td>
            <td><input type="text"name="teamSlogen"VALUE="1"></td>
            <td><input type="text"name="teamState"VALUE="1"></td>
        </tr>



    </table>
<button type="submit" class="btn bg-maroon">添加</button>
</form>

</body>
</html>
