<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wjy
  Date: 2019/3/28 0028
  Time: 上午 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="../../appcomm/basePath.jsp" %>
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
        <div id="main">
            <form action="bill/update.do?billId=${bl.billId}" method="post">
                <h2 class="subfild">
                    <span>修改账单</span>
                </h2>


                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>流水号</label>
                        <div class="kv-item-content">
                            <input type="text" name="billCode" value="${bl.billCode}" />
                        </div>
                    </div>
                </div>

                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>产品编号</label>
                        <div class="kv-item-content">
                            <input type="text" name="productId" value="${bl.productId}" />
                        </div>
                    </div>
                </div>
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>产品名字</label>
                        <div class="kv-item-content">
                            <input type="text" name="productName" value="${bl.productName}" />
                        </div>
                    </div>
                </div>

                <div class="subfild-content remarkes-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>产品描述</label>
                        <div class="kv-item-content">
                            <textarea name="productDesc" placeholder="${bl.productDesc}" id="content" style="width:800px;height:240px;"></textarea>
                        </div>
                    </div>
                </div>
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>产品数量</label>
                        <div class="kv-item-content">
                            <input type="text" name="productCount" value="${bl.productCount}" />
                        </div>
                    </div>
                </div>
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>产品单位</label>
                        <div class="kv-item-content">
                            <input type="text" name="productUnit" value="${bl.productUnit}" />
                        </div>
                    </div>
                </div>
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo"></span>产品价格</label>
                        <div class="kv-item-content">
                            <input type="text" name="totalPrice" value="${bl.totalPrice}" />
                        </div>
                    </div>
                </div>
                <div class="kv-item ue-clear" >
                    <label>是否支付</label>
                    <div class="kv-item-content">
                    	<span class="choose">
                            <span class="checkboxouter">
                                <input  type="radio" name="isPayment" value="1"/>
                                <span class="radio"></span>
                            </span>
                            <span class="text">已支付</span>
                        </span>
                        <span class="choose">
                            <span class="checkboxouter">
                                <input type="radio"  name="isPayment" value="2"/>
                                <span class="radio"></span>
                            </span>
                            <span class="text" >未支付</span>
                        </span>
                        <span class="choose">
                            <span class="checkboxouter">
                                <input type="radio" name="isPayment"  value="3"/>
                                <span class="radio"></span>
                            </span>
                            <span class="text">支付失败</span>
                        </span>
                    </div>
                </div>
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>供应商Id</label>
                        <div class="kv-item-content">
                            <input type="text" name="providerId" value="${bl.providerId}" />
                        </div>
                    </div>
                </div>
                <div class="kv-item ue-clear">
                    <label><span class="impInfo">*</span>产品图片</label>
                    <div class="kv-item-content file">
                        <span class="text" ></span>
                        <input type="text" name="proImg" value="${bl.proImg}" />
                        <input type="button" class="button normal long2"  value="浏览.." />
                    </div>
                </div>
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label><span class="impInfo">*</span>送货地址编号</label>
                        <div class="kv-item-content">
                            <input type="text" name="addressId" value="${bl.addressId}" />
                        </div>
                    </div>
                </div>
                <div class="buttons">
                    <input class="button" type="submit" value="确定修改" />
                </div>
            </form>

        </div>
    </div>
</div>

</body>

<script type="text/javascript">
    $('select').select();
    showRemind('input[type=text],textarea','color5');
    UM.getEditor('content');
</script>
</html>
