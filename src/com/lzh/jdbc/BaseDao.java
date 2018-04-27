/**
 * @Package: com.lzh.test
 * @author: 李卓宏
 * @date: 2018年4月26日 下午5:14:26 
 */
package com.lzh.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 * @ClassName: BaseDao
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月26日 下午5:14:26 
 */
public abstract class BaseDao {
	public ArrayList<Object> query(String sql,ArrayList<Object> params) {
		Connection conn=null;
		 PreparedStatement stmt=null;
		ResultSet rest=null;
		ArrayList<Object> res=null;
		try {
			 conn=DBUtil.getConnection();
			stmt=conn.prepareStatement(sql);
			if(params!=null&&!params.isEmpty()) {
				for(int i=0;i<params.size();i++) {
				stmt.setObject(i+1, params.get(i));
				}
			}
			rest =stmt.executeQuery();
			
			while (rest.next()) {
				res.add(show(rest));
			}
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return res;
	}

	/**@param rest 
	 * @Title: show 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return void
	 */
	public abstract Object show(ResultSet rest); ;
	
}
