/**
 * @Package: com.lzh.interface2
 * @author: THINK 
 * @date: 2018年4月2日 下午1:27:41 
 */
package com.lzh.interface2;

/**
 * @ClassName: Print
 * @Description: TODO
 * @author THINK
 * @date: 2018年4月2日 下午1:27:41 
 */
public class Print implements Usb {

	/* Title: connect
	 * @Description: TODO
	 * @see com.lzh.interface2.Usb#connect()
	 */
	@Override
	public void connect() {
		System.out.println("打印机工作----");
		
	}
	

}
