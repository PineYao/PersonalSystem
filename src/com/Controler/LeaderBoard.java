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
import com.entity.Score;
import com.entity.Comment;
/**
 * 排行榜
 *
 */
public class LeaderBoard extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection conn1 = null;
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		BaseDao db = new BaseDao();
		// 这个代码是查询数据库里面的book_info，然后循环遍历显示在页面上
		// sql语句的意思就是limit 索引,显示索引以后多少行
		String sql = "select * from book_info ORDER BY book_score desc,book_id desc limit 0,12";
		ArrayList<Score> list1 = new ArrayList<Score>();
		try {
			conn1 = db.getCon();
			ps1 = conn1.prepareStatement(sql);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				// 把获取的值放在pi里面，再把pi放在集合里面
				Score pi = new Score(rs1.getString(7), rs1.getString(2),rs1.getFloat(10));
				list1.add(pi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeAll(conn1, ps1, rs1);
		}
		Connection conn2 = null;
		PreparedStatement ps2 = null;
		ResultSet rs2 = null;
		String sql2 = "select * from book_info ORDER BY book_comments desc,book_id desc limit 0,12";
		ArrayList<Comment> list2 = new ArrayList<Comment>();
		try {
			conn2 = db.getCon();
			ps2 = conn2.prepareStatement(sql2);
			rs2 = ps2.executeQuery();
			while (rs2.next()) {
				// 把获取的值放在pi里面，再把pi放在集合里面
				Comment pi = new Comment(rs2.getString(7), rs2.getString(2),rs2.getInt(11));
				list2.add(pi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeAll(conn2, ps2, rs2);
		}
		request.setAttribute("list1", list1);
		request.setAttribute("list2", list2);
		request.setAttribute("address", "/PersonalSystem/LeaderBoard");
		request.getRequestDispatcher("leaderboard.jsp").forward(request, response);
	}
}