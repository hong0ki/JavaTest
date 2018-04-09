package com.lzh.collection;

import java.util.TreeSet;

/**
 * 
 * @ClassName: TreeSetDemo
 * @Description: TreeSet测试
 * @author 李卓宏
 * @date: 2018年4月8日 上午9:02:48
 */
public class TreeSetDemo {
	
	public static void main(String[] args) {
		test();
	}
	/**
	 * @Title: test 
	 * @Description: TreeSet测试方法
	 * @Params 
	 * @return void
	 */
	private static void test() {
		
		TreeSet<Object> tr=new TreeSet(new ProductPriceSort());
		//添加元素  
		tr.add(new ProductBean(0, "是的咯", 67));
		tr.add(new ProductBean(3, "是啊咯", 7));
		tr.add(new ProductBean(2, "啊是咯", 167));
		tr.add(new ProductBean(4, "v是咯", 57));
		tr.add(new ProductBean(7, "测是咯", 97));
		
		System.out.println("原数组："+tr);
//		/**
//		 * 删除元素
//		 */
//		tr.remove("75");
//		//tr.clear();
//		System.out.println("删除后数组："+tr);
//		/**
//		 * 修改后
//		 */if (tr.contains("12")) {
//				tr.remove("12");
//				tr.add("55");
//			}
//		System.out.println("修改后数组："+tr);
//		/**
//		 * 查询
//		 */
//		for (Object object : tr) {
//			System.out.println(object);
//		}
//		System.out.println(tr.ceiling("83"));
//		System.out.println(tr.first()+"第一个元素");
//		System.out.println(tr.floor("56"));
//		
		
		
	}

}
