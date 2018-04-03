/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午3:57:11 
 */
package com.lzh.interface1;

/**
 * @ClassName: SmokingDrunkTeacher
 * @Description: 抽烟饮酒老师
 * @author THINK
 * @date: 2018年3月29日 下午3:57:11 
 */
public class SmokingDrunkTeacher extends Teacher implements Smoking,Drunk {
	
	/**
	 * 构造方法
	 */
	public SmokingDrunkTeacher() {
	}
	

	public SmokingDrunkTeacher(String name, int age) {
		super(name, age);
		
	}


	/* Title: drunking
	 * @Description: TODO
	 * @see com.lzh.interface1.Drunk#drunking()
	 */
	@Override
	public void drunking() {
		System.out.println(name+"老师抽烟————");
		
	}

	/* Title: smoking
	 * @Description: TODO
	 * @see com.lzh.interface1.Smoking#smoking()
	 */
	@Override
	public void smoking() {
		System.out.println(name+"老师饮酒----");
		
	}

}
