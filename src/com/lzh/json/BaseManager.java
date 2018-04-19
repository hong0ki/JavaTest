/**
 * @Package: com.lzh.json
 * @author: 李卓宏
 * @date: 2018年4月17日 下午3:01:52 
 */
package com.lzh.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName: BaseManager
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月17日 下午3:01:52 
 */
public class BaseManager {
	public static InputStream getInputStream(String url2,String type,Map<String , String> parms) {
		if (url2 ==null) {
			return null;
		}
		URL url=null;
		OutputStream outputStream=null;
		HttpURLConnection httpURLConnection=null;
		try {
			//url=new URL("http://192.168.16.247:8080/TestUrlServer/LoginServlet");
			url=new URL(url2);
		    httpURLConnection=(HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod(type);
			if (parms!=null) {
				httpURLConnection.setDoOutput(true);
				outputStream=httpURLConnection.getOutputStream();
				
				StringBuffer strs=new StringBuffer();
				Iterator<String > iterator=parms.keySet().iterator();
				while (iterator.hasNext()) {
					String key = iterator.next();
					String value=parms.get(key);
					strs.append(key).append("=").append(value).append("&");
					
				}
				outputStream.write(strs.toString().getBytes());
				outputStream.flush();
			}
			if (httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_OK) {
				return httpURLConnection.getInputStream();
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if(outputStream!=null){
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(httpURLConnection!=null){
				httpURLConnection.disconnect();
			}
		}
		return null;
	}
}
