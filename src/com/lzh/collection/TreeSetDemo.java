package com.lzh.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		
		TreeSet<Object> tr=new TreeSet<>();
		//添加元素  
		tr.add("dd");
		tr.add("75");
		tr.add("83");
		tr.add("12");
		tr.add("15");
		tr.add("12");
		System.out.println("原数组："+tr);
		/**
		 * 删除元素
		 */
		tr.remove("75");
		//tr.clear();
		System.out.println("删除后数组："+tr);
		/**
		 * 修改后
		 */if (tr.contains("12")) {
				tr.remove("12");
				tr.add("55");
			}
		System.out.println("修改后数组："+tr);
		/**
		 * 查询
		 */
		for (Object object : tr) {
			System.out.println(object);
		}
		System.out.println(tr.ceiling("83"));
		System.out.println(tr.first()+"第一个元素");
		System.out.println(tr.floor("56"));
		
		
		
	}

}
