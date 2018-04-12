/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月10日 上午10:14:01 
 */
package com.lzh.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @ClassName: OutputStreamDemo
 * @Description: OutputStream测试类
 * @author 李卓宏
 * @date: 2018年4月10日 上午10:14:01 
 */
public class OutputStreamDemo {

	/**@Title: main 
	 * @Description: 创建文件
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		File file=new File("d:/test2.txt");
		createFile(file);
		readFile(file);
		copyFile(new File("d:/aa/pic.jpg"), new File("d:/aa/pic2.jpg"));

	}

	/**@Title: readFile 
	 * @Description: 读取文件
	 * @param file
	 * @return void
	 */
	private static void readFile(File file) {
		InputStream inputStream=null;
		try {
			 inputStream=new FileInputStream(file);
			 //System.out.println(inputStream.read());
			 byte[] datas=new byte[1024];
//			 inputStream.read(datas);
//			 System.out.println(new String(datas));
			 while (inputStream.read(datas)!=-1) {
				 System.out.println(new String(datas));
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	/**@Title: createFile 
	 * @Description: 创建文件
	 * @param file
	 * @return void
	 */
	private static void createFile(File file) {
		OutputStream outputStream=null;
		try {
			String str="你好————————";
			outputStream=new FileOutputStream(file,true);
			outputStream.write(str.getBytes());
			outputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @Title: copyPicture 
	 * @Description: 复制图片
	 * @param file
	 * @param file2
	 * @return void
	 */
	private static void copyFile(File file, File file2) {
		InputStream inputStream=null;
		OutputStream outputStream=null;
		try {
			
			inputStream=new FileInputStream(file);
			 outputStream=new FileOutputStream(file2);
			
			byte[] datas=new byte[1024];
			while (inputStream.read(datas)!=-1) {
				outputStream.write(datas);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (outputStream!=null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
