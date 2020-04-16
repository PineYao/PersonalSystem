<%@ page language="java" import="java.util.ArrayList,com.Dao.*,com.entity.*"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>员工信息修改</title>

		<META http-equiv=Content-Type content="text/html; charset=UTF-8">
		<LINK href="admin/css/admin.css" type="text/css" rel="stylesheet">
		<style type="text/css">
<!--
.STYLE3 {
	font-size: 16px
}
-->
</style>
	</head>

	<body>
		<p>
			&nbsp;
		</p>
		<p>
			&nbsp;
		</p>
		<form action="ModUserAction" method="post" onSubmit="return check()">
			<table width="39%" border="0" align="center" cellspacing="1"
				bordercolor="#000000" bgcolor="#0000CC">
			<c:forEach items="${list1}" var="i" varStatus="status">
				<tr>
					<td bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							姓名：
						</div>
					</td>
					<td bgcolor="#FFFFFF">
						<input name="username" value='${i.user_name}' type="text"
							id="name">
					</td>
				</tr>
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							账号：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="count" type="text" id="count"
								value='${i.user_account}'>
							<input name="id" type="hidden" id="id" value='${i.user_id}'>
						</label>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							密码：
						</div>
					</td>
					<td bgcolor="#FFFFFF">
						<input name="password" type="text" id="password"
							value='${i.user_password}'>
					</td>
				</tr>
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							爱好：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="inte" type="text" id="inte"
								value='${i.interested}'>
						</label>
					</td>
				</tr>
			</c:forEach>

				<tr>
					<td colspan="2" bgcolor="#FFFFFF">
						<label>
							<div align="center">
								<input type="submit" name="Submit" value="提交">
								<input type="reset" name="Submit2" value="重置">
							</div>
						</label>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
