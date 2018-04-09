package com.lzh.collection;

import java.io.Serializable;
/**
 * 
 * @ClassName: ProductBean
 * @Description: 产品实体类
 * @author 李卓宏
 * @date: 2018年4月3日 下午5:30:52
 * 1、属性
	 * 2、有参无参构造函数
	 * 3、get、set方法
	 * 4、tostring方法
	 * 5、序列化
 */
public class ProductBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String productName;
	private float price;
	
	public ProductBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ProductBean(int id, String productName, float price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", productName=" +
						productName + ", price=" + price + "]";
	}


}
