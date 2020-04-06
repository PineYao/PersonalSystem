<%@ page language="java"
	import="java.util.ArrayList,com.Dao.*,com.entity.*"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<title>个性化图书推荐系统</title>
	<meta name="referrer" content="no-referrer"/>
	<link rel="stylesheet" type="text/css" href="css/home.css"/>
</head>

<body>
	<jsp:include flush="true" page="/top.jsp"></jsp:include>
	<br>
	<br>
	<table class="table table-striped" style='margin: 0px auto;' width="800px">
		<tbody>
			<tr>
				<c:forEach items="${list}" var="i" varStatus="status">
					<td>
						<div>
							<img src="${i.img_src}" width="100px" height="150px">
						</div>
					</td>
					<td>
						<div>
							<span>作者:${i.author}</span> <br> <span>书名:${i.book_name}</span>
							<br> <span>出版社:${i.publisher}</span>
						</div>
					</td>
					<c:if test="${status.count % 3 == 0}">
						<tr>
						</tr>
					</c:if>
				</c:forEach>
			</tr>
		</tbody>
	</table>
	<table style='margin: 0px auto;' width="400px">
		<tbody >
			<tr>
				<td><a
					href="<%=request.getAttribute("address") %>?currentpage=${cpage-1}&&sqls=<%=request.getParameter("sql")%>"><img height="16" width="41" src="img/pre.gif" /></a></td>
				<td>第${cpage}页</td>
				<td><a
					href="<%=request.getAttribute("address") %>?currentpage=${cpage+1}&&sqls=<%=request.getParameter("sql")%>"><img height="16" width="41" src="img/next.gif" /></a></td>
				<td>总共<%=request.getAttribute("all")%>页
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>