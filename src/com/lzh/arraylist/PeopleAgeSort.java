/**
 * @Package: com.lzh.arraylist
 * @author: 李卓宏
 * @date: 2018年4月8日 下午3:59:48 
 */
package com.lzh.arraylist;

import java.util.Comparator;

/**
 * @ClassName: PeopleAgeSort
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月8日 下午3:59:48 
 */
public class PeopleAgeSort implements Comparator<PeopleBean> {

	/* Title: compare
	 * @Description: 根据年龄排序
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(PeopleBean o1, PeopleBean o2) {
		
		return o1.getAge()>o2.getAge()?1:o1.getAge()<o2.getAge()?-1:0;
	}

}
