<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
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
    <title>客户管理</title>
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
                	<span class="sortarea">
                    	<span class="sort">
                        	<label>排序：</label>
                            <span class="name">
                            	<i class="icon"></i>
                                <span class="text">名称</span>
                            </span>
                        </span>

                        <i class="list"></i>
                        <i class="card"></i>
                    </span>
                    <span class="optarea">
                        <a href="jsp/userinfo/usersave.jsp" class="add">
                            <i class="icon"></i>
                            <span class="text">添加</span>
                        </a>
                        <a href="javascript:;" class="delete">
                            <i class="icon"></i>
                            <span class="text">删除</span>
                        </a>

                        <a href="javascript:;" class="statistics">
                            <i class="icon"></i>
                            <span class="text">统计</span>
                        </a>

                        <a href="javascript:;" class="config">
                            <i class="icon"></i>
                            <span class="text">配置</span>
                        </a>
                    </span>
                </div>

                <div class="grid">
                    <table style="margin-left: 0px;width:100%;" >
                        <thead>
                        <tr>
                            <th name="id">
                                <div class="ui-table-th" style="width:50px"><span class="ui-table-thTitle">userId</span><a
                                        href="javascript:;" class="ui-icon2 ui-icon2-sort"></a><span
                                        class="ui-table-drag"></span></div>
                            </th>
                            <th name="name">
                                <div class="ui-table-th" style="width:100px"><span
                                        class="ui-table-thTitle">userCode</span><a href="javascript:;"
                                                                                   class="ui-icon2 ui-icon2-sort"></a><span
                                        class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:100px"><span
                                        class="ui-table-thTitle">userName</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:110px"><span
                                        class="ui-table-thTitle">userPassword</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">userPhone</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:150px"><span
                                        class="ui-table-thTitle">userAddress</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:150px"><span
                                        class="ui-table-thTitle">creationDate</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:150px"><span
                                        class="ui-table-thTitle">modifyDate</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:70px">操作<span
                                        class="ui-table-thTitle"></span><span class="ui-table-drag"></span></div>
                            </th>

                        </tr>

                        </thead>
                        <tbody class="__data">
                        <c:forEach var="ui" items="${userInfoList}">
                            <tr>
                                <td name="userId">
                                    <div class="ui-table-td">${ui.userId}</div>
                                </td>

                                <td>
                                    <div class="ui-table-td">${ui.userCode}</div>
                                </td>

                                <td>
                                    <div class="ui-table-td">${ui.userName}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${ui.userPassword}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${ui.userPhone}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">
                                            ${fn:length(ui.userAddress) > 10 ? fn:substring(ui.userAddress,0,10) : ui.userAddress}${fn:length(ui.userAddress) > 10 ? '...' : ''}

                                    </div>
                                </td>

                                <td>
                                    <div class="ui-table-td"><fmt:formatDate value="${ui.creationDate}"
                                                                             pattern="yyyy年MM月dd日"/></div>
                                </td>
                                <td>
                                    <div class="ui-table-td"><fmt:formatDate value="${ui.modifyDate}"
                                                                             pattern="yyyy年MM月dd日"/></div>
                                </td>

                                <td class="ui-table-operation">
                                    <a href="userinfo/userdel.do?userId=${ui.userId}">删除</a> &nbsp;
                                    <a href="userinfo/searchone.do?userId=${ui.userId}">编辑</a>&nbsp;
                                    <a href="userinfo/searchone.do?userId=${ui.userId}">查看详细信息</a></td>

                                <td class="ui-table-blank" style="width: 10px;">
                                    <div class="ui-table-td"></div>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                </div>

                <div class="pagination">

                    <table style="width: 100%;border:12px" align="center">
                        <tbody class="__data">

                        <div class="pagination">
                            <a href="userinfo/pagelist.do?pagenum=1">&nbsp;首页&nbsp;</a>
                            <a href="userinfo/pagelist.do?pagenum=${pagenum-1}" >&nbsp;上一页&nbsp;</a>
                            <a href="userinfo/pagelist.do?pagenum=${pagenum+1}">&nbsp;下一页&nbsp;</a>
                            <a href="userinfo/pagelist.do?pagenum=${pageall}">&nbsp;尾页&nbsp;</a>
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


