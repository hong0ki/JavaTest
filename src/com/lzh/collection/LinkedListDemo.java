/**
 * @Package: com.lzh.collection
 * @author: 李卓宏
 * @date: 2018年4月4日 下午5:06:50 
 */
package com.lzh.collection;

import java.util.LinkedList;

/**
 * @ClassName: LinkedListDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月4日 下午5:06:50
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		show();
	}

	/**
	 * @Title: show
	 * @Description: linkedlist测试
	 * @Params
	 * @return void
	 */
	private static void show() {

		// 创建linkedlist数组
		LinkedList<Object> link = new LinkedList<>();
		// 添加元素
		link.add("42");
		link.add("kk");
		link.add(1, 4);
		link.addFirst("oo");
		link.addLast("mm");
		System.out.println("原数组："+link);
		/**
		 * 删除元素
		 */
		// link.remove("kk");
		//link.removeFirst();
		//link.removeLast();
		//link.remove();
		//link.peek();
		link.poll();
		System.out.println("删除后数组："+link);
		/**
		 * 修改元素
		 */
		link.set(2, "gggg");
		System.out.println("修改后数组："+link);
		/**
		 * 查询
		 */
		System.out.println("for循环-----");
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i));
		}
		System.out.println("foreach循环----");
		for (Object object : link) {
			System.out.println(object);
		}
	}

}
