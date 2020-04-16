<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>图书信息添加</title>
		<META http-equiv=Content-Type content="text/html; charset=UTF-8">
		<LINK href="css/admin.css" type="text/css" rel="stylesheet">
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
		<form action="/PersonalSystem/AddBookAction" method="post">
			<table width="39%" border="0" align="center" cellspacing="1"
				bordercolor="#000000" bgcolor="#0000CC">
				<tr>
					<td width="28%" bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							书名：
						</div>
					</td>
					<td width="72%" bgcolor="#FFFFFF">
						<label>
							<input name="bookname" type="text" id="bookname">
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
						<input name="author" type="text" id="author">
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFFFF">
						<div align="right" class="STYLE3">
							 出版社： 
						</div>
					</td>
					<td bgcolor="#FFFFFF">
						<input name="publisher" type="text" id="publisher">
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
							<input name="publishtime" type="text" id="publishtime">
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
							<input name="ISBN" type="text" id="ISBN">
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
							<input name="imgsrc" type="text" id="imgsrc">
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
						<textarea rows="4" cols="15" name="bookintro"></textarea>
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
						<textarea rows="4" cols="15" name="auhtorintro"></textarea>

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
							<input name="bookscore" type="text" id="bookscore">
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
							<input name="comments" type="text" id="comments">
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
							<input name="label" type="text" id="label">
						</label>
					</td>
				</tr>
				
				
				
				
				<tr>
					<td colspan="2" bgcolor="#FFFFFF">
						<label>
							<div align="center">
								<input type="submit"  value="提交">
								<input type="reset"  value="重置">
							</div>
						</label>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
