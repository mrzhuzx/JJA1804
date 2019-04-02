<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../appcomm/basePath.jsp"%>
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

<body>
<div id="container">
    <div id="hd">
    </div>
    <div id="bd">
        <form action="product/save.do" method="post">
            <div id="main">
                <h2 class="subfild">
                    <span>基本信息</span>
                </h2>
                <div class="subfild-content base-info">



                    <div class="kv-item ue-clear">
                        <label>名字</label>
                        <div class="kv-item-content">

                            <td><input type="text" name="productName" value="拉布拉多"></td>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>单价</label>
                        <div class="kv-item-content">
                            <td><input type="text" name="productPrice" value="100.0"></td>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>库存</label>
                        <div class="kv-item-content">
                            <td><input type="text" name="productStock" value="10"></td>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>描述</label>
                        <div class="kv-item-content">
                            <td><input type="text" name="productDescription" value="这是一只拉布拉多"></td>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>小图</label>
                        <div class="kv-item-content">
                            <td><input type="text" name="productIcon" value="https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D21%2C0%2C980%2C647%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=91c9a50cdd39b600598155f7d4620406/b999a9014c086e06999299a40a087bf40ad1cb23.jpg"></td>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>状态</label>
                        <div class="kv-item-content">
                            <%--<select>--%>
                                <%--<option name="productStatus">1</option>--%>
                                <%--<option  name="productStatus"> 2</option>--%>
                            <%--</select>--%>
                            <td><input type="text" name="productStatus" value="2"></td>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>类目编号</label>
                        <div class="kv-item-content">
                            <td><input type="text" name="categoryType" value="1"></td>
                        </div>
                    </div>



                </div>

                <div class="buttons">
                    <input class="button" type="submit" value="确认添加" />
                </div>
            </div>
        </form>
    </div>
</div>
</body>

<script type="text/javascript">
    $('select').select();
    showRemind('input[type=text],textarea','color5');
    UM.getEditor('content');
</script>
</html>


