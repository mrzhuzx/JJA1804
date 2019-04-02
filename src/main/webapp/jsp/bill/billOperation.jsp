<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@include file="../../appcomm/basePath.jsp" %>

<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/WdatePicker.css"/>
    <link rel="stylesheet" type="text/css" href="css/skin_/table.css"/>
    <link rel="stylesheet" type="text/css" href="css/jquery.grid.css"/>

    <STYLE type="text/css">

        /* Table Head */
        table thead th {
            background-color: #0F8DC7;
            color: #fff;
            border-bottom-width: 0;
        }

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

        /* Padding and font style */
        table td, table th {
            padding: 5px 10px;
            font-size: 12px;
            font-family: Verdana;
            font-weight: bold;
        }

    </STYLE>
    <title>账单管理</title>
</head>

<body>
<div id="container">
    <div id="hd"></div>
    <div id="bd">
        <div id="main">
            <div class="search-box ue-clear">
                <div class="search-area">
                    <div class="kv-item ue-clear">
                        <label>输入关键字：</label>
                        <div class="kv-item-content ue-clear">
                            <input type="text"  >
                        </div>

                        <label>选择类型:</label>
                        <div class="kv-item-content">
                            <select>
                                <option>全部</option>
                                <option>全部</option>
                                <option>全部</option>
                            </select>
                        </div>
                    </div>

                </div>
                <div class="search-button">
                    <input class="button" type="submit" value="搜索一下" />
                </div>
            </div>

            <div class="table">
                <div class="opt ue-clear">
                    <span class="optarea">
                        <a href="jsp/bill.jsp" class="add">
                            <i class="icon"></i>
                            <span class="text">添加</span>
                        </a>
                    </span>
                </div>

                <div class="grid">
                    <table style="margin-left: 0px;width:100%;">
                        <thead>
                        <tr>
                            <th name="id">
                                <div class="ui-table-th" style="width:10%"><span
                                        class="ui-table-thTitle">流水号</span><a
                                        href="javascript:;" class="ui-icon2 ui-icon2-sort"></a><span
                                        class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 10%;"><span
                                        class="ui-table-thTitle">产品编号</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 8%;"><span
                                        class="ui-table-thTitle">产品名字</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 5%;"><span
                                        class="ui-table-thTitle">产品数量</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 5%;"><span
                                        class="ui-table-thTitle">产品价格</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 8%;"><span
                                        class="ui-table-thTitle">产品支付</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 12%;"><span
                                        class="ui-table-thTitle">创建时间</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 12%;"><span
                                        class="ui-table-thTitle">修改时间</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 5%;"><span
                                        class="ui-table-thTitle">供应商Id</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:5%"><span
                                        class="ui-table-thTitle">送货地址ID</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:10%"><span
                                        class="ui-table-thTitle">操作</span><span class="ui-table-drag"></span></div>
                            </th>

                        </tr>

                        </thead>
                        <tbody class="__data">
                        <c:forEach  var="bl"  items="${billList}">
                            <tr>
                                <td name="id">
                                    <div class="ui-table-td">
                            ${fn:length(bl.billCode) > 10 ? fn:substring(bl.billCode,0,10) : bl.billCode}${fn:length(bl.billCode) > 10 ? '...' : ''}
                                    </div>
                                </td>
                                <td>
                                    <div class="ui-table-td">
                            ${fn:length(bl.productId) > 10 ? fn:substring(bl.productId,0,10) : bl.productId}${fn:length(bl.productId) > 10 ? '...' : ''}
                                    </div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${bl.productName}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${bl.productCount}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${bl.totalPrice}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td"> <c:if test="${bl.isPayment eq '1'}">等待支付</c:if>
                                        <c:if test="${bl.isPayment eq '2'}">支付成功</c:if>
                                        <c:if test="${bl.isPayment eq '3'}">支付失败</c:if>
                                    </div>
                                </td>
                                <td>
                                    <div class="ui-table-td"><fmt:formatDate value="${bl.creationDate}" pattern="yyyy年MM月dd日" /></div>
                                </td>
                                <td>
                                    <div class="ui-table-td"><fmt:formatDate value="${bl.modifyDate}" pattern="yyyy年MM月dd日" /></div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${bl.providerId}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" >${bl.addressId}</div>
                                </td>
                                <td class="ui-table-operation">
                                    <div class="ui-table"><a href="bill/delete.do?strId=${bl.billId}" class="delete">
                                        <i class="icon"></i>
                                        <span class="text">删除</span>
                                    </a>
                                        <a href="bill/queryOne.do?billId=${bl.billId}" class="statistics">
                                            <i class="icon"></i>
                                            <span class="text">编辑</span>
                                        </a>
                                    <a href="bill/queryT.do?billId=${bl.billId}" class="statistics">
                                        <i class="icon"></i>
                                        <span class="text">查看详细</span>
                                    </a></div></td>


                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                </div>

                <div class="pagination">

                    <table style="width: 100%;border:12px" align="center">
                        <tbody class="__data">

                        <div class="pagination">
                            <a href="bill/listquery.do?pagenum=1">&nbsp;首页&nbsp;</a>
                            <a href="bill/listquery.do?pagenum=${pagenum-1}" >&nbsp;上一页&nbsp;</a>
                            <a href="bill/listquery.do?pagenum=${pagenum+1}">&nbsp;下一页&nbsp;</a>
                            <a href="bill/listquery.do?pagenum=${pageAll}">&nbsp;尾页&nbsp;</a>
                        </div>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>


</html>

