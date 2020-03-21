<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="container">
		<div class="logo">
			<a href="#"><img src="assets/logo.png" alt="" /></a>
		</div>
		<div id="box">
			<form action="dologin.jsp" method="post">
			<p class="main">
				<label>用户名: </label>
				<input name="username" value="" /> 
				<label>密码: </label>
				<input type="password" name="password" value="">	
			</p>
			<p class="space">
				<input type="submit" value="登录" class="login" name="sign_in" style="cursor: pointer;"/>
			</p>
			</form>
		</div>
	</div>
</body>
</html>