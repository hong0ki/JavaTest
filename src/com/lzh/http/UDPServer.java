/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月16日 下午2:24:22 
 */
package com.lzh.http;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName: UDPServer
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月16日 下午2:24:22 
 */
public class UDPServer {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		try {
			DatagramSocket datagramSocket=new DatagramSocket(8031);
			byte[] buf=new byte[1024];
			DatagramPacket datagramPacket=new DatagramPacket(buf, buf.length);
			datagramSocket.receive(datagramPacket);
			System.out.println(new String(buf));
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
