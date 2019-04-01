<%@include file="../appcomm/basePath.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <link rel="stylesheet" type="text/css" href="css/WdatePicker.css" />
    <link rel="stylesheet" type="text/css" href="css/skin_/form.css" />
    <link href="umeditor/themes/default/_css/umeditor.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/global.js"></script>
    <script type="text/javascript" src="js/jquery.select.js"></script>
    <script type="text/javascript" src="js/WdatePicker.js"></script>
    <script type="text/javascript">
        window.UMEDITOR_HOME_URL = 'umeditor/';  // 请换成绝对路径
    </script>
    <script type="text/javascript" src="js/umeditor.config.js"></script>
    <script type="text/javascript" src="js/editor_api.js"></script>
    <script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
    <title>基础信息</title>
</head>

<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/WdatePicker.css" />
<link rel="stylesheet" type="text/css" href="css/skin_/form.css" />
<link href="umeditor/themes/default/_css/umeditor.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script type="text/javascript" src="js/jquery.select.js"></script>
<script type="text/javascript" src="js/WdatePicker.js"></script>
<script type="text/javascript">
    window.UMEDITOR_HOME_URL = 'umeditor/';  // 请换成绝对路径
</script>
<script type="text/javascript" src="js/umeditor.config.js"></script>
<script type="text/javascript" src="js/editor_api.js"></script>
<script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
<title>基础信息</title>
</head>

<form action="product/save.do" method="post">
    <table border="1">
        <tr>
            <td>productName</td>
            <td><input name="productName" value="哈士奇"></td>

        </tr>
        <tr><td>productPrice</td>
            <td><input name="productPrice" value="100.0"></td>

        </tr>
        <tr><td>productStock</td>
            <td><input name="productStock" value="10"></td>

        </tr>
        <tr><td>productDescription</td>
            <td><input name="productDescription" value="哈士奇"></td>

        </tr>
        <tr><td>productIcon</td>
            <td><input type="productIcon" value="https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D21%2C0%2C980%2C647%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=91c9a50cdd39b600598155f7d4620406/b999a9014c086e06999299a40a087bf40ad1cb23.jpg"></td>
        </tr>
        <tr>
            <td>productStatus</td>
            <td><input type="productStatus" value="1"></td>
        </tr>
        <tr>
            <td>categoryType</td>
            <td><input type="categoryType" value="1"></td>
            <td><input type="abc" value="1"></td>
        </tr>

    </table>
    <input  type="submit"  value="提交">
</form>

</html>
