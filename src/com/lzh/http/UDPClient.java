/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月16日 下午2:19:02 
 */
package com.lzh.http;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @ClassName: UDPClient
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月16日 下午2:19:02 
 */
public class UDPClient {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		try {
			DatagramSocket datagramSocket=new DatagramSocket(8030);
			byte[] buf="肯德基分开连锁店".getBytes();
			DatagramPacket datagramPacket=new DatagramPacket(buf, 0, buf.length, InetAddress.getLocalHost(), 8031);
			datagramSocket.send(datagramPacket);
			System.out.println("发送完成");
			
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
