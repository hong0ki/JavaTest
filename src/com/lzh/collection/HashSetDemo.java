/**
 * @Package: com.lzh.collection
 * @author: 李卓宏
 * @date: 2018年4月4日 下午5:40:00 
 */
package com.lzh.collection;

import java.util.HashSet;

/**
 * @ClassName: HashSetDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月4日 下午5:40:00 
 */
public class HashSetDemo {
	public static void main(String[] args) {
		test();
	}

	/**@Title: test 
	 * @Description: hashset测试
	 * @Params 
	 * @return void
	 */
	private static void test() {
		// 创建hashset数组
		HashSet<Object> ha=new HashSet<>();
		//添加元素
		ha.add("swdet32");
		ha.add(44);
		ha.add("kk");
		System.out.println("原数组："+ha);
		/**
		 * s删除元素
		 */
		ha.remove("kk");
		//ha.clear();
		System.out.println("删除后数组："+ha);
		/**
		 * 修改元素
		 */
		if (ha.contains(44)) {
			ha.remove(44);
			ha.add(55);
		}
		System.out.println("修改后数组："+ha);
		/**
		 * 查询数组
		 */
		for (Object object : ha) {
			System.out.println(object);
		}
	}

}
