package com.Controler.Back;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import com.Dao.BaseDao;
import com.entity.BookInfo;
/**
 * 查找图书
 *
 */
public class BookSearch extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String booksearch=request.getParameter("booksearch");
		// 查询数据库里面数据的总条数
		// 1.数据库里面数据的总条数；
		int countpage = 0;
		Connection conn1 = null;
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		String sql="";
		if (booksearch ==null) {
			sql = "select * from book_info";
		}else {
			sql = "select * from book_info where book_name like '%" + booksearch + "%' or author like '%"+booksearch+"%'";
		}
		BaseDao db = new BaseDao();
		try {
			conn1 = db.getCon();
			ps1 = conn1.prepareStatement(sql);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				countpage++;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			db.closeAll(conn1, ps1, rs1);
		}
		// 每页显示多少行
		int limt = 10;
		// 2.如果一页是10条数据的话，那么就是all页
		int all = (countpage / limt) + 1;
		// 这个是从前台获取的数据，是上一页还是下一页
		int cpage = 1;
		// 这个是上一页还是下一页的数据
		String currentpage = request.getParameter("currentpage");
		if (currentpage == null || currentpage == "") {
			cpage = 1;
		} else {
			cpage = Integer.parseInt(currentpage);
			// 如果到了最后一页，用户再点击下一页的时候跳转到第一页
			if (cpage == (all + 1)) {
				cpage = 1;
				// 如果到了第一页，用户再点击下一页的时候跳转到最后一页
			} else if (cpage == 0) {
				cpage = all;
			}
		}
		// 3.开始查询的数据
		int start = limt * (cpage - 1);
		// 4.结束查询的数据
		int end = start + (limt - 1);
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 这个代码是查询数据库里面的book_info，然后循环遍历显示在页面上
		// 如果到了最后一页的时候，
		if (end > countpage) {
			limt = countpage - start;
		}
		String sql0="";
		if (booksearch ==null) {
			sql0 = "select * from book_info limit ?,?";
		}else {
			sql0 = "select * from book_info where book_name like '%" + booksearch + "%' or author like '%"+booksearch+"%' limit ?,?";
		}
		// sql语句的意思就是limit 索引,显示索引以后多少行
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		try {
			conn = db.getCon();
			ps = conn.prepareStatement(sql0);
			ps.setLong(1, start);
			ps.setLong(2, limt);
			rs = ps.executeQuery();
			while (rs.next()) {
				// 把获取的值放在pi里面，再把pi放在集合里面
				BookInfo pi = new BookInfo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getFloat(10),rs.getInt(11),rs.getString(12));
				list.add(pi);
				System.out.println(list);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeAll(conn, ps, rs);
		}
		request.getSession().setAttribute("booksearch",booksearch);
		request.setAttribute("list", list);
		request.setAttribute("cpage", cpage);
		request.setAttribute("all", all);
		request.setAttribute("address", "/PersonalSystem/BookSearch");
		request.getRequestDispatcher("admin/book/list.jsp").forward(request, response);
	}
}
