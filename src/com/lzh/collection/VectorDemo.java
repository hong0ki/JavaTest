/**
 * @Package: com.lzh.collection
 * @author: 李卓宏
 * @date: 2018年4月4日 下午5:26:24 
 */
package com.lzh.collection;

import java.util.Vector;

/**
 * @ClassName: VectorDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月4日 下午5:26:24 
 */
public class VectorDemo {
	public static void main(String[] args) {
		show();
	}

	/**@Title: show 
	 * @Description: vector测试
	 * @Params 
	 * @return void
	 */
	private static void show() {
		//新建vector数组
		Vector<Object> ve=new Vector<>();
		//添加元素
		ve.add("44");
		ve.addElement(99);
		ve.add(1, "uuuu");
		System.out.println("原数组："+ve);
		/**
		 * 删除元素
		 */
		//ve.remove(1);
		//ve.removeAllElements();
		//ve.clear();
		ve.removeElementAt(0);
		System.out.println("删除后数组;"+ve);
		/**
		 * 修改元素
		 */
		ve.set(1, "dsfddsf");
		ve.setElementAt("llllll", 0);
		System.out.println("修改后数组："+ve);
		/**
		 * 查询
		 */
		System.out.println("for循环-----");
		for (int i = 0; i < ve.size(); i++) {
			System.out.println(ve.get(i));
		}
		System.out.println("foreach循环----");
		for (Object object : ve) {
			System.out.println(object);
		}
	}

}
