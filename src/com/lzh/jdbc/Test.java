/**
 * @Package: com.lzh.test
 * @author: 李卓宏
 * @date: 2018年4月27日 上午9:35:59 
 */
package com.lzh.jdbc;

import java.util.ArrayList;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月27日 上午9:35:59 
 */
public class Test {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		String sql="select * from student";
		ArrayList<Object> params=new ArrayList<>();
		
		BaseDao dao=new BaseDaoImpl();
		params=dao.query(sql, null);
		System.out.println(params);

	}

}
