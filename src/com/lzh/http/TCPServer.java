/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月16日 上午9:36:59 
 */
package com.lzh.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: TCPServer
 * @Description: 服务端
 * @author 李卓宏
 * @date: 2018年4月16日 上午9:36:59 
 */
public class TCPServer {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		ServerSocket serverSocket=null;
		Socket socket=null;
		BufferedReader bReader=null;
		PrintWriter pWriter=null;
		
		try {
			serverSocket=new ServerSocket(8190);
			socket=serverSocket.accept();
			System.out.println("客户端连接成功");
			System.out.println("客户端地址："+socket.getInetAddress().getLocalHost());
			
			bReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("客户端说："+bReader.readLine());
			
			pWriter=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			pWriter.write("客户端你好");
			pWriter.flush();
			pWriter.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if (bReader!=null) {
				try {
					bReader.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if (socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}

}
