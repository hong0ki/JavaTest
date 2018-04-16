/**
 * @Package: com.lzh.http
 * @author: 李卓宏
 * @date: 2018年4月16日 下午2:29:22 
 */
package com.lzh.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName: TimeUtil
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月16日 下午2:29:22 
 */
public class TimeUtil {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return 
	 * @return void
	 */
	public static String getTime() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		return dateFormat.format(new Date());
	}

}
