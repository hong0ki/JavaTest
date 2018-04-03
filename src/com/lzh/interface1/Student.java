/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午3:38:45 
 */
package com.lzh.interface1;

/**
 * @ClassName: Student
 * @Description: 学生类
 * @author THINK
 * @date: 2018年3月29日 下午3:38:45 
 */
public class Student extends People  {
	
	/**
	 * 构造方法
	 */
	public Student() {
	}
	

	public Student(String name, int age) {
		super(name, age);
		
	}
	
	/* Title: eat
	 * @Description: 学生吃饭
	 * @see com.lzh.interface1.People#eat()
	 */
	@Override
	public void eat() {
		System.out.println("学生吃饭——————");
		
	}

}
