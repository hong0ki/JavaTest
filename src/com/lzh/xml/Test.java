/**
 * @Package: com.lzh.xml
 * @author: 李卓宏
 * @date: 2018年4月17日 上午8:53:18 
 */
package com.lzh.xml;

import java.io.IOException;
import java.util.ArrayList;

import org.dom4j.DocumentException;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月17日 上午8:53:18
 */
public class Test {
	public static void main(String[] args) throws IOException, DocumentException {
		//创建xml文本
		CreateXML cXml = new CreateXML();
		cXml.createXml();
		System.out.println("------------");
		//解析xml文本
		ParseXml pXml=new ParseXml();
		ArrayList<ProductBean> pro=pXml.xmlToList();
		//循环输出list里的内容
		for (ProductBean productBean : pro) {
			System.out.println(productBean);
		}
	}
}
