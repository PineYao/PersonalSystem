<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>
    <title>个性化图书管理系统</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/admin/css/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/admin/css/base.css" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/admin/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/admin/css/jquery-ui-1.8.22.custom.css" />
    <script type="text/javascript" src="<%=path %>/admin/js/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="<%=path %>/admin/js/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="<%=path %>/admin/js/index.js"></script>
</head>
<body>
    <div class="warp">
        <!--头部开始-->
        <div class="top_c">
            <div class="top-menu">
              
            </div>
            <div class="top-nav">欢迎您:${admin}&nbsp;&nbsp;<a href="<%=path %>/admin/loginout.jsp">安全退出</a></div>
        </div>
        <!--头部结束-->
        <!--左边菜单开始-->
        <div class="left_c left">
            <h1>系统操作菜单</h1>
            <div class="acc">
                <div>
                    <a class="one">用户管理</a>
                    <ul class="kid">
                        <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="<%=path %>/admin/admin/list.jsp">用户信息管理</a></li>
                    </ul>
                    </ul>
                </div>
                <div>
                    <a class="one">会员管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="<%=path %>/admin/user/list.jsp">会员信息维护</a></li>  
                    </ul>
                </div>
                <div>
                    <a class="one">图书管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="<%=path %>/admin/car/list.jsp">图书信息管理</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one">评论管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="<%=path %>/admin/yundan/list.jsp">评论管理</a></li>
 
                    </ul>
                </div>
                 <div>
                    <a class="one">评分管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="<%=path %>/admin/qian/list.jsp">评分查看</a></li>
                       
                    </ul>
                </div>
               
            </div>

        </div>
        <!--左边菜单结束-->
        <!--右边框架开始-->
        <div class="right_c">
            <div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>

        </div>
        <div class="Conframe" >
            <iframe name="Conframe" id="Conframe" src="<%=path %>/admin/sysPro.jsp"></iframe>
        </div>
        <!--右边框架结束-->

        <!--底部开始-->
        <div class="bottom_c">
		
        <!--底部结束-->
    </div>
</body>
</html>
