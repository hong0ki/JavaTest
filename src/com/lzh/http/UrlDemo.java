/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月13日 下午4:47:29 
 */
package com.lzh.http;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName: UrlDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月13日 下午4:47:29 
 */
public class UrlDemo {
	public static void main(String[] args) throws IOException {
		
		URL url=new URL("http://www.runoob.com/wp-content/uploads/2015/07/Vx4_Psj1.png");
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		File file=new File("d:/aa/bb/mm.png");
		
		HttpURLConnection hc=(HttpURLConnection) url.openConnection();
		if (hc.getResponseCode()==HttpURLConnection.HTTP_OK) {
			bis=new BufferedInputStream(hc.getInputStream());
			bos=new BufferedOutputStream(new FileOutputStream(file));
			byte[] datas=new byte[1024];
			while ((bis.read(datas))!=-1) {
				bos.write(datas,0,datas.length);
			}
			bos.flush();
			bis.close();
			bos.close();
		}
	}
}
