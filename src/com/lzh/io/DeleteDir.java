/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月11日 下午4:01:11 
 */
package com.lzh.io;

import java.io.File;

/**
 * @ClassName: DeleteDir
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月11日 下午4:01:11 
 */
public class DeleteDir {
	static int d=0;
	public static void main(String[] args) {
		File file=new File("d:/aa/bb/cc");
		for (int i = 0; i < 10; i++) {
			
		}
		delete(file);
	}

	/**@Title: delete 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param file
	 * @return void
	 */
	private static void delete(File file) {
		if (file.isDirectory()) {
//			file.delete();
//			System.out.println(file.delete());
			File[] files=file.listFiles();
			System.out.println(d);
			d++;
			
			for (int i = 0; i < files.length; i++) {
				files[0].delete();
				delete(files[i]);
			}
			
			
		}
		
	}

}
