<%@ page language="java" import="java.util.ArrayList,com.Dao.*,com.entity.*"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>管理员管理</title>
		<LINK href="admin/css/admin.css" type="text/css" rel="stylesheet">
	
	</head>
	<body leftmargin="8" topmargin="8"'>

		<!--  快速转换位置按钮  -->
		<!--  搜索表单  -->
		<form action="AdminSearch" method="post">

			<table width='98%' border='0' cellpadding='1' cellspacing='1'
				bgcolor='#CBD8AC' align="center" style="margin-top: 8px">
				<tr bgcolor='#EEF4EA'>
					<td align='center'>

						<table width="469" border='0' cellpadding='0' cellspacing='0'>
							<tr>
								<td style='width:180px'>
									请输入管理员账号：
								</td>
								<td width='170'>
									<input type='text' name='adminsearch' value=''
										style='width: 150px' />
								</td>
								<td width='86'>
									<input name="imageField" type="submit" border="0" class="np"
										value='查询' />
								</td>
								<td width="84">&nbsp;
									
								</td>
							</tr>
						</table>

					</td>
				</tr>
			</table>
		</form>
		<!--  内容列表   -->
		<form name="form2">
			<div id="printTable">
				<table width="98%" border="0" cellpadding="2" cellspacing="1"
					bgcolor="#3333FF" align="center" style="margin-top: 8px">
					<tr bgcolor="#B3C2FD">
						<td colspan="10"  class="theader">
							管理员信息列表
						</td>
					</tr>
					<tr align="center" bgcolor="#FAFAF1" height="22">
						
						<td width="10%">
							id
						</td>
						<td width="10%">
						          名字	
						</td>
						<td width="10%">
						          账号
						</td>
						<td width="10%">
						          密码
						</td>
						<td width="10%">
							操作
						</td>
					</tr>
					<c:forEach items="${list1}" var="i" varStatus="status">
					<tr align='center' bgcolor="#FFFFFF"
						onMouseMove="javascript:this.bgColor='#FCFDEE';"
						onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						
						<td width="10%">
							${i.admin_id}
						</td>
						<td width="10%">
						    ${i.admin_name}	
						</td>
						<td width="10%">
						    ${i.admin_account}
						</td>
						<td width="10%">
						    ${i.admin_password}
						</td>
						
						<td>
							
							<a href="http://localhost:8080/PersonalSystem/DelAdminAction?id=${i.admin_id}">删除</a>
						</td>
					</tr>
					</c:forEach>
				</table>
			</div>
		</form>

		
	</body>
</html>