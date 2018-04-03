/**
 * @Package: com.lzh.exception
 * @author: THINK 
 * @date: 2018年3月30日 下午3:17:15 
 */
package com.lzh.exception;

/**
 * @ClassName: DemoException
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月30日 下午3:17:15 
 */
public class DemoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 构造方法
	 */
	public DemoException() {
	}

	public DemoException(String message) {
		super(message);
		
	}
	void show() {
		
			throw new DemoException("异常----");
	}

	public static void main(String[] args) {
		DemoException exception=new DemoException();
		exception.show();
	}

}
