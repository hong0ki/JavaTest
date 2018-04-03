/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午4:08:57 
 */
package com.lzh.interface1;

/**
 * @ClassName: SmokingStudent
 * @Description: 抽烟学生
 * @author THINK
 * @date: 2018年3月29日 下午4:08:57 
 */
public class SmokingStudent extends Student implements Smoking {
	
	/**
	 * 构造方法
	 */
	public SmokingStudent() {
	}
	

	public SmokingStudent(String name, int age) {
		super(name, age);
		
	}


	/* Title: smoking
	 * @Description: 抽烟
	 * @see com.lzh.interface1.Smoking#smoking()
	 */
	@Override
	public void smoking() {
		System.out.println(name+"学生抽烟————");
		
	}

}
