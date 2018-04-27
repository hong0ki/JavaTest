/**
 * @Package: com.lzh.test
 * @author: 李卓宏
 * @date: 2018年4月26日 下午6:07:43 
 */
package com.lzh.jdbc;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Student
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月26日 下午6:07:43 
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int sno;        
	private String sname;   
	private Date sage  ;    
	private String ssex ;
	
	/**
	 * 构造方法
	 */
	public Student() {
	}

	public Student(int sno, String sname, Date sage, String ssex) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getSage() {
		return sage;
	}

	public void setSage(Date sage) {
		this.sage = sage;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sage=" + sage + ", ssex=" + ssex + "]";
	}
	
	

}
