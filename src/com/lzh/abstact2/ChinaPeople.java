/**
 * @Package: com.lzh.abstact2
 * @author: THINK 
 * @date: 2018年3月29日 上午9:00:17 
 */
package com.lzh.abstact2;

/**
 * @ClassName: ChinaPeople
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 上午9:00:17 
 */
public class ChinaPeople extends People {

	public ChinaPeople() {
	}
	
	public ChinaPeople(String name, String sex, int age, People people) {
		super(name, sex, age, people);
	}
	

	/**
	 * 
	 * <p>Title: isMarry</p> 
	 * <p>Description: 是否可以结婚 </p> 
	 * @param people
	 * @return 
	 * @see com.zckj.abstractdemo.People#isMarry(com.zckj.abstractdemo.People)
	 */
	@Override
	protected boolean isMarry(People people) {
		if (this.sex.equals(people.sex)){
			System.out.println(this.name+"和"+people.name+"你们两个是同性恋，不可以结婚！！");
			return false;
		}else if ((!this.isAge()) || (!people.isAge())) {
			System.out.println(this.name+"和"+people.name+"你们两个其中一个年龄太小，不可以结婚！！");
			return false;
		}else if ((this.people!=null) || (people.people!=null)){
			System.out.println(this.name+"和"+people.name+"你们两个其中一个已经结婚，不可以结婚！！");
			return false;
		}
		//可以结婚
		System.out.println(this.name+"和"+people.name+"恭喜 恭喜！！");
		this.people=people;
		people.people=this;
		
		return true;
	}

	
	
	/**
	 * 
	 * <p>Title: isAge</p> 
	 * <p>Description:否满足结婚的年龄 </p> 
	 * @return 
	 * @see com.zckj.abstractdemo.People#isAge()
	 */
	@Override
	protected boolean isAge() {
		if (sex.equals("男") && (age>=22)){
			return true;
		}else if (sex.equals("女") && (age>=18)){
			return true;
		}else {
			return false;
		}
	}

}
