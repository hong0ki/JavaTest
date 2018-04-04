/**
 * @Package: com.lzh.collection
 * @author: 李卓宏
 * @date: 2018年4月4日 下午5:53:12 
 */
package com.lzh.collection;

import java.util.LinkedHashSet;

/**
 * @ClassName: LinkedHashSetDemo
 * @Description: LinkedHashSet
 * @author 李卓宏
 * @date: 2018年4月4日 下午5:53:12 
 */
public class LinkedHashSetDemo {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @Params @param args
	 * @return void
	 */
	public static void main(String[] args) {
		test();

	}

	/**@Title: test 
	 * @Description: LinkedHashSet测试
	 * @Params 
	 * @return void
	 */
	private static void test() {
		// 新建LinkedHashSet数组
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		//添加元素
		lhs.add("ww");
		lhs.add(66);
		lhs.add("lll");
		System.out.println("原数组："+lhs);
		/**
		 * 删除元素
		 */
		lhs.remove(66);
		lhs.clear();
		System.out.println("删除后数组："+lhs);
	}

}
