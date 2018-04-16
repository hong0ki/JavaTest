/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月16日 上午11:11:19 
 */
package com.lzh.http;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ClassName: Server
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月16日 上午11:11:19
 */
public class Server {
	private int prot;

	/**
	 * 构造方法
	 */
	public Server() {
	}

	public Server(int prot) {
		super();
		this.prot = prot;
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		DataInputStream bReader = null;
		DataOutputStream bWriter = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(prot);
			socket = serverSocket.accept();
			System.out.println("连接成功");
			bReader = new DataInputStream(socket.getInputStream());
			bWriter = new DataOutputStream(socket.getOutputStream());

			while (true) {
				// 接受信息
				
				System.out.println(TimeUtil.getTime()+"客户端:" + bReader.readUTF());
				System.out.println("服务器：");
				String message = sc.next();
				bWriter.writeUTF(message);
				bWriter.flush();
				//bWriter.close();
//				if (bReader.readUTF().equals("88")) {
//					//System.out.println("通话结束");
//					break;
//				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (bReader != null) {
				try {
					bReader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			 if (bWriter!=null) {
			 try {
			 bWriter.close();
			 } catch (IOException e) {
			
			 e.printStackTrace();
			 }
			 }
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Server server = new Server(8088);
		server.start();
	}
}
