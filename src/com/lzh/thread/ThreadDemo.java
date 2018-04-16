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

	private int start;
	private String str;

	public ThreadDemo(int start,String str) {
		super();
		this.start = start;
		this.str=str;
	}

	/*
	 * Title: run
	 * 
	 * @Description: TODO
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		String string = "kddk";
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (start + i));
			
			synchronized (str) {
				try {
					str.wait(1000);
					//sleep(1000);
					
				} catch (InterruptedException e) {

					e.printStackTrace();
					i = 26;
				}
			}
		}

	}

}
