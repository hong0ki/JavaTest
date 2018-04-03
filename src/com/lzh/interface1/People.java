/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午3:32:47 
 */
package com.lzh.interface1;

/**
 * @ClassName: People
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 下午3:32:47 
 */
public abstract class People {
	
	protected String name;
	protected int age;
	
	/**
	 * 构造方法
	 */
	public People() {
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//吃饭
	public abstract void eat();
	//睡觉
	public void sleep() {
		System.out.println("睡觉-----");
	}

}
