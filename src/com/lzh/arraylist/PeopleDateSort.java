/**
 * @Package: com.lzh.arraylist
 * @author: 李卓宏
 * @date: 2018年4月8日 下午4:02:06 
 */
package com.lzh.arraylist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * @ClassName: PeopleDateSort
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月8日 下午4:02:06 
 */
public class PeopleDateSort implements Comparator<PeopleBean>{

	/* Title: compare
	 * @Description: 根据出生日期进行排序
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(PeopleBean o1, PeopleBean o2) {
		
		Date date1=null;
		Date date2=null;
		try {
			date1=stringToDate(o1.getDate());
			date2=stringToDate(o2.getDate());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date1.compareTo(date2);
	}

	/**@Title: stringToDate 
	 * @Description: 字符串转日期
	 * @Params @param date
	 * @Params @return
	 * @return Date
	 * @throws ParseException 
	 */
	private Date stringToDate(String date) throws ParseException {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		return simpleDateFormat.parse(date);
	}

}
