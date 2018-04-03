/**
 * @Package: com.lzh.more
 * @author: THINK 
 * @date: 2018年3月28日 上午11:45:38 
 */
package com.lzh.more;

/**
 * @ClassName: Cat
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 上午11:45:38 
 */
public class Cat extends Animal {
	/**
	 * 
	 */
	public Cat() {
	}

	public Cat(String name) {
		super(name);
		
	}

	@Override
	public void say() {
		System.out.println("猫----");
	}
	

}
