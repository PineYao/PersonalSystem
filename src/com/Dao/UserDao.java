package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

/**
 * 数据库操作类
 *
 */
public class UserDao {
	//驱动名
	private String className = "com.mysql.jdbc.Driver";
	//JDBC URL
	private String url = "jdbc:mysql://localhost:3306/system_db?useUnicode=true&characterEncoding=UTF-8";
 
	public Connection getConnection() {

		Connection coon = null;
		try {
			Class.forName(className);
			coon = DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return coon;
	}

 
	/**
	 * 判断账号是否已注册
	 * @param usercount 账号
	 * @return 是否注册
	 */
	public boolean haveUser(String usercount) {
		Connection coon = getConnection();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = coon.prepareStatement("select * from user_info where user_account='"
							+ usercount + "'");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
					
				if (coon != null) {
					coon.close();
				}
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * 后台员工登录验证
	 * @param username 账号
	 * @param pwd 密码
	 * @return 是否成功
	 */
	public boolean login(String username, String pwd) {

		Connection coon = getConnection();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = coon
					.prepareStatement("select * from admin where userName='"
							+ username + "' and userPw='" + pwd + "'");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
					
				if (coon != null){
					coon.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	/**
	 * 会员登录验证
	 * @param username 账号
	 * @param pwd 密码
	 * @return 是否成功
	 */
	public boolean loginUser(String usercount, String password) {

		Connection coon = getConnection();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = coon.prepareStatement("select * from user_info where user_account='"
							+ usercount + "' and user_password='" + password + "'");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (coon != null) {
					coon.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
