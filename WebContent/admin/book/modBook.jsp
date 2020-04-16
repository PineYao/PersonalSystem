<%@ page language="java" import="java.util.ArrayList,com.Dao.*,com.entity.*"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>图书信息修改</title>

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
		<form action="ModBookAction" method="post">
			<table width="39%" border="0" align="center" cellspacing="1"
				bordercolor="#000000" bgcolor="#0000CC">
			<c:forEach items="${list}" var="i" varStatus="status">
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							书名：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="bookname" type="text" id="bookname" value='${i.book_name}'>
							<input name="id" type="hidden" id="id" value='${i.book_id}'>
						</label>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							作者：
						</div>
					</td>
					<td bgcolor="#FFFFFF">
						<input name="author" type="text" id="author" value='${i.author}'>
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							 出版社： 
						</div>
					</td>
					<td bgcolor="#FFFFFF">
						<input name="publisher" type="text" id="publisher" value='${i.publisher}'>
					</td>
				</tr>
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							发行时间：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="publishtime" type="text" id="publishtime" value='${i.publish_time}'>
						</label>
					</td>
				</tr>
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							ISBN：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="ISBN" type="text" id="ISBN" value='${i.ISBN}'>
						</label>
					</td>
				</tr>
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							图片地址：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="imgsrc" type="text" id="imgsrc" value='${i.img_src}'>
						</label>
					</td>
				</tr>
				
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							图书简介：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
						<textarea rows="8" cols="25" name="bookintro">${i.book_intro}</textarea>
						</label>
					</td>
				</tr>
				
				
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							作者简介：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
						<textarea rows="8" cols="25" name="authorintro">${i.author_intro}</textarea>

						</label>
					</td>
				</tr>
				
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							评分：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="bookscore" type="text" id="bookscore" value='${i.book_score}'>
						</label>
					</td>
				</tr>
				
				
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							评论量：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="comments" type="text" id="comments" value='${i.book_comments}'>
						</label>
					</td>
				</tr>
				
				
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							类型：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="label" type="text" id="label" value='${i.label}'>
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
