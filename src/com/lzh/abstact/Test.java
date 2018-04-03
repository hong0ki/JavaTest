/**
 * @Package: com.lzh.abstact
 * @author: THINK 
 * @date: 2018年3月28日 下午3:25:18 
 */
package com.lzh.abstact;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月28日 下午3:25:18 
 */
public class Test {
	
	public static void main(String[] args) {
		//名字，国家，年龄，性别，是否结婚
		People p1=new People("小白","美国",22,"男",false);
		People p2=new People("小h","美国",22,"男",false);
		
		CanMarray canMarray=new CanMarray();
		canMarray.cMarray(p1,p2);
	}

}
