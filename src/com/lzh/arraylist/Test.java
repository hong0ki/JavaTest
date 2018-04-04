/**
 * @Package: com.lzh.arraylist
 * @author: 李卓宏
 * @date: 2018年4月3日 下午3:50:29 
 */
package com.lzh.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月3日 下午3:50:29 
 */
public class Test {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Object> ar=new ArrayList<>();
		LinkedList<Object> lr=new LinkedList<>();
				
		ar.add("443");
		ar.add("udh");
		ar.add("84");
		ar.add(1, "dfd");
		
		/**
		 * 删除
		 */
		ar.remove(1);
		//ar.clear();
		
		/**
		 * 修改
		 */
		ar.set(2, "nini");
		
		/**
		 * 查询
		 */
		int att=ar.size();
		for (int i = 0; i < att; i++) {
			System.out.println(ar.get(i));
		}
		for (Object object : ar) {
			System.out.println(object);
		}



	}

}
