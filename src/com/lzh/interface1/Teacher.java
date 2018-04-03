/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午3:36:29 
 */
package com.lzh.interface1;

import java.util.jar.Attributes.Name;

/**
 * @ClassName: Teacher
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 下午3:36:29 
 */
public class Teacher extends People {
	
	/**
	 * 构造方法
	 */
	public Teacher() {
	}
	

	public Teacher(String name, int age) {
		super(name, age);
		
	}


	/* Title: eat
	 * @Description: TODO
	 * @see com.lzh.interface1.People#eat()
	 */
	@Override
	public void eat() {
		System.out.println(name+"老师吃饭——————");
	}



}
