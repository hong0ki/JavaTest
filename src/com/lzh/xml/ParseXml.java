/**
 * @Package: com.lzh.xml
 * @author: 李卓宏
 * @date: 2018年4月16日 下午5:22:53 
 */
package com.lzh.xml;

import java.util.ArrayList;
import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @ClassName: ParseXml
 * @Description: 解析xml
 * @author 李卓宏
 * @date: 2018年4月16日 下午5:22:53 
 */
public class ParseXml {
	
	/**
	 * 构造方法
	 */
	public ParseXml() {
	}
	/**
	 * @Title: parse 
	 * @Description: 将xml转document
	 * @return
	 * @throws DocumentException
	 * @return Document
	 */
	public static Document parse() throws DocumentException {
		//读取xml文件
		SAXReader reader=new SAXReader();
		Document document=reader.read("products.xml");
		return document;
	}
	/**
	 * @Title: xmlToList 
	 * @Description: 将document转arraylist
	 * @return
	 * @throws DocumentException
	 * @return ArrayList<ProductBean>
	 */
	public ArrayList<ProductBean> xmlToList() throws DocumentException {
		
		Document document=parse();
		//获取根节点
		Element products=document.getRootElement();
		//创建数组
		ArrayList<ProductBean> productBeans=new ArrayList<>();
		//遍历所有节点
		for (Iterator<Element> it=products.elementIterator(); it.hasNext();) {
			
			Element element=it.next();
			//获取参数
			int id=Integer.parseInt(element.attributeValue("id"));
			String name=element.elementText("productName");
			Float price=Float.parseFloat(element.elementText("price"));
			//添加到数组中
			productBeans.add(new ProductBean(id,name,price));
		}
		return productBeans;
	}
	

}
