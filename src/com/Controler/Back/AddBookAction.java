package com.Controler.Back;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.BaseDao;
/**
 * 管理员增添图书
 *
 */
public class AddBookAction extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String publisher=request.getParameter("publisher");
		String publishtime=request.getParameter("publishtime");
		String ISBN=request.getParameter("ISBN");
		String imgsrc=request.getParameter("imgsrc");
		String bookintro=request.getParameter("bookintro");
		String authorintro=request.getParameter("auhtorintro");
		String bookscore=request.getParameter("bookscore");
		String comments=request.getParameter("comments");
		String label=request.getParameter("label");
		
		BaseDao dbm = new BaseDao();
		//保存信息
		String sql = "insert into book_info(book_name,author,publisher,publish_time,ISBN,img_src,book_intro,author_intro,book_score,book_comments,label)  values('"+bookname+"','"+author+"' ,'"+publisher+"','"+publishtime+"','"+ISBN+"' ,'"+imgsrc+"','"+bookintro+"','"+authorintro+"','"+bookscore+"','"+comments+"','"+label+"')";
		Statement stat = null;
		Connection conn=null;
		try {
			conn=dbm.getCon();
			stat = conn.createStatement();
			stat.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(stat!=null)
					stat.close();
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		response.sendRedirect("http://localhost:8080/PersonalSystem/BookSearch");
		out.flush();
		out.close();
	}

}
