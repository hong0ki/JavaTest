/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月16日 上午11:11:07 
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
import java.net.Socket;
import java.util.Scanner;

import com.lzh.string.StartBall;

/**
 * @ClassName: Client
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月16日 上午11:11:07
 */
public class Client {
	private String host;
	private int port;

	/**
	 * 构造方法
	 */
	public Client() {
	}

	public Client(String host, int port) {
		super();
		this.host = host;
		this.port = port;
	}

	public void start() {
		Socket socket = null;
		DataInputStream bReader = null;
		DataOutputStream bWriter = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(host, port);
			bReader = new DataInputStream(socket.getInputStream());
			bWriter = new DataOutputStream(socket.getOutputStream());
			while (true) {
				// 发送信息
				System.out.println("客户端：");
				
				String message = sc.next();
				bWriter.writeUTF(message);
				bWriter.flush();
				//bWriter.close();
				
				System.out.println(TimeUtil.getTime()+"服务端:" + bReader.readUTF());
//				if (bReader.readUTF().equals("88")) {
//					System.out.println("通话结束");
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
			if (bWriter != null) {
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
		Client client = new Client("localhost", 8088);
		client.start();
	}
}
