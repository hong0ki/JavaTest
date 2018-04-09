/**
 * @Package: com.lzh.arraylist
 * @author: 李卓宏
 * @date: 2018年4月8日 下午3:57:20 
 */
package com.lzh.arraylist;

import java.io.Serializable;

/**
 * @ClassName: PeopleBean
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月8日 下午3:57:20 
 */
public class PeopleBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	private String  date;
	
	/**
	 * 构造方法
	 */
	public PeopleBean() {
	}

	public PeopleBean(int age, String name, String date) {
		super();
		this.age = age;
		this.name = name;
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "PeopleBean [age=" + age + ", name=" + name + ", date=" + date + "]";
	}
	
}
