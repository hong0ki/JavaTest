/**
 * @Package: com.lzh.exception
 * @author: THINK 
 * @date: 2018年3月30日 下午2:45:40 
 */
package com.lzh.exception;

/**
 * @ClassName: ExceptionDemo
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月30日 下午2:45:40 
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		ExceptionDemo exceptionDemo=new ExceptionDemo();
		exceptionDemo.show();
		
	}
	
	void show() {
		try {
			System.out.println("dsfsfds");
			System.out.println(9-1/1);
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("ddddd");
		}
		finally {
			System.out.println("jiesu;llll");
		}
	}

}
