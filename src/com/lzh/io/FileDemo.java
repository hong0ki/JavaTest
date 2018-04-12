/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月9日 下午3:41:29 
 */
package com.lzh.io;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: FileDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月9日 下午3:41:29 
 */
public class FileDemo {

	/**@Title: main 
	 * @Description: file测试
	 * @Params @param args
	 * @return void
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File file =new File("d:/aa/bb");
		//目录是否存在，不存在就创建
		if (!file.exists()) {
			file.mkdirs();
		}
		System.out.println(file.exists());
		//创建文件
		createFile(file,"aa.java");
		createFile(file,"bb.java");
		//打印目录普通方法
		System.out.println(file.getParent());
		System.out.println("--"+file.getName());
		String[] str=file.list();
		for (int i = 0; i < str.length; i++) {
			System.out.println("----"+str[i]);
		}

	}
	/**
	 * @Title: createFile 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param file
	 * @param string
	 * @throws IOException
	 * @return void
	 */
	private static void createFile(File file,String string) throws IOException {
		File file2=new File(file,string);
		if (!file2.exists()) {
			file2.createNewFile();
//			System.out.println("----");
//			System.out.println(file2.toString());
		}
	}

}
