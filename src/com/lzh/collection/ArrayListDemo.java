/**
 * @Package: com.lzh.collection
 * @author: 李卓宏
 * @date: 2018年4月4日 下午4:44:50 
 */
package com.lzh.collection;

import java.util.ArrayList;

/**
 * @ClassName: ArrayListDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月4日 下午4:44:50 
 */
public class ArrayListDemo {
	
	public static void main(String[] args) {
		show();
	}

	/**@Title: show 
	 * @Description: 测试arraylist
	 * @Params 
	 * @return void
	 */
	private static void show() {
		//创建数组
		ArrayList<Object> ar=new ArrayList<>();
		
		//添加元素
		ar.add("22");
		ar.add(2);
		ar.add("sd");
		ar.add('c');
		System.out.println("原数组："+ar);
		/**
		 * 删除元素
		 */
		ar.remove("22");
		//ar.remove(0);
		//ar.clear();
		System.out.println("删除后数组："+ar);
		
		/**
		 * 修改元素
		 */
		ar.set(0, "dkdk");
		System.out.println("修改后数组："+ar);
		/**
		 * 查询数组
		 */
		System.out.println("for循环-----");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("foreach循环----");
		for (Object object : ar) {
			System.out.println(object);
		}
	}


}
