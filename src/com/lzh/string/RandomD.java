/**
 * @Package: com.lzh.string
 * @author: THINK 
 * @date: 2018年4月2日 下午3:01:23 
 */
package com.lzh.string;

import java.util.Random;

/**
 * @ClassName: RandomD
 * @Description: TODO
 * @author THINK
 * @date: 2018年4月2日 下午3:01:23 
 */
public class RandomD {
	public static void main(String[] args) {
		String [] strs= {"kdk","客服","地方","等等","上午","个","弱女","更改","色","函数"};
		
		math(strs);
		random(strs);
		
	}

	/**@Title: math 
	 * @Description: math随机点名
	 * @param strs
	 */
	private static void math(String[] strs) {
		int a=(int) (Math.random()*10);
		System.out.println(strs[a]+"--数学随机点名");
		
	}

	/**@Title: random 
	 * @Description: 随机点名
	 * @param strs
	 */
	private static void random(String[] strs) {
		int a=new Random().nextInt(strs.length);
		//System.out.println(a);
		System.out.println(strs[a]+"--随机-");
		
	}

}
