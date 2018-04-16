/**
 * @Package: com.lzh.thread.synchronize
 * @author: 李卓宏
 * @date: 2018年4月12日 下午3:38:38 
 */
package com.lzh.thread.synchronize;

import java.util.ArrayList;

/**
 * @ClassName: Consumer
 * @Description: 消费者消费
 * @author 李卓宏
 * @date: 2018年4月12日 下午3:38:38 
 */
public class Consumer implements Runnable {
private ArrayList<String> strs;
	
	/**
	 * 构造方法
	 */
	public Consumer(ArrayList<String> strs) {
		this.strs=strs;
	}

	/* Title: run
	 * @Description: TODO
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		while (true) {
			
			synchronized (strs) {//加锁
				//库存量大于零可以消费，否则等待
				if (strs.size()>0) {
					strs.remove(0);
					System.out.println(Thread.currentThread().getName()+"仓库产品数量"+strs.size());
				}
				else {
					System.out.println(Thread.currentThread().getName()+"仓库已空");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		}
	}

}
