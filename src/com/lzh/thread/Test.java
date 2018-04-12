/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月12日 上午10:17:54 
 */
package com.lzh.thread;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月12日 上午10:17:54 
 */
public class Test {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		RunableDemo rDemo=new RunableDemo();
		new Thread(rDemo,"实现").start();
		ThreadDemo pDemo=new ThreadDemo();
		pDemo.start();
		System.out.println("zhu线程1开始了");
		
		System.out.println("主线程————————");
		System.out.println(Thread.activeCount()+"ppppppppp");
	}

}
