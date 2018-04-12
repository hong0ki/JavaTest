/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月10日 下午12:14:59 
 */
package com.lzh.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @ClassName: CharStreamDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月10日 下午12:14:59 
 */
public class CharStreamDemo {
	
	public static void main(String[] args) {
		File file=new File("d:/aa/bb.txt");
		//createFile(file);
		//readFile(file);
		copyFile(new File("d:/aa/bb.txt"),new File("d:/aa/cc.txt"));
	}

	/**@Title: copyFile 
	 * @Description: 复制文件
	 * @return void
	 */
	private static void copyFile(File fromFile,File toFile) {
		Reader reader=null;
		Writer writer=null;
		try {
			reader=new FileReader(fromFile);
			writer=new FileWriter(toFile);
			char[] datas=new char[10];
			while(reader.read(datas)!=-1) {
				writer.write(datas);
			}
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	/**@Title: readFile 
	 * @Description: 读取文件
	 * @param file
	 * @return void
	 */
	private static void readFile(File file) {
		Reader reader=null;
		try {
			reader=new FileReader(file);
			char[] datas=new char[2];
			while (reader.read(datas)!=-1) {
				
				System.out.print(datas);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

	/**@param file 
	 * @Title: createFile 
	 * @Description: 创建文件
	 * @return void
	 */
	private static void createFile(File file) {
		Writer writer=null;
		try {
			writer=new FileWriter(file,true);
			writer.write("师的疯了了深刻的发挥---");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
