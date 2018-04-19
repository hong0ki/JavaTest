/**
 * @Package: com.lzh.xml
 * @author: 李卓宏
 * @date: 2018年4月16日 下午4:10:29 
 */
package com.lzh.xml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @ClassName: CreateXML
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月16日 下午4:10:29
 */
public class CreateXML {
	static ArrayList<ProductBean> productBeans;

	/**
	 * 构造方法
	 */
	public CreateXML() {
		productBeans = new ArrayList<>();
		productBeans.add(new ProductBean(12, "西服", 43));
		productBeans.add(new ProductBean(13, "椅子", 42));
		productBeans.add(new ProductBean(14, "大床", 13));
		productBeans.add(new ProductBean(15, "窗帘", 53));
		productBeans.add(new ProductBean(16, "洗衣机", 190));
		productBeans.add(new ProductBean(17, "毯子", 37));
		productBeans.add(new ProductBean(18, "衣服", 45));
		productBeans.add(new ProductBean(19, "裤子", 84));
		productBeans.add(new ProductBean(20, "毛巾", 44));
		productBeans.add(new ProductBean(21, "鞋子", 14));
	}

	/**
	 * @Title: createDocument
	 * @Description: 创建文本
	 * @return
	 * @return Document
	 */
	public static Document createDocument() {

		Document document = DocumentHelper.createDocument();
		Element products = document.addElement("products");
		//循环添加元素
		for (int i = 0; i < productBeans.size(); i++) {
			Element product = products.addElement("product");
			product.addAttribute("id", productBeans.get(i).getId() + "");
			product.addElement("productName").addText(productBeans.get(i).getProductName());
			product.addElement("price").addText(productBeans.get(i).getPrice() + "");
		}

		return document;

	}

	/**
	 * @Title: createXml
	 * @Description: 文本转xml
	 * @throws IOException
	 * @return void
	 */
	public void createXml() throws IOException {
		//输出带格式的xml文本
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter("products.xml"), format);
		writer.write(createDocument());
		writer.close();
	}

	
}
