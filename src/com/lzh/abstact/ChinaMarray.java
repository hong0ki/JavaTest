/**
 * @Package: com.lzh.abstact
 * @author: THINK 
 * @date: 2018年3月28日 下午2:57:00 
 */
package com.lzh.abstact;

/**
 * @ClassName: ChinaMarray
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 下午2:57:00 
 */
public class ChinaMarray extends Marray {

	
	@Override
	protected boolean sex(People people, People people2) {
		if (people.getSex().equals(people2.getSex())) {
			return false;
		}
		return true;
		
	}

	
	@Override
	protected boolean age(People people, People people2) {
		if (sex(people, people2)) {
			int p1=0;
			int p2=1;
			if (people.getSex().equals("男")) {
				if (people.getAge()>=22) {
					p1=2;
				}
			}
			if (people.getSex().equals("女")) {
				if (people.getAge()>=18) {
					p2=2;
				}
			}
			if (p1==p2) {
				return true;
			}
			return false;
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
