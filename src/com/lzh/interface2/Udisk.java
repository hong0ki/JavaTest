/**
 * @Package: com.lzh.interface2
 * @author: THINK 
 * @date: 2018年4月2日 下午1:28:54 
 */
package com.lzh.interface2;

/**
 * @ClassName: Udisk
 * @Description: TODO
 * @author THINK
 * @date: 2018年4月2日 下午1:28:54 
 */
public class Udisk implements Usb {

	/* Title: connect
	 * @Description: TODO
	 * @see com.lzh.interface2.Usb#connect()
	 */
	@Override
	public void connect() {
		System.out.println("U盘工作---");
		
	}

}
