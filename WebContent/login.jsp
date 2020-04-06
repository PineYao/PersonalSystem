<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>个性化图书推荐系统</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
<link rel="icon" href="img/Library.ico">
</head>
<body>
	<div class="wrap">
		<div class="container">
			<h1>Welcome</h1>
			<form action="LoginAction" name="userloginform" method="post">
				<input type="text" id="UserCount"name="UserCount" placeholder="UserCount" /> 
				<input type="password" id="Password"name="Password" placeholder="Password" /> 
				<input type="submit" value="Login" onclick="userlogincheck()"/>
				<p class="change_link" style="text-align: center">
					<span class="text">Not a member ?</span>       
					<a href="register.jsp" class="to_register"> Sign up</a>            
				</p>
			</form>
		</div>
		<ul>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
</body>
</html>