/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月13日 上午10:22:45 
 */
package com.lzh.thread;

/**
 * @ClassName: WaitDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月13日 上午10:22:45 
 */
public class WaitDemo extends Thread{
	private String str;
	
	/**
	 * 构造方法
	 */
	public WaitDemo() {
	}

	public WaitDemo(String str) {
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
			System.out.println("阻塞-----");
			try {
				str.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("阻塞--*******--");
		}
	}

}
