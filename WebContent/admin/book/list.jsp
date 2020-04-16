<%@ page language="java"
	import="java.util.ArrayList,com.Dao.*,com.entity.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="referrer" content="no-referrer"/>
<title>图书管理</title>
<LINK href="admin/css/admin.css" type="text/css" rel="stylesheet">

</head>
<body leftmargin="8" topmargin="8">

	<!--  快速转换位置按钮  -->
	<!--  搜索表单  -->
	<form action="BookSearch" method="post">

		<table width='98%' border='0' cellpadding='1' cellspacing='1'
			bgcolor='#CBD8AC' align="center" style="margin-top: 8px">
			<tr bgcolor='#EEF4EA'>
				<td align='center'>

					<table width="469" border='0' cellpadding='0' cellspacing='0'>
						<tr>
							<td style='width: 180px'>请输入关键词：</td>
							<td width='170'><input type='text' name='booksearch'
								value='' style='width: 150px' /></td>
							<td width='86'><input name="imageField" type="submit"
								border="0" class="np" value='查询' /></td>
							<td width="84">&nbsp;</td>
						</tr>
					</table>

				</td>
			</tr>
		</table>
	</form>
	<!--  内容列表   -->
		<div id="printTable">
			<table width="98%" border="0" cellpadding="2" cellspacing="1"
				bgcolor="#3333FF" align="center" style="margin-top: 8px">
				<tr bgcolor="#B3C2FD">
					<td colspan="13" class="theader">图书信息列表</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">

					<td width="3%">id</td>
					<td width="8%">img</td>
					<td width="7%">书名</td>
					<td width="7%">作者</td>
					<td width="7%">出版社</td>
					<td width="8%">ISBN</td>
					<td width="8%">出版时间</td>
					<td width="15%">图书详情</td>
					<td width="15%">作者简介</td>
					<td width="5%">评分</td>
					<td width="6%">评论数</td>
					<td width="5%">类别</td>
					<td width="8%">操作</td>

				</tr>
				<c:forEach items="${list}" var="i" varStatus="status">
					<tr align='center' bgcolor="#FFFFFF"
						onMouseMove="javascript:this.bgColor='#FCFDEE';"
						onMouseOut="javascript:this.bgColor='#FFFFFF';" style="height:22px">

						<td width="3%">${i.book_id}</td>
						<td width="8%"><img src="${i.img_src}" width="100px" height="150px"></td>
						<td width="7%">${i.book_name}</td>
						<td width="7%">${i.author}</td>
						<td width="7%">${i.publisher}</td>
						<td width="5%">${i.publish_time}</td>
						<td width="7%">${i.ISBN}</td>
						
						<td width="15%">${i.book_intro}</td>
						<td width="15%">${i.author_intro}</td>
						<td width="5%">${i.book_score}</td>
						<td width="6%">${i.book_comments}</td>
						<td width="5%">${i.label}</td>
						<td width="10%"><a
							href="http://localhost:8080/PersonalSystem/BookSearchOne?id=${i.book_id}">编辑</a>
							| <a
							href="http://localhost:8080/PersonalSystem/DelBookAction?id=${i.book_id}">删除</a>

						</td>
					</tr>
				</c:forEach>
				<tr bgcolor="#B3C2FD">
					<td class="theader" colspan="9"><a
						href="http://localhost:8080/PersonalSystem/admin/book/addBook.jsp"><strong>添加图书</strong> </a></td>
					<td><a
						href="<%=request.getAttribute("address") %>?booksearch=${sessionScope.booksearch}&&currentpage=${cpage-1}"><img
							height="16" width="41" src="img/pre.gif" /></a></td>
					<td>第${cpage}页</td>
					<td><a
						href="<%=request.getAttribute("address") %>?booksearch=${sessionScope.booksearch}&&currentpage=${cpage+1}"><img
							height="16" width="41" src="img/next.gif" /></a></td>
					<td>总共<%=request.getAttribute("all")%>页
					</td>
				</tr>
			</table>
		</div>



</body>
</html>