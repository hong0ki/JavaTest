/**
 * @Package: com.lzh.test
 * @author: 李卓宏
 * @date: 2018年4月26日 上午10:04:36 
 */
package com.lzh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: Demo1
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月26日 上午10:04:36
 */
public class Demo1 {
	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		 Connection conn=null;
		 PreparedStatement stmt=null;
		ResultSet rest=null;
		try {
			conn = DBUtil.getConnection();

			String sql = "insert into student(sno,sname,sage,ssex) values (?,?,?,?)";

			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 14);
			stmt.setString(2, "端口");
			stmt.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			stmt.setString(4, "nn");
			stmt.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, conn);
		}
	}

}
