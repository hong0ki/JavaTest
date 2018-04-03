/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午3:52:32 
 */
package com.lzh.interface1;

/**
 * @ClassName: SmokingTeacher
 * @Description: 抽烟老师
 * @author THINK
 * @date: 2018年3月29日 下午3:52:32 
 */
public class SmokingTeacher extends Teacher implements Smoking {
	
	/**
	 * 构造方法
	 */
	public SmokingTeacher() {
	}
	

	public SmokingTeacher(String name, int age) {
		super(name, age);
		
	}


	/* Title: smoking
	 * @Description: TODO
	 * @see com.lzh.interface1.Smoking#smoking()
	 */
	@Override
	public void smoking() {
		System.out.println(name+"老师抽烟————");
		
	}

}
