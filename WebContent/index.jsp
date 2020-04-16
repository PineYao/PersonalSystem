<%@ page language="java" import="java.* " contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/Library.ico">

    <title>个性化图书管理系统</title>

    <!-- Bootstrap core CSS -->
    <link  type="text/css" href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link type="text/css" href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link type="text/css" href="css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>
    
    <script src="js/index.js"></script>
  </head>


	 <% 
	String username=(String)session.getAttribute("username");
	String loginin="登陆";
	String loginhref="login.jsp";
	   if(username==null){
	   username="请登录";
	   }else{
		   loginin="注销"; 
		   loginhref="LoutServlet";
		}
	%>

  <body>


    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">个性化图书管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
          <li><a href="" onclick="getkey(this)" target="rightframe">搜索</a></li>
            <li><a href=<%=loginhref %>><%=loginin%></a></li>
            <li><a href="register.jsp">注册</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input id="search"type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">   <!-- 总下布局 -->
      <div class="row">
      
      
        <div class="col-sm-3 col-md-2 sidebar">    <!-- 左布局 -->
        
       

          <div class="row placeholders">
            <div class="col-xs-12 col-sm-12 placeholder">
              <img src="img/login-img.png" width="60" height="60" class="img-responsive" alt="Generic placeholder thumbnail">
              <h7></h7>
            	
              <h4><%=username %></h4>
            </div>
          </div>
          
          <ul class="nav nav-sidebar">
            <li><a href="http://localhost:8080/PersonalSystem/BookLimitPage"target="rightframe">首页</a></li>
            <li><a href="http://localhost:8080/PersonalSystem/Sort?Tag=1" target="rightframe">分类</a></li>
            <li><a href="http://localhost:8080/PersonalSystem/LeaderBoard" target="rightframe">排行榜</a></li>
            <li><a href="fileadd.jsp" target="rightframe">推荐</a></li>
          </ul>
        </div>
        
        
        <!-- 右布局 -->         

		<iframe class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" frameborder="0" height="1400px" name="rightframe" 
		scrolling="no" src="BookLimitPage"></iframe>

        <!-- 右布局结束 -->
      
      
      </div>
    </div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="js/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    
    
  </body>
</html>
