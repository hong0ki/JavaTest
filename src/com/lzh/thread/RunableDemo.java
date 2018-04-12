/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月12日 上午10:02:06 
 */
package com.lzh.thread;

/**
 * @ClassName: RunableDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月12日 上午10:02:06 
 */
public class RunableDemo implements Runnable{

	

	/* Title: run
	 * @Description: TODO
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"线程"+i+"开始了&&&&&&&");
		}
	}

}
