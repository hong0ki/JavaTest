package com.lzh.collection;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		
		//创建数组
		HashMap<Object, Object> ham=new HashMap<>();
		//添加元素
		ham.put(1, "23");
		ham.put(2, "234s");
		ham.put("ed", "sddrw");
		System.out.println("原数组："+ham);
		/**
		 * 删除元素
		 */
		//ham.remove(1);
		ham.remove(1, "23");
		System.out.println("删除后数组："+ham);
		/**
		 *修改元素
		 */
		ham.replace(2, "sddc");
		ham.replace("ed", "sddrw", "kdg");
		System.out.println("修改后数组："+ham);
		/**
		 * 查询
		 */
		for (Object key : ham.keySet()) {
			System.out.println(ham.get(key));
		}
	}

}
