/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午3:55:04 
 */
package com.lzh.interface1;

/**
 * @ClassName: DrunkTeacher
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 下午3:55:04 
 */
public class DrunkTeacher extends Teacher implements Drunk {
	
	/**
	 * 构造方法
	 */
	public DrunkTeacher() {
	}
	

	public DrunkTeacher(String name, int age) {
		super(name, age);
		
	}


	/* Title: drunking
	 * @Description: 老师
	 * @see com.lzh.interface1.Drunk#drunking()
	 */
	@Override
	public void drunking() {
		System.out.println(name+"老师饮酒---");
		
	}

}
