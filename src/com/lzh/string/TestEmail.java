/**
 * @Package: com.lzh.string
 * @author: THINK 
 * @date: 2018年4月2日 下午3:23:55 
 */
package com.lzh.string;

import java.util.Scanner;

/**
 * @ClassName: TestEmail
 * @Description: TODO
 * @author THINK
 * @date: 2018年4月2日 下午3:23:55 
 */
public class TestEmail {
	public static void main(String[] args) {
		start();
		
	}
	/**
	 * @Title: start 
	 * @Description: 开始
	 */

	private static void start() {
		System.out.println("输入邮箱");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Check check=new Check();
		
		if (check.checkEmail(str)) {
			System.out.println("验证成功");
		}else {
			System.out.println("邮箱验证失败");
		}
	}

	

	

}
