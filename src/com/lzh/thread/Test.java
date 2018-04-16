/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月12日 上午10:17:54 
 */
package com.lzh.thread;

import java.util.Scanner;

/**
 * @ClassName: Test
 * @Description: 打印a-z
 * @author 李卓宏
 * @date: 2018年4月12日 上午10:17:54 
 */
public class Test {

	/**@Title: main 
	 * @Description:打印a-z
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
//		RunableDemo rDemo=new RunableDemo();
//		new Thread(rDemo).start();
		String str="kkk";
		ThreadDemo pDemo=new ThreadDemo(65,str);
		pDemo.start();
		ThreadDemo pDemo1=new ThreadDemo(97,str);
		pDemo1.start();
		//NotifyDemo notifyDemo=new NotifyDemo(str);
//		Scanner sc=new Scanner(System.in);
//		String str1=sc.next();
//		if (str1!=null) {
//			pDemo.interrupt();
//		}
		//notifyDemo.start();
	}

}
