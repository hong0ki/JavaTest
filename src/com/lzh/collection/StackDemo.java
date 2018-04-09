/**
 * @Package: com.lzh.collection
 * @author: 李卓宏
 * @date: 2018年4月8日 下午12:19:54 
 */
package com.lzh.collection;

import java.util.Stack;

/**
 * @ClassName: StackDemo
 * @Description: Stack测试
 * @author 李卓宏
 * @date: 2018年4月8日 下午12:19:54 
 */
public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Object> st=new Stack<>();
		st.push("2");
		st.push("3");
		st.push("4");
		st.push("2");
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		
	}
}
