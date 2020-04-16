package com.Controler.Back;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.BaseDao;

import java.sql.*;
import java.text.SimpleDateFormat;

/**
 * 修改图书
 *
 */
public class ModBookAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String publisher=request.getParameter("publisher");
		String publishtime=request.getParameter("publishtime");
		String ISBN=request.getParameter("ISBN");
		String imgsrc=request.getParameter("imgsrc");
		String bookintro=request.getParameter("bookintro");
		String authorintro=request.getParameter("authorintro");
		String bookscore=request.getParameter("bookscore");
		String comments=request.getParameter("comments");
		String label=request.getParameter("label");
	 
		BaseDao dbm = new BaseDao();
		String sql = "update book_info set book_name='"+bookname+"',author='"+author+"' ,publisher='"+publisher+"',publish_time='"+publishtime+"',ISBN='"+ISBN+"' ,img_src='"+imgsrc+"',book_intro='"+bookintro+"',author_intro='"+authorintro+"',book_score='"+bookscore+"',book_comments='"+comments+"',label='"+label+"' where book_id='"+id+"'";
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

