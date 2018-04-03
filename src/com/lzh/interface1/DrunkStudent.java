/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午4:42:50 
 */
package com.lzh.interface1;

/**
 * @ClassName: DrunkStudent
 * @Description: 饮酒学生
 * @author THINK
 * @date: 2018年3月29日 下午4:42:50 
 */
public class DrunkStudent extends Student implements Drunk {

	/**
	 * 构造方法
	 */
	public DrunkStudent() {
	}

	public DrunkStudent(String name, int age) {
		super(name, age);
		
	}

	/* Title: drunking
	 * @Description: 饮酒
	 * @see com.lzh.interface1.Drunk#drunking()
	 */
	@Override
	public void drunking() {
		System.out.println(name+"学生饮酒---");
		
	}
	

}
