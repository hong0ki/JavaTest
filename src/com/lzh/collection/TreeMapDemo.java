package com.lzh.collection;

import java.util.TreeMap;
/**
 * 
 * @ClassName: TreeMapDemo
 * @Description: TreeMap测试
 * @author 李卓宏
 * @date: 2018年4月8日 上午9:02:05
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		test();

	}
	/**
	 * @Title: test 
	 * @Description: TreeMap测试方法
	 * @Params 
	 * @return void
	 */
	private static void test() {
		//创建数组
		TreeMap<Object, Object> tm=new TreeMap<>();
		//添加元素
		tm.put(1, "34ddf");
		tm.put(2, "djia");
		tm.put(3, "94");
		tm.put(5, "ds");
		System.out.println("原数组"+tm);
		/**
		 * 删除元素
		 */
		tm.remove(3);
		System.out.println("删除后数组："+tm);
		/**
		 * 修改元素
		 */
		tm.replace(2, "sddc");
		tm.replace(5, "ds", "kdg");
		System.out.println("修改后数组："+tm);
		/**
		 * 查询
		 */
		for (Object object : tm.keySet()) {
			System.out.println(tm.get(object));
		}
		System.out.println(tm.ceilingKey(2));
		System.out.println(tm.firstKey()+"第一个元素");
		System.out.println(tm.floorKey(4));
		
	}

}
