/**
 * @Package: com.lzh.abstact2
 * @author: THINK 
 * @date: 2018年3月29日 上午9:02:54 
 */
package com.lzh.abstact2;

/**
 * @ClassName: UsaPeople
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 上午9:02:54 
 */
public class UsaPeople extends People {
	
	/**
	 * 
	 */
	public UsaPeople() {
	}
	

	public UsaPeople(String name, String sex, int age, People people) {
		super(name, sex, age, people);
		
	}


	/* (non-Javadoc)
	 * @see com.lzh.abstact2.People#isMarry(com.lzh.abstact2.People)
	 */
	@Override
	protected boolean isMarry(People people) {
		if ((!this.isAge()) || (!people.isAge())) {
			System.out.println(this.name+"和"+people.name+"你们两个其中一个年龄太小，不可以结婚！！");
			return false;
		}else if ((this.people!=null) || (people.people!=null)){
			System.out.println(this.name+"和"+people.name+"你们两个其中一个已经结婚，不可以结婚！！");
			return false;
		}
		//可以结婚
		System.out.println(this.name+"和"+people.name+"可以结婚！！");
		this.people=people;
		people.people=this;
		
		return true;
	}

	/*
	 * Title: isAge
	 * @Description: 年龄是否满足
	 * @see com.lzh.abstact2.People#isAge()
	 */
	@Override
	protected boolean isAge() {
		if (age>=18) {
			return true;
		}
		return false;
	}

}
