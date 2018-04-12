/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月9日 下午5:55:31 
 */
package com.lzh.io;

import java.io.File;

/**
 * @ClassName: FileContents
 * @Description: 输出一个目录下的所有目录和文件，并打印名字。
 * @author 李卓宏
 * @date: 2018年4月9日 下午5:55:31 
 */
public class FileContents {
	
	public static void main(String[] args) {
		File file =new File("d:/feiq");
		if (file.exists()) {
			show(file,0);
		}
		
	}

	/**@Title: show 
	 * @Description: 输出目录
	 * @param file
	 * @return void
	 */
	private static void show(File file,int k) {
		//设置分级
		String  str="|";
		for (int i = 0; i < k; i++) {
			str=str+"--";
		}
		//如果是目录递归
		if (file.isDirectory()) {
			System.out.println(str+file.getName());
			File[] files=file.listFiles();
			for (int i = 0; i < files.length; i++) {
				show(files[i], k+1);
			}
			
		}
		//如果是文件，就输出
		if (file.isFile()) {
			System.out.println(str+file.getName());
			
		}
	}


}
