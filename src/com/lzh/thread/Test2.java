/**
 * @Package: com.lzh.thread
 * @author: 李卓宏
 * @date: 2018年4月12日 上午11:46:56 
 */
package com.lzh.thread;

/**
 * @ClassName: Test2
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月12日 上午11:46:56
 */
public class Test2 {
	public static void main(String[] args) {
		
		RunableDemo rDemo=new RunableDemo();
		Thread thread=new Thread(rDemo,"窗口1");
		thread.start();
//		new Thread(rDemo,"窗口2").start();
//		new Thread(rDemo,"窗口3").start();
//		new Thread(rDemo,"窗口4").start();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		
	}
}
