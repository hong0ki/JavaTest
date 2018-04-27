/**
 * @Package: com.lzh.test
 * @author: 李卓宏
 * @date: 2018年4月26日 下午3:56:17 
 */
package com.lzh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName: DBUtil
 * @Description: 数据库连接工具
 * @author 李卓宏
 * @date: 2018年4月26日 下午3:56:17 
 */
public class DBUtil {
	//设置常量
	private final static String URL="jdbc:mysql://localhost:3306/news?useUnicode=true&characterEncoding=utf-8&useSSL=true";
	private final static String USER="root";
	private final static String PASSWORD="root";
	/**
	 * 注册驱动
	 */
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	/**
	 * @Title: getConnection 
	 * @Description:连接数据库
	 * @return
	 * @return Connection
	 */
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	/**
	 * @Title: close 
	 * @Description: 释放资源
	 * @param set
	 * @param pdst
	 * @param conn
	 * @return void
	 */
	public static void close(ResultSet set,PreparedStatement pdst,Connection conn) {
		if (set!=null) {
			try {
				set.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		if (pdst!=null) {
			try {
				pdst.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		if (conn !=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
