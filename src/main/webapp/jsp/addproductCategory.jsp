<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//Dtr XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/Dtr/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="../appcomm/basePath.jsp" %>

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

    <script type="text/javascript">
        function p_del() {
            var msg = "您真的确定要增加吗？\n\n请确认！";
            if (confirm(msg)==true){

                return true;
            }else{
                return false;
            }
        }
    </script>
</head>

<body>
<form action="protype/add.do" method="post"  >
    <table>
        <div id="main">
            <h2 class="subfild">
                <span>修改信息</span>
            </h2>
        </div>

        <div class="subfild-content base-info">



            <div class="kv-item ue-clear time">
                <label><span class="impInfo">*</span>categoryName:</label>
                <div class="kv-item-content" style="margin-left: 20px">
                    <input type="text"  name="categoryName" value="${productCategory.categoryName}"/>
                </div>
            </div>


            <div class="kv-item ue-clear">
                <label><span class="impInfo">*</span>categoryType:</label>
                <div class="kv-item-content" style="margin-left: 20px">
                    <input type="text" name="categoryType" value="${productCategory.categoryType}"/>
                </div>

            </div>




            <div class="buttons">
                <input class="button"   onclick="javascript:return p_del()" type="submit" value="增加" />
            </div>



        </div>
        </div>
    </table>
</form>

</body>

<script type="text/javascript">
    $('select').select();
    showRemind('input[type=text],textarea','color5');
    UM.getEditor('content');
</script>
</html>
