/**
 * @Package: com.lzh.thread.synchronize
 * @author: 李卓宏
 * @date: 2018年4月12日 下午3:26:12 
 */
package com.lzh.thread.synchronize;

import java.util.ArrayList;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月12日 下午3:26:12 
 */
public class Test {

	/**@Title: main 
	 * @Description: 消费者与生产者
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		//定义arraylist容器
		ArrayList<String> str=new ArrayList<>();
		//生产者线程
		Productor pr1=new Productor(str);
		new Thread(pr1).start();
		new Thread(pr1).start();
		//消费者线程
		Consumer con=new Consumer(str);
		new Thread(con).start();
		new Thread(con).start();

	}

}
