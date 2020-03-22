<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>个性化图书推荐系统</title>
<link rel="stylesheet" href="css/register.css">
<link rel="stylesheet" href="js/register.js">
<script scr="/js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<div class="wrap">
		<div class="container">
			       
			<h1 style="color: white; margin: 0; text-align: center">Sign up</h1>
			       
			<form>
				<label> <input type="text" id="username"
					onblur="checkUserName()" autocomplete="off"
					placeholder="Your username" />
				</label> <label> <input type="text" id="count" onblur="checkCount()"
					autocomplete="off" placeholder="Your count" />
				</label> <label> <input type="password" id="password"
					onblur="checkPassword()" autocomplete="off" placeholder="Password" />
				</label> <label> <input type="password" id="re-password"
					onblur="checkRePassword()" autocomplete="off"
					placeholder="Please confirm your password" />
				</label>     <input type="submit" value="Sign up" onclick="checkData()" />  
				         
				<p class="change_link" style="text-align: center">
					<span class="text">Already a member ?</span>       <a
						href="login.jsp" class="to_login"> Go and log in</a>            
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