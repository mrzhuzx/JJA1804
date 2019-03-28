<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="../appcomm/basePath.jsp" %>

<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/WdatePicker.css"/>
    <link rel="stylesheet" type="text/css" href="css/skin_/table.css"/>
    <link rel="stylesheet" type="text/css" href="css/jquery.grid.css"/>

    <STYLE type="text/css">



        /* Column Style */
        table td {
            color: #000;
        }
        /* Heading and Column Style */
        table tr, table th {
            border-width: 1px;
            border-style: solid;
            border-color: rgb(156, 186, 95);
        }


        div.ui-table-td{
            overflow:hidden; /*超出的文本隐藏*/
            text-overflow:ellipsis; /*溢出用省略号显示*/
            white-space:nowrap; /*溢出不换行*/
        }
    </STYLE>

    <title>账单管理</title>
</head>






<body>
<div id="container">
    <div id="hd"></div>
    <div id="bd">
        <div id="main">

            <div class="table">
                <div class="opt ue-clear">
                    <span class="optarea">
                        <a href="javascript:;" class="add">
                            <i class="icon"></i>
                            <span class="text">添加</span>
                        </a>

                    </span>
                </div>

                <div class="grid">
                    <table style="margin-left: 0px;">
                        <thead>
                        <tr>
                            <th name="id">
                                <div class="ui-table-th" style="width:83px"><span class="ui-table-thTitle">流水号</span><a
                                        href="javascript:;" class="ui-icon2 ui-icon2-sort"></a><span
                                        class="ui-table-drag"></span></div>
                            </th>
                            <th name="name">
                                <div class="ui-table-th" style="width:83px"><span
                                        class="ui-table-thTitle">产品编号</span><a href="javascript:;"
                                                                               class="ui-icon2 ui-icon2-sort"></a><span
                                        class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">产品名字</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">产品描述</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">产品数量</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 20px;"><span
                                        class="ui-table-thTitle">产品单位</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:20px"><span
                                        class="ui-table-thTitle">产品价格</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">产品支付</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                            <div class="ui-table-th" style="width:70px"><span
                                    class="ui-table-thTitle">创建时间</span><span class="ui-table-drag"></span></div>
                        </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">修改时间</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">供应商Id</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">产品图片</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:50px"><span
                                        class="ui-table-thTitle">送货地址ID</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">操作</span><span class="ui-table-drag"></span></div>
                            </th>
                        </tr>
                        </thead>
                    <thead>
                        <tbody class="__data">
                        <c:forEach   var="bl"  items="${billList}">
                            <tr>
                                <td name="id">
                                    <div class="ui-table-td" style="width:83px">${bl.billCode}</div>
                                </td>
                                <td name="name">
                                    <div class="ui-table-td" style="width:70px">${bl.productId}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:70px">${bl.productName}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:70px">${bl.productDesc}</div>
                                </td>
                                <td minwidth="minWidth">
                                    <div class="ui-table-td" style="width: 20px;">${bl.productCount}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:20px">${bl.productUnit}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:70px">${bl.totalPrice}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:20px">${bl.isPayment}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:70px">${bl.creationDate}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:70px">${bl.modifyDate}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:70px">${bl.providerId}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:20px">${bl.proImg}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:50px">${bl.addressId}</div>
                                </td>
                                <td class="ui-table-blank" style="width: 70px;">
                                    <div class="ui-table"><a href="bill/delete.do?strId=${bl.billId}" class="delete">
                                        <i class="icon"></i>
                                        <span class="text">删除</span>
                                    </a>
                                    <a href="javascript:;" class="statistics">
                                            <i class="icon"></i>
                                            <span class="text">编辑</span>
                                        </a></div>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>


</html>

