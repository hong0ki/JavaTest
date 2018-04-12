/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月11日 上午9:27:20 
 */
package com.lzh.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;

/**
 * @ClassName: BufferedDemo
 * @Description: 缓冲流
 * @author 李卓宏
 * @date: 2018年4月11日 上午9:27:20
 */
public class BufferedDemo {
	// jd
	public static void main(String[] args) {
		//readFile();
		//writeFile();
		//copyFile(new File("d:/aa/test2.txt"), new File("d:/aa/test3.txt"));
		//readFileByByte();
		long start=System.currentTimeMillis();
		copyFileByBuffer(new File("d:/aa/bb/we.wmv"), new File("d:/aa/bb/weo.wmv"));
		System.out.println(System.currentTimeMillis()-start);
	}

	/**@Title: copyFileByBuffer 
	 * @Description: 字节缓冲流复制文件
	 * @param file
	 * @param file2
	 * @return void
	 */
	private static void copyFileByBuffer(File file, File tofile) {
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		try {
			//构建通道
			bis =new BufferedInputStream(new FileInputStream(file));
			bos=new BufferedOutputStream(new FileOutputStream(tofile));
			//复制文件
			byte[] datas=new byte[1024];
			int tem=0;
			while ((tem=bis.read(datas))!=-1) {
				bos.write(datas);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {//关闭资源
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if (bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
	}

	/**@Title: readFileByByte 
	 * @Description: 缓冲字节流读文件
	 * @return void
	 */
	private static void readFileByByte() {
		File file=new File("d:/aa/test.txt");
		BufferedInputStream bis=null;
		try {
			bis=new BufferedInputStream(new FileInputStream(file));
			byte[] datas=new byte[1024];
			int len=0;
			while ((len=bis.read(datas))!=-1) {
				System.out.println(new String(datas));
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	/**@Title: copyFile 
	 * @Description: 缓冲流复制文件
	 * @return void
	 */
	private static void copyFile(File fromFile,File toFile) {
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			//构建通道
			br=new BufferedReader(new FileReader(fromFile));
			bw=new BufferedWriter(new FileWriter(toFile));
			//复制文件
			String str="";
			while ((str=br.readLine())!=null) {
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {//关闭资源
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if (bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

	/**@Title: writeFile 
	 * @Description: 缓冲流写文件
	 * @return void
	 */
	private static void writeFile() {
		File file=new File("d:/aa/test2.txt");
		BufferedWriter bw=null;
		try {
			bw =new BufferedWriter(new FileWriter(file));
			bw.write("离开的减肥了");
			bw.newLine();
			bw.write("多了几分两个号上来了大家");
			bw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if (bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

	private static void readFile() {
		File file=new File("d:/aa/test.txt");
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(file));
			//System.out.println(br.readLine());
			String str="";
			while ((str=br.readLine())!=null) {
				System.out.println(str);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
}
