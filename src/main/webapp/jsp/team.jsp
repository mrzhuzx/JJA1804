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

        /* Table Head */
        table thead th {
            background-color:#0F8DC7;
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
                            <span class="text"><a href="jsp/teamadd.jsp">添加</a> </span>
                        </a>
                        <a href="javascript:;" class="delete">
                            <i class="icon"></i>
                            <span class="text"><a href="team/delete.do">删除</a> </span>
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
                    <table style="margin-left: 0px;width: 100%;" >
                        <thead>
                        <tr>
                            <th name="id">
                                <div class="ui-table-th" style="width:70px"><span class="ui-table-thTitle">team_id</span><a
                                        href="javascript:;" class="ui-icon2 ui-icon2-sort"></a><span
                                        class="ui-table-drag"></span></div>
                            </th>

                            <th>
                                <div class="ui-table-th" style="width:120px"><span
                                        class="ui-table-thTitle">team_desc</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th>
                                <div class="ui-table-th" style="width:120px"><span
                                        class="ui-table-thTitle">team_icon</span><span class="ui-table-drag"></span></div>
                            </th>

                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">team_name</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">team_slogen</span><span class="ui-table-drag"></span></div>
                            </th>
                            <th class="minWidth">
                                <div class="ui-table-th" style="width: 120px;"><span
                                        class="ui-table-thTitle">team_state</span><span class="ui-table-drag"></span></div>
                            </th>



                            <th>
                                <div class="ui-table-th" style="width:70px"><span
                                        class="ui-table-thTitle">操作</span><span class="ui-table-drag"></span></div>
                            </th>

                        </tr>


                        </thead>
                    </table>


                </div>

                <div class="pagination">

                    <table style="width: 100%;border:12px" align="center">
                        <tbody class="__data">
                        <c:forEach   var="tm"  items="${teamList}">
                            <tr>
                                <td name="id">
                                    <div class="ui-table-td" style="width:70px">${tm.teamId}</div>
                                </td>
                                <td name="name">
                                    <div class="ui-table-td" style="width:120px">${tm.teamDesc}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:120px">${tm.teamIcon}</div>
                                </td>
                                <td>
                                    <div class="ui-table-td" style="width:120px">${tm.teamName}</div>
                                </td>
                                <td minwidth="minWidth">
                                    <div class="ui-table-td" style="width: 120px;">${tm.teamSlogen}</div>
                                </td>
                                <td minwidth="minWidth">
                                    <div class="ui-table-td" style="width: 120px;">${tm.teamState}</div>
                                </td>

                                <td class="ui-table-operation" style="width: 100px;"></a><a href="team/delete.do?teamId=${tm.teamId}">删除</a></a><a href="javascript:;">编辑</a></td>

                                <td class="ui-table-blank" style="width: 10px;">
                                    <div class="ui-table-td"></div>
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
