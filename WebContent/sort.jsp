<%@ page language="java"
	import="java.util.ArrayList,com.Dao.*,com.entity.*"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<title>个性化图书推荐系统</title>
	<meta name="referrer" content="no-referrer"/>
</head>

<body>
	<div>
	 <a class="active" href="http://localhost:8080/PersonalSystem/Sort?Tag=8" target="rightframe">小说</a>
     <a href="http://localhost:8080/PersonalSystem/Sort?Tag=7" target="rightframe">漫画</a>
     <a href="http://localhost:8080/PersonalSystem/Sort?Tag=6" target="rightframe">历史</a>
      <a href="http://localhost:8080/PersonalSystem/Sort?Tag=1" target="rightframe">国学</a>
      <a href="http://localhost:8080/PersonalSystem/Sort?Tag=3" target="rightframe">教育</a>
        <a href="http://localhost:8080/PersonalSystem/Sort?Tag=5" target="rightframe">科普</a>
       <a href="http://localhost:8080/PersonalSystem/Sort?Tag=4" target="rightframe">经济学</a>
         <a href="http://localhost:8080/PersonalSystem/Sort?Tag=2" target="rightframe">互联网</a>
	</div>
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
					href="<%=request.getAttribute("address") %>?Tag=${sessionScope.Tag}&&currentpage=${cpage-1}"><img height="16" width="41" src="img/pre.gif" /></a></td>
				<td>第${cpage}页</td>
				<td><a
					href="<%=request.getAttribute("address") %>?Tag=${sessionScope.Tag}&&currentpage=${cpage+1}"><img height="16" width="41" src="img/next.gif" /></a></td>
				<td>总共<%=request.getAttribute("all")%>页
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>