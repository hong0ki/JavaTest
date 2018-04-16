/**
 * @Package: com.lzh.thread.synchronize
 * @author: 李卓宏
 * @date: 2018年4月12日 下午3:07:20 
 */
package com.lzh.thread.synchronize;

import java.util.ArrayList;

/**
 * @ClassName: Productor
 * @Description: 生产者生产
 * @author 李卓宏
 * @date: 2018年4月12日 下午3:07:20 
 */
public class Productor implements Runnable  {
	
	private ArrayList<String> strs;
	
	/**
	 * 构造方法
	 */
	
	public Productor() {
	}
	public Productor(ArrayList<String> strs) {
		this.strs=strs;
	}

	/* Title: run
	 * @Description: TODO
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while (true) {
			//加锁
			synchronized (strs) {
				//仓库容量小于10，添加产品，大于10等待
				if (strs.size()<10) {
					strs.add("a");
				System.out.println(Thread.currentThread().getName()+"仓库产品"+strs.size());
				}
				else {
					System.out.println(Thread.currentThread().getName()+"仓库已满！！");
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
