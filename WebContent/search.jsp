<%@ page language="java"
	import="java.util.ArrayList,com.Dao.*,com.entity.*"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>个性化图书推荐系统</title>
<meta name="referrer" content="no-referrer" />
</head>

<body>
	<table class="table table-striped" style='margin: 0px auto;'>
		<tbody>
			<tr>
				<c:forEach items="${list1}" var="i" varStatus="status">
				
					<td>
						<div>
							<img src="${i.img_src}" width="100px" height="150px">
						</div>
						</td>
						<td>
						<div>
							<span>作者:${i.author}</span> 
							<br> 
							<span>书名:${i.book_name}</span>
							<br> 
							<span>出版社:${i.publisher}</span>
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
</body>
</html>