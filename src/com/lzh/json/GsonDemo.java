/**
 * @Package: com.lzh.json
 * @author: 李卓宏
 * @date: 2018年4月17日 上午10:47:15 
 */
package com.lzh.json;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.lzh.xml.ProductBean;

/**
 * @ClassName: JsonDemo
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月17日 上午10:47:15 
 */
public class GsonDemo {

	/**@Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		Gson gson=new Gson();
//		ArrayList<String> datas=new ArrayList<>();
//		datas.add("dkduhf");
//		datas.add("dk123d");
//		datas.add("dk1214d");
//		datas.add("ddskkd");
//		datas.add("dkaakd");
//		String js=gson.toJson(datas);
//		System.out.println(gson.fromJson(js, ArrayList.class));
		
		ArrayList<ProductBean> list=new ArrayList<>();
		list.add(new ProductBean(12, "西服", 43));
		list.add(new ProductBean(13, "西服", 43));
		list.add(new ProductBean(14, "西服", 43));
		list.add(new ProductBean(15, "西服", 43));
		java.lang.reflect.Type type =

		           new com.google.gson.reflect.TypeToken<ArrayList<ProductBean>>(){}.getType();

		String sl=gson.toJson(list,type);
		
		System.out.println(sl);
		System.out.println(gson.toJson(list));
		ArrayList<ProductBean> list2=gson.fromJson(sl, type);
		System.out.println(list2);
		
//		System.out.println(list);
		
		
		
		

	}

}
