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

<form method="post"  action="product/save.do">
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
            <td><input type="productIcon" value="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1553836857173&di=19cdfcd2e3f69cd9e32a3787d48be095&imgtype=0&src=http%3A%2F%2Fgss0.baidu.com%2F-vo3dSag_xI4khGko9WTAnF6hhy%2Fzhidao%2Fpic%2Fitem%2F9358d109b3de9c827c5b22e56081800a19d8439a.jpg"></td>
        </tr>
        <tr><td>productStatus</td>
            <td><input type="productStatus" value="1 "></td>
        </tr>
        <tr><td>categoryType</td>
            <td><input type="categoryType" value="1 "></td>
        </tr>

    </table>
    <input  type="submit"  value="提交">
</form>

</html>
