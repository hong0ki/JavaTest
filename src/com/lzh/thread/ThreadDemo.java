/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月12日 上午9:55:23 
 */
package com.lzh.thread;

/**
 * @ClassName: ThreadDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月12日 上午9:55:23 
 */
public class ThreadDemo extends Thread {


	
	/* Title: run
	 * @Description: TODO
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"线程"+i+"开始了******");
		}
		
	}

}
