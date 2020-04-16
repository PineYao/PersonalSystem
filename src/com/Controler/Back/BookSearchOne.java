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
 * 编辑图书
 *
 */
public class BookSearchOne extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String sql ="select * from book_info where book_id='"+ id + "'";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BaseDao db = new BaseDao();
		// 这个代码是查询数据库里面的user_info，然后显示在页面上
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		try {
			conn = db.getCon();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				// 把获取的值放在pi里面，再把pi放在集合里面
				BookInfo pi = new BookInfo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getFloat(10),rs.getInt(11),rs.getString(12));
				list.add(pi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeAll(conn, ps, rs);
		}
		request.setAttribute("list", list);
		request.setAttribute("address", "/PersonalSystem/BookSearchOne");
		request.getRequestDispatcher("admin/book/modBook.jsp").forward(request, response);
	}

}