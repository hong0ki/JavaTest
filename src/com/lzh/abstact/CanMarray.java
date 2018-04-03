/**
 * @Package: com.lzh.abstact
 * @author: THINK 
 * @date: 2018年3月28日 下午3:26:32 
 */
package com.lzh.abstact;

/**
 * @ClassName: CanMarray
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 下午3:26:32 
 */
public class CanMarray {
	
	ChinaMarray chinaMarray;
	UsaMarray usaMarray;
	
	/**
	 * 
	 */
	public CanMarray() {
		chinaMarray=new ChinaMarray();
		usaMarray=new UsaMarray();
	}
	
	public void cMarray(People people,People people2) {
		if (chinaMarray.sex(people, people2)&&chinaMarray.age(people, people2)&&chinaMarray.isMarray(people, people2)) {
			System.out.println("可以结婚");
		}
		else {
			System.out.println("不能结婚");
		}
	}
	
	public void uMarray(People people,People people2) {
		if (usaMarray.sex(people, people2)&&usaMarray.age(people, people2)&&usaMarray.isMarray(people, people2)) {
			System.out.println("可以结婚");
		}
		else {
			System.out.println("不能结婚");
		}
	}

}
