/**
 * @Package: com.lzh.more
 * @author: THINK 
 * @date: 2018年3月28日 上午11:48:52 
 */
package com.lzh.more;


/**
 * @ClassName: Test
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 上午11:48:52 
 */
public class Test {
	public static void main(String[] args) {
		Animal pet1=new Dog("狗1");
		Cat pet2=new Cat("猫1");
		People people=new People("dkd", pet2);
		people.showPet();
	}

}
