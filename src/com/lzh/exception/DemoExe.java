/**
 * @Package: com.lzh.exception
 * @author: THINK 
 * @date: 2018年3月30日 下午4:13:52 
 */
package com.lzh.exception;

import java.io.IOException;

/**
 * @ClassName: DemoExe
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月30日 下午4:13:52 
 */
public class DemoExe {
	
	public static void main(String[] args) throws IOException {
		DemoExe demoExe=new DemoExe();
		demoExe.run();
		
	}
	
	public void run() throws IOException {
		Runtime runtime=Runtime.getRuntime();
		Process[] process=new Process[10];
		for (int i = 0; i < process.length; i++) {
			process[i]=runtime.exec("D:\\QQ\\Bin\\QQ.exe");
		}
		
	}

}
