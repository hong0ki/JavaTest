/**
 * @Package: com.lzh.abstact
 * @author: THINK 
 * @date: 2018年3月28日 下午3:21:39 
 */
package com.lzh.abstact;

/**
 * @ClassName: UsaMarray
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 下午3:21:39 
 */
public class UsaMarray extends Marray {

	
	@Override
	protected boolean sex(People people, People people2) {
		
		return true;
	}

	
	@Override
	protected boolean age(People people, People people2) {
		if (people.getAge()>=18&&people.getAge()>=18) {
			return true;
		}
		return false;
	}

	
	@Override
	protected boolean isMarray(People people, People people2) {
		if (people.isMarray()==false&&people2.isMarray()==false) {
			return true;
		}
		return false;
	}

}
