/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月16日 上午9:35:15 
 */
package com.lzh.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @ClassName: TCPClient
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月16日 上午9:35:15 
 */
public class TCPClient {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Socket s=null;
		PrintWriter pWriter=null;
		BufferedReader bReader=null;
		try {
			s=new Socket("localhost", 8190);
			
		    pWriter=new PrintWriter(s.getOutputStream());
			pWriter.write("服务器你好");
			pWriter.flush();
			pWriter.close();
			System.out.println(s.isClosed());
			System.out.println(s.isConnected());
			bReader=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("服务端说："+bReader.readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if (pWriter!=null) {
				pWriter.close();
			}
			if (bReader!=null) {
				try {
					bReader.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if (s!=null) {
				try {
					s.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	
		
	}

}
