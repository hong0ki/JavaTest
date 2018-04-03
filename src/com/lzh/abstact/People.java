/**
 * @Package: com.lzh.abstact
 * @author: THINK 
 * @date: 2018年3月28日 下午3:01:22 
 */
package com.lzh.abstact;

/**
 * @ClassName: People
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 下午3:01:22 
 */
public class People {
	private String name;
	private String contry;
	private int age;
	private String sex;
	private boolean isMarray;
	
	/**
	 * 
	 */
	public People() {
	}

	public People(String name, String contry, int age, String sex, boolean isMarray) {
		super();
		this.name = name;
		this.contry = contry;
		this.age = age;
		this.sex = sex;
		this.isMarray = isMarray;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isMarray() {
		return isMarray;
	}

	public void setMarray(boolean isMarray) {
		this.isMarray = isMarray;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", contry=" + contry + ", age=" + age + ", sex=" + sex + ", isMarray="
				+ isMarray + "]";
	}

	

}
