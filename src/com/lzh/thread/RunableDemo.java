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
public class RunableDemo implements Runnable {

	private int ticket = 100;

	/*
	 * Title: run
	 * 
	 * @Description: TODO
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		while (true) {
			synchronized (this) {
				if (ticket > 0) {

					System.out.println(Thread.currentThread().getName() + "你买的票号是：" + this.ticket--);
				} else {
					break;
				}

			}

		}

	}

}
