package com.lzh.student;

import java.io.Serializable;
/**
 * 
 * @ClassName: ProductBean
 * @Description: 学生实体类
 * @author 李卓宏
 * @date: 2018年4月3日 下午5:30:52
 * 1、属性
	 * 2、有参无参构造函数
	 * 3、get、set方法
	 * 4、tostring方法
	 * 5、序列化
 */
public class StudentBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	private String sex;
	
	/**
	 * 构造方法
	 */
	public StudentBean() {
	}

	public StudentBean(int id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	
}
