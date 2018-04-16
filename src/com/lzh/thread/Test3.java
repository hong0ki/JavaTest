/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月13日 上午10:25:24 
 */
package com.lzh.thread;

import java.util.Scanner;

/**
 * @ClassName: Test3
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月13日 上午10:25:24 
 */
public class Test3 {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		String str="";
		WaitDemo wDemo=new WaitDemo(str);
		wDemo.start();
		NotifyDemo nDemo=new NotifyDemo(str);
		nDemo.start();
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		if (str1!=null) {
			wDemo.interrupt();
		}

	}

}
