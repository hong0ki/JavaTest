/**
 * @Package: com.lzh.test
 * @author: 李卓宏
 * @date: 2018年4月26日 下午6:02:47 
 */
package com.lzh.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @ClassName: BaseDaoImpl
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月26日 下午6:02:47 
 */
public class BaseDaoImpl extends BaseDao {

	/* Title: show
	 * @Description: TODO
	 * @see com.lzh.test.BaseDao#show(java.sql.ResultSet)
	 */
	@Override
	public Object show(ResultSet rest) {
		try {
			int sno=rest.getInt("sno");
			String sname=rest.getString("sname");
			Date sage=rest.getDate("sage");
			String ssex=rest.getString("ssex");
			new Student(sno,sname,sage,ssex);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
