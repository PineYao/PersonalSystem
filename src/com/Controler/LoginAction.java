package com.Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDao;

/**
 * 用户后台登录操作
 *
 */
public class LoginAction extends HttpServlet {


	private static final long serialVersionUID = 1L;

    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);
		out.close();
	}


    @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String usercount=request.getParameter("UserCount");
		String password=request.getParameter("Password");
		
		UserDao dbu=new UserDao();
		boolean login=dbu.loginUser(usercount, password);
		if(login){
		   
		   request.getSession().setAttribute("username",usercount);
		   response.sendRedirect("/index.jsp");
			
		}else{
			 
			out.println("<script>alert('账号或密码有误');window.location.href='register.jsp'</script>");
		 
		}
		
		
		out.flush();
		out.close();
	}


}
