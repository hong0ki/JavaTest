/**
 * @Package: com.lzh.string
 * @author: THINK 
 * @date: 2018年4月2日 下午5:12:40 
 */
package com.lzh.string;

import java.util.Random;

/**
 * @ClassName: CreateBall
 * @Description: 生成双色球
 * @author THINK
 * @date: 2018年4月2日 下午5:12:40 
 */
public class CreateBall {
	/**
	 * @Title: createRedBall 
	 * @Description: 生成红球
	 * @return
	 */
	public String createRedBall() {
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<=5;i++) {
			int randomRedBall=(new Random().nextInt(33))+1;
			stringBuffer.append(randomRedBall+" ");
		}
		return "生成红色号码： "+stringBuffer.toString();
	}
	/**
	 * @Title: creatBuleBall 
	 * @Description: 生成篮球
	 * @return
	 */
	public String creatBuleBall() {
		int randomBuleBall=(new Random().nextInt(16))+1;
		return "生成蓝色号码： "+randomBuleBall;
	}

}
