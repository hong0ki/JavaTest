/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午4:44:41 
 */
package com.lzh.interface1;

/**
 * @ClassName: SmokingDrunkStudent
 * @Description: 抽烟饮酒学生
 * @author THINK
 * @date: 2018年3月29日 下午4:44:41 
 */
public class SmokingDrunkStudent extends Student implements Smoking,Drunk {
	/**
	 * 构造方法
	 */
	public SmokingDrunkStudent() {
	}

	public SmokingDrunkStudent(String name, int age) {
		super(name, age);
		
	}

	/* Title: drunking
	 * @Description: 饮酒
	 * @see com.lzh.interface1.Drunk#drunking()
	 */
	@Override
	public void drunking() {
		System.out.println(name+"学生饮酒----");
		
	}

	/* Title: smoking
	 * @Description: 抽烟
	 * @see com.lzh.interface1.Smoking#smoking()
	 */
	@Override
	public void smoking() {
		System.out.println(name+"学生抽烟---");
		
	}
	

}
