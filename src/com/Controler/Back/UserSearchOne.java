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
import com.entity.UserInfo;
/**
 * 编辑用户
 *
 */
public class UserSearchOne extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String sql ="select * from user_info where user_id='"+ id + "'";
		Connection conn1 = null;
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		BaseDao db = new BaseDao();
		// 这个代码是查询数据库里面的user_info，然后显示在页面上
		ArrayList<UserInfo> list1 = new ArrayList<UserInfo>();
		try {
			conn1 = db.getCon();
			ps1 = conn1.prepareStatement(sql);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				// 把获取的值放在pi里面，再把pi放在集合里面
				UserInfo pi = new UserInfo(rs1.getInt(1), rs1.getString(2), rs1.getString(3), rs1.getString(4),
						rs1.getString(5));
				list1.add(pi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeAll(conn1, ps1, rs1);
		}
		request.setAttribute("list1", list1);
		request.setAttribute("address", "/PersonalSystem/UserSearchOne");
		request.getRequestDispatcher("admin/user/modUser.jsp").forward(request, response);
	}

}