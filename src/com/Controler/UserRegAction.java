package com.Controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDao;

/**
 * 用户注册
 *
 */
public class UserRegAction extends HttpServlet {


	private static final long serialVersionUID = 1L;

 
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

 
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String count = request.getParameter("count");
		String password = request.getParameter("password");
		

		UserDao dbu = new UserDao();
		if (dbu.haveUser(count)) {
			out.println("<script>alert('该账号已存在！');window.history.back();</script>");
		} else {
			String sql = "insert into user_info(user_name,user_account,user_password)values('"
					+ name
					+ "','"
					+ count
					+ "','"
					+ password
				    + "')";

			Statement stat = null;
			Connection conn = null;
			try {
				conn = dbu.getConnection();
				stat = conn.createStatement();
				stat.execute(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (stat != null) {
						stat.close();
					}
						
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			out.println("<script>alert('用户注册成功！');window.location.href='http://localhost:8080/PersonalSystem/index.jsp'</script>");
		}

		out.flush();
		out.close();
	}

 
}
