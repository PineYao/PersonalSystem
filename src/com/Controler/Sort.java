package com.Controler;

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
import com.entity.Books;
/**
 * 分类查看
 *
 */
public class Sort extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 查询数据库里面数据的总条数
		// 1.数据库里面数据的总条数；
		String tag=request.getParameter("Tag");
		int tag1=1;
		if (tag == null || tag == "") {
			tag1 = 1;
		}
		else {
			tag1=Integer.parseInt(tag);
		}
		int countpage = 0;
		String sql0 = "select * from book_info where tag='"+ tag1 + "'";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BaseDao db = new BaseDao();
		try {
			conn = db.getCon();
			ps = conn.prepareStatement(sql0);
			rs = ps.executeQuery();
			while (rs.next()) {
				countpage++;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			db.closeAll(conn, ps, rs);
		}
		// 每页显示多少行
		int limt = 18;
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
		Connection conn1 = null;
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		// 这个代码是查询数据库里面的book_info，然后循环遍历显示在页面上
		// 如果到了最后一页的时候，
		if (end > countpage) {
			limt = countpage - start;
		}
		// sql语句的意思就是limit 索引,显示索引以后多少行
		String sql = "select * from book_info where tag='"+ tag1 + "' limit ?,?";
		ArrayList<Books> list = new ArrayList<Books>();
		try {
			conn1 = db.getCon();
			ps1 = conn1.prepareStatement(sql);
			ps1.setLong(1, start);
			ps1.setLong(2, limt);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				// 把获取的值放在pi里面，再把pi放在集合里面
				Books pi = new Books(rs1.getString(7), rs1.getString(2), rs1.getString(3),rs1.getString(4));
				list.add(pi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeAll(conn1, ps1, rs1);
		}
		request.getSession().setAttribute("Tag",tag1);
		request.setAttribute("list", list);
		request.setAttribute("cpage", cpage);
		request.setAttribute("all", all);
		request.setAttribute("address", "/PersonalSystem/Sort");
		request.getRequestDispatcher("sort.jsp").forward(request, response);
	}
}

