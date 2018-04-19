/**
 * @Package: com.lzh.json
 * @author: 李卓宏
 * @date: 2018年4月17日 下午12:13:20 
 */
package com.lzh.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzh.xml.ProductBean;

/**
 * @ClassName: Jackson
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月17日 下午12:13:20 
 */
public class Jackson {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		ProductBean productBean=new ProductBean(23,"kd",28);
		ObjectMapper oMapper=new ObjectMapper();
//		try {
//			oMapper.writeValue(System.out, productBean);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		ArrayList<ProductBean> list=new ArrayList<>();
		list.add(new ProductBean(12, "西服", 43));
		list.add(new ProductBean(13, "西服", 43));
		list.add(new ProductBean(14, "西服", 43));
		list.add(new ProductBean(15, "西服", 43));
		try {
			oMapper.writeValue(new File("p.txt"), list);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		JavaType type=oMapper.getTypeFactory().constructCollectionType(ArrayList.class, ProductBean.class);
//		try {
//			ArrayList<ProductBean> list2=oMapper.readValue(new File("p.txt"), new TypeReference<ArrayList<ProductBean>>() {
//			});
//			System.out.println(list2);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
				try {
					ArrayList<ProductBean> list2=oMapper.readValue(new File("p.txt"), type);
					System.out.println(list2);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	}

}
