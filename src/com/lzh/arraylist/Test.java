/**
 * @Package: com.lzh.arraylist
 * @author: 李卓宏
 * @date: 2018年4月3日 下午3:50:29 
 */
package com.lzh.arraylist;

import java.util.ArrayList;
import java.util.Collections;
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
		
		ArrayList<PeopleBean> list=new ArrayList<PeopleBean>();
		
		list.add(new PeopleBean(23,"打开","2001-04-11"));
		list.add(new PeopleBean(22,"看看","2007-12-11"));
		list.add(new PeopleBean(21,"老师","2011-12-17"));
		list.add(new PeopleBean(28,"客服","2001-02-11"));
		list.add(new PeopleBean(13,"了开","2003-10-11"));
		
		//Collections.sort(list);
		
		for (PeopleBean peopleBean : list) {
			System.out.println(peopleBean);
		}
	}

}
