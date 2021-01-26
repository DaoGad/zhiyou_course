package com.zhiyou100.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	
	static final String url = "jdbc:mysql:///crm";
	static final String usernameMysql = "root";
	static final String passwordMysql = "123456";
	static ResultSet rs;
	static PreparedStatement ps;
	static Connection conn;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, usernameMysql, passwordMysql);
		} catch (SQLException e) {
			System.out.println("连接异常");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeAll() {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ResultSet select(String sql,Object... param) {
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
		    if(param != null) {
		    	for (int i = 0; i < param.length; i++) {
					ps.setObject(i+1, param[i]);
				}
		    }
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public static int update(String sql,Object... param) {
		conn = getConnection();
		int rownum = -1;
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				ps.setObject(i+1, param[i]);
			}
			
			rownum = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rownum;
	}
	
	
	
}
