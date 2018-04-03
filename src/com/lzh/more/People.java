/**
 * @Package: com.lzh.more
 * @author: THINK 
 * @date: 2018年3月28日 上午11:46:45 
 */
package com.lzh.more;

/**
 * @ClassName: People
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 上午11:46:45 
 */
public class People {
	private String name;
	private Animal pet;
	/**
	 * 
	 */
	public People() {
	}
	public People(String name, Animal pet) {
		super();
		this.name = name;
		this.pet = pet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getPet() {
		return pet;
	}
	public void setPet(Animal pet) {
		this.pet = pet;
	}
	public void showPet() {
		pet.say();
	}

}
