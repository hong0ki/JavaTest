/**
 * @Package: com.lzh.string
 * @author: THINK 
 * @date: 2018年4月2日 下午5:12:40 
 */
package com.lzh.string;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
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
		//不重复随机数
		HashSet<Integer> hs=new HashSet<>();
		while(hs.size()<6) {
			int randomRedBall=(new Random().nextInt(33))+1;
			hs.add(randomRedBall);
		}
		ArrayList<Integer> strs=new ArrayList<>();
		for (int i : hs) {
			strs.add(i);
			
		}
		//排序
		int[] ib=new int[6];
		for (int i = 0; i < strs.size(); i++) {
			ib[i]=strs.get(i);
		}
		for (int i = 0; i < ib.length-1; i++) {
			for (int j = 0; j < ib.length-1-i; j++) {
				if (ib[j]>ib[j+1]) {
					int temp =ib[j];
					ib[j] =ib[j+1];
					ib[j+1] =temp;
				}
			}
		}
		for (int i = 0; i < ib.length; i++) {
			stringBuffer.append(ib[i]+" ");
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
