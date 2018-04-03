/**
 * @Package: com.lzh.more
 * @author: THINK 
 * @date: 2018年3月28日 上午11:42:07 
 */
package com.lzh.more;

/**
 * @ClassName: Animal
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 上午11:42:07 
 */
public class Animal {
	protected String name;
	/**
	 * 
	 */
	public Animal() {
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public void say() {
		System.out.println("----");
	}
}
