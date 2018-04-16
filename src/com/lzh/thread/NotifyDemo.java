/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月13日 上午10:17:52 
 */
package com.lzh.thread;

/**
 * @ClassName: NotifyDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月13日 上午10:17:52 
 */
public class NotifyDemo extends  Thread {
	
	private String str;
	/**
	 * 构造方法
	 */
	public NotifyDemo() {
	}
	public NotifyDemo(String str) {
		super();
		this.str = str;
	}
	
	/* Title: run
	 * @Description: TODO
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		synchronized (str) {
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			str.notify();
		}
	}

}
