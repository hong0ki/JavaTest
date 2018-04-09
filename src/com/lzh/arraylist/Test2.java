/**
 * @Package: com.lzh.arraylist
 * @author: 李卓宏
 * @date: 2018年4月8日 下午4:10:45 
 */
package com.lzh.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName: Test2
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月8日 下午4:10:45 
 */
public class Test2 {
	
	public static void main(String[] args) {
		ArrayList<PeopleBean> list=new ArrayList<>();
		
		list.add(new PeopleBean(23,"打开","2001-04-11"));
		list.add(new PeopleBean(22,"看看","2007-12-11"));
		list.add(new PeopleBean(21,"老师","2011-12-17"));
		list.add(new PeopleBean(28,"客服","2001-02-11"));
		list.add(new PeopleBean(13,"了开","2003-10-11"));
		
		for (PeopleBean peopleBean : list) {
			System.out.println(peopleBean);
		}
		System.out.println("------------------");
		Collections.sort(list, new PeopleAgeSort());
		for (PeopleBean peopleBean : list) {
			System.out.println(peopleBean);
		}
		System.out.println("------------------");
		Collections.sort(list, new PeopleDateSort());
		for (PeopleBean peopleBean : list) {
			System.out.println(peopleBean);
		}
	
	}

}
