/**
 * @Package: com.lzh.more
 * @author: THINK 
 * @date: 2018年3月28日 上午11:44:03 
 */
package com.lzh.more;

/**
 * @ClassName: Dog
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 上午11:44:03 
 */
public class Dog extends Animal{
	/**
	 * 
	 */
	public Dog() {
	}

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void say() {
		System.out.println("狗——————");
	}
	

}
