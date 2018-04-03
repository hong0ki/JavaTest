/**
 * @Package: com.lzh.string
 * @author: THINK 
 * @date: 2018年4月2日 下午3:49:20 
 */
package com.lzh.string;

/**
 * @ClassName: Reserve
 * @Description: TODO
 * @author THINK
 * @date: 2018年4月2日 下午3:49:20 
 */
public class Reverse {
	public static void main(String[] args) {
		String str="hello work";
		System.out.println(reserve(str));
	}

	/**@param str 
	 * @Title: reserve 
	 * @Description: string字符串反转
	 */
	private static String reserve(String str) {
		
		System.out.println(str);
		String s="";
		for(int i=(str.length()-1);i>=0;i--) {
			char  c=str.charAt(i);
			s+=c;
		}
		return s;
	}

}
