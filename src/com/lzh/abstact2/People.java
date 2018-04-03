/**
 * @Package: com.lzh.abstact2
 * @author: THINK 
 * @date: 2018年3月29日 上午8:58:44 
 */
package com.lzh.abstact2;

/**
 * @ClassName: People
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 上午8:58:44 
 */
public abstract class People {
	protected String name;//名字
	protected String sex;//性别
	protected int age;//年龄
	protected People people;//配偶
	
	
	public People() {
		
	}

	public People(String name, String sex, int age, People people) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.people = people;
	}
	
	//抽象方法  是否可以结婚
	protected abstract boolean isMarry(People people);
	
	//抽象方法  是否满足结婚的年龄
	protected abstract boolean isAge();


}
