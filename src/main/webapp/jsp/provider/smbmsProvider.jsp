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
    <title>产品分类</title>
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
                        <a href="javascript:;" class="add">
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
                    <table style="margin-left: 0px;width:100%;">
                        <thead>
                        <tr>
                            <th name="id">
                                <div class="ui-table-th" style="width:40px"><span
                                        class="ui-table-thTitle">proId</span><a
                                        href="javascript:;" class="ui-icon2 ui-icon2-sort"></a><span
                                        class="ui-table-drag"></span></div>
                            </th>

                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">proName</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">proDesc</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">proContact</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">proPhone</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 200px;"><span
                                        class="ui-table-thTitle">proAddress</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 100px;"><span
                                        class="ui-table-thTitle">proFax</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 100px;"><span
                                        class="ui-table-thTitle">creationDate</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 100px;"><span
                                        class="ui-table-thTitle">modifyDate</span><span class="ui-table-drag"></span>
                                </div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:180px"><span
                                        class="ui-table-thTitle">操作</span><span class="ui-table-drag"></span></div>
                            </th>

                        </tr>

                        </thead>
                        <tbody class="__data">
                        <c:forEach var="prolist" items="${prolist}">
                            <tr>
                                <td name="id">
                                    <div class="ui-table-td">${prolist.proId}</div>
                                </td>

                                <td>
                                    <div class="ui-table-td">${prolist.proName}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">
                                            ${fn:length(prolist.proDesc) > 10 ? fn:substring(prolist.proDesc,0,10) : prolist.proDesc}${fn:length(prolist.proDesc) > 10 ? '...' : ''}

                                    </div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${prolist.proContact}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${prolist.proPhone}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td">

                                            ${fn:length(prolist.proAddress) > 10 ? fn:substring(prolist.proAddress,0,10) : prolist.proAddress}${fn:length(prolist.proAddress) > 10 ? '...' : ''}
                                    </div>
                                </td>
                                <td>
                                    <div class="ui-table-td">${prolist.proFax}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td"><fmt:formatDate value="${prolist.creationDate}"
                                                                             pattern="yyyy年MM月dd日"/></div>
                                </td>
                                <td>
                                    <div class="ui-table-td"><fmt:formatDate value="${prolist.modifyDate}"
                                                                             pattern="yyyy年MM月dd日"/></div>
                                </td>

                                <td class="ui-table-operation">
                                    <a href="provider/${prolist.proId}/deleteById.do">删除</a> &nbsp;
                                    <a href="provider/${prolist.proId}/findById.do">编辑</a>&nbsp;
                                    <a href="provider/${prolist.proId}/findById.do">查看详细信息</a></td>

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
                            <a href="smbmsProvider/findAllProviderByPage.do?pagenum=1">&nbsp;首页&nbsp;</a>
                            <a href="smbmsProvider/findAllProviderByPage.do?pagenum=${pagenum-1}" >&nbsp;上一页&nbsp;</a>
                            <a href="smbmsProvider/findAllProviderByPage.do?pagenum=${pagenum+1}">&nbsp;下一页&nbsp;</a>
                            <a href="smbmsProvider/findAllProviderByPage.do?pagenum=5">&nbsp;尾页&nbsp;</a>
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

