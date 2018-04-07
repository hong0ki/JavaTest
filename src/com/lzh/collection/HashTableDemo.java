package com.lzh.collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		//创建数组
		Hashtable<Object, Object> hat=new Hashtable<>();
		//添加元素
		hat.put(2, "23da");
		hat.put(3, "342");
		hat.put(5, "kkfsls");
		System.out.println("原数组："+hat);
		/**
		 * 删除元素
		 */
		hat.remove(2);
		System.out.println("删除后数组："+hat);
		/**
		 * 修改元素
		 */
		hat.replace(2, "sddc");
		hat.replace(5, "kkfsls", "kdg");
		System.out.println("修改后数组："+hat);
		/**
		 * 查询
		 */
		for (Object key : hat.keySet()) {
			System.out.println(hat.get(key));
		}
		System.out.println("k"+hat.toString());
	}

}
