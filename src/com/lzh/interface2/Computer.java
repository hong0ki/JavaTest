/**
 * @Package: com.lzh.interface2
 * @author: THINK 
 * @date: 2018年4月2日 下午1:25:20 
 */
package com.lzh.interface2;

import javax.sound.midi.Soundbank;

/**
 * @ClassName: Computer
 * @Description: TODO
 * @author THINK
 * @date: 2018年4月2日 下午1:25:20 
 */
public class Computer {
	
	private Usb usb;
	
	/**
	 * 构造方法
	 */
	public Computer() {
	}
	public Computer(Usb usb ) {
		this.usb=usb;
	}
	public void work(Usb usb) {
		usb.connect();
	}

}
