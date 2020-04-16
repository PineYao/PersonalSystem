package com.Controler.Back;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.BaseDao;

/**
 * 管理员添加用户
 *
 */
public class AddUserAction extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		//姓名
		String name=request.getParameter("username");
		//密码
		String pwd=request.getParameter("password");
		//账号
		String account=request.getParameter("count");
		//爱好
		String inte=request.getParameter("inte");
		
		BaseDao dbm = new BaseDao();
		//保存信息
		String sql = "insert into user_info(user_name,user_account,user_password,interested)  values('"+name+"','"+account+"','"+pwd+"','"+inte+"')";
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
