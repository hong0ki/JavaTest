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
			show(file,"--");
		}
		
	}

	/**@Title: show 
	 * @Description: 输出目录
	 * @param file
	 * @return void
	 */
	private static void show(File file,String str) {
		File[] files=file.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if (files[i].isDirectory()) {
				System.out.println(str+"--"+files[i].getName());
				//str+=str;
				show(files[i],str);
			}else {
				System.out.println(str+"----"+files[i].getName());
			}
			
		}
	}


}
