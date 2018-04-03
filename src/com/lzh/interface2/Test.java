/**
 * @Package: com.lzh.interface2
 * @author: THINK 
 * @date: 2018年4月2日 下午1:29:36 
 */
package com.lzh.interface2;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author THINK
 * @date: 2018年4月2日 下午1:29:36 
 */
public class Test {
	
	public static void main(String[] args) {
		Usb usb=new Print();
		Computer computer=new Computer(usb);
		computer.work(usb);
	}

}
