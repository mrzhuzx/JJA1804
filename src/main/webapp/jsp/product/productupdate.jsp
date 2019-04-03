<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../../appcomm/basePath.jsp"%>
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
        <form action="product/${proone.productId}/updateone.do" method="post">
            <div id="main">
                <h2 class="subfild">
                    <span>基本信息</span>
                </h2>
                <div class="subfild-content base-info">



                    <div class="kv-item ue-clear">
                        <label>名字</label>
                        <div class="kv-item-content">
                            <input type="text" name="productName" value="${proone.productName}" />
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>单价</label>
                        <div class="kv-item-content">
                            <input type="text" name="productPrice" value="${proone.productPrice}" />
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>库存</label>
                        <div class="kv-item-content">
                            <input type="text" name="productStock" value="${proone.productStock}" />
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>描述</label>
                        <div class="kv-item-content">
                            <input type="text" name="productDescription" value="${proone.productDescription}" />
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>小图</label>
                        <div class="kv-item-content">
                            <input type="text" name="productIcon" value="${proone.productIcon}" />
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>状态</label>
                        <div class="kv-item-content">
                            <input type="text" name="productStatus" value="${proone.productStatus}" />
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>类目编号</label>
                        <div class="kv-item-content">
                            <input type="text" name="categoryType" value="${proone.categoryType}" />
                        </div>
                    </div>



                </div>

                <div class="buttons">
                    <input class="button" type="submit" value="确认修改" />
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
