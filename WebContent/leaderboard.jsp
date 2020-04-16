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
	<p>评分排行榜</p>
	<table class="table table-striped" style='margin: 0px auto;'
		width="800px">
		<tbody>
			<tr>
				<c:forEach items="${list1}" var="i" varStatus="status">
					<td>
						<div>
							<img src="${i.img_src}" width="100px" height="150px">
						</div>
						<div width="118px" height="42">
							<span>书名:${i.book_name}</span> <br> <span>评分:${i.book_score}</span>
						</div>
					</td>
					<c:if test="${status.count % 6 == 0}">
						<tr>
						</tr>
					</c:if>
				</c:forEach>
			</tr>
		</tbody>
	</table>
	<p>评论排行榜</p>
	<table class="table table-striped" style='margin: 0px auto;'
		width="800px">
		<tbody>
			<tr>
				<c:forEach items="${list2}" var="i2" varStatus="status2">
					<td style="width:112px;height:219px">
						<div class="div1"style="width:110px; height:154px">
							<img src="${i2.img_src}" width="100px" height="150px">
						</div>

						<div class="div1"style="width:110px; height:63px">
							<span>书名:${i2.book_name}</span> <br> <span>评论量:${i2.book_comments}</span>
						</div>
					</td>
					<c:if test="${status2.count % 6 == 0}">
						<tr>
						</tr>
					</c:if>
				</c:forEach>
			</tr>
		</tbody>
	</table>
</body>
</html>