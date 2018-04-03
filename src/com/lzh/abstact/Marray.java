/**
 * @Package: com.lzh.abstact
 * @author: THINK 
 * @date: 2018年3月28日 下午2:50:03 
 */
package com.lzh.abstact;

/**
 * @ClassName: Marray
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 下午2:50:03 
 */
public abstract class Marray {
	protected People people;
	
	protected abstract boolean sex(People people,People people2 );
	
	protected abstract boolean age(People people,People people2);
	
	protected abstract boolean isMarray(People people,People people2);

}
