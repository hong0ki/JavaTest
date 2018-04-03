/**
 * @Package: com.lzh.string
 * @author: THINK 
 * @date: 2018年4月2日 下午5:33:11 
 */
package com.lzh.string;

import java.util.Scanner;

/**
 * @ClassName: StartBall
 * @Description: 开始下注
 * @author THINK
 * @date: 2018年4月2日 下午5:33:11 
 */
public class StartBall {
	/**
	 * @Title: start 
	 * @Description: 开始下注
	 */
	public void start() {
		while(true) {
			System.out.println("=====双色球下注系统======");
			System.out.println("请输入注数：");
			Scanner sc=new Scanner(System.in);
			try {
				int count=sc.nextInt();
				for(int i=0;i<count;i++) {
					CreateBall createBall=new CreateBall();
					
					System.out.println(createBall.createRedBall()+" "+createBall.creatBuleBall());
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
