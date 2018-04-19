/**
 * @Package: com.lzh.json
 * @author: 李卓宏
 * @date: 2018年4月17日 下午4:07:14 
 */
package com.lzh.json;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;



/**
 * @ClassName: Test
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月17日 下午4:07:14 
 */
public class Test extends BaseManager {

	public static void main(String[] args) {
		String url="http://192.168.16.247:8080/TestUrlServer/LoginServlet";
		Map<String, String> parms=new HashMap<>();
		parms.put("username", "admin");
		parms.put("password", "123456");
		InputStream inputStream=getInputStream(url, "POST", parms);
		System.out.println(inputStream);
	}

	
}
