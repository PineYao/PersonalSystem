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
import com.entity.AdminInfo;
/**
 * 查找用户
 *
 */
public class AdminSearch extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String adminsearch = request.getParameter("adminsearch");
		String sql = "";
		if (adminsearch == null) {
			sql = "select * from admin_info";
		} else {
			sql = "select * from admin_info where admin_name like '%" + adminsearch + "%' or admin_name like '%" + adminsearch + "%'";
		}
		Connection conn1 = null;
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		BaseDao db = new BaseDao();
		// 这个代码是查询数据库里面的user_info，然后显示在页面上
		ArrayList<AdminInfo> list1 = new ArrayList<AdminInfo>();
		try {
			conn1 = db.getCon();
			ps1 = conn1.prepareStatement(sql);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				// 把获取的值放在pi里面，再把pi放在集合里面
				AdminInfo pi = new AdminInfo(rs1.getInt(1), rs1.getString(2), rs1.getString(3), rs1.getString(4));
				list1.add(pi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeAll(conn1, ps1, rs1);
		}
		request.setAttribute("list1", list1);
		request.setAttribute("address", "/PersonalSystem/AdminSearch");
		request.getRequestDispatcher("admin/admin/list.jsp").forward(request, response);
	}
}