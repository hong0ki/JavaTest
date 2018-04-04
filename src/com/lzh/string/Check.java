/**
 * @Package: com.lzh.string
 * @author: THINK 
 * @date: 2018年4月2日 下午4:28:52 
 */
package com.lzh.string;

/**
 * @ClassName: Check
 * @Description: 验证邮箱
 * @author THINK
 * @date: 2018年4月2日 下午4:28:52 
 */
public class Check {
	
	
	/**
	 * 构造方法
	 */
	public Check() {
	}
	/**
	 * 构造方法@param str
	 */
	public Check(String str) {
	}

	public boolean checkEmail(String str) {
		if (str.contains("@")&&str.contains(".")) {
			if (str.indexOf("@")<str.indexOf(".")) {
				return true;
			}
		}
		return false;
		
	}

}
