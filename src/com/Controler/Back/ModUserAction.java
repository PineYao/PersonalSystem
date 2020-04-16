package com.Controler.Back;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.BaseDao;

import java.sql.*;

/**
 * 修改用户信息
 *
 */
public class ModUserAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String name = request.getParameter("username");
		String count = request.getParameter("count");
		String pwd=request.getParameter("password");
		String inte=request.getParameter("inte");
	 
		BaseDao dbm = new BaseDao();
		String sql = "update user_info set user_name='"+name+"',user_account='"+count+"' ,user_password='"+pwd+"',interested='"+inte+"' where user_id="+id;
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
		response.sendRedirect("http://localhost:8080/PersonalSystem/UserSearch");
		out.flush();
		out.close();
	}



}

