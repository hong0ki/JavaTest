/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月11日 下午3:39:37 
 */
package com.lzh.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: CopyDir
 * @Description: 复制目录
 * @author 李卓宏
 * @date: 2018年4月11日 下午3:39:37 
 */
public class CopyDir {

	/**@Title: main 
	 * @Description: 复制目录
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		copyDir(new File("d:/feiq"),new File("d:/aa/bb/"));
	}

	/**@Title: copyDir 
	 * @Description: 复制目录
	 * @param file
	 * @param file2
	 * @return void
	 */
	private static void copyDir(File fromFile, File toFile) {
		if (!toFile.exists()) {
			toFile.mkdirs();
 		}
		File[] files=fromFile.listFiles();
		for (File file : files) {
			File newFile=new File(toFile, file.getName());
			if (file.isFile()) {
				copyFileByBuffer(file, newFile);
			}else {
				copyDir(file, newFile);
			}
		}
		
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

}
