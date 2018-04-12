/**
 * @Package: com.lzh.io
 * @author: 李卓宏
 * @date: 2018年4月11日 上午11:52:57 
 */
package com.lzh.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: CountTimes
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月11日 上午11:52:57
 */
public class CountTimes {
	public static void main(String[] args) {
		File file=new File("d:/aa/bb/aa.txt");
		char[] word= {'a','b','c'};
		for (int i = 0; i < word.length; i++) {
			Map<Character, Integer> map= countTimes(word[i],file);
			for (Character c : map.keySet()) {
				System.out.println(c+"出现次数为： "+map.get(c));
			}
		}
		
	}

	/**@Title: countTimes 
	 * @Description: 统计出现次数
	 * @param c
	 * @param file 
	 * @return void
	 */
	private static Map<Character, Integer> countTimes(char c, File file) {
		Map<Character, Integer> datas= new HashMap<Character, Integer>();
		BufferedInputStream bis=null;
		try {
			bis=new BufferedInputStream(new FileInputStream(file));
			int tmp=0;
			while ((tmp=bis.read())!=-1) {
				if (c==(char)tmp) {
					datas.put(c, datas.getOrDefault(c, 0)+1);
				}
			}
			return datas;
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	
		return null;
	}
}
