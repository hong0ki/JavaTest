package com.lzh.product2;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * 
 * @ClassName: ProductManager
 * @Description: HashMap管理商品
 * @author 李卓宏
 * @date: 2018年4月3日 下午5:35:39
 */
public class ProductManager  {
	
	
	private HashMap<Object, ProductBean> productBeans;
	/**
	 * 
	 * 构造方法
	 */
	public ProductManager() {
		productBeans= new HashMap<>();
		//初始化5个产品
		productBeans.put(0,new ProductBean(0, "是咯", 67));
		productBeans.put(1,new ProductBean(1, "kd", 67));
		productBeans.put(2,new ProductBean(2, "贷款", 637));
		productBeans.put(3,new ProductBean(3, "来了", 67));
		productBeans.put(4,new ProductBean(4, "来等等", 67));
		
	}

	/**
	 * @Title: addProduct 
	 * @Description: 添加商品
	 * @param productBean
	 * @return
	 */
	public boolean addProduct(ProductBean productBean)  {
		productBeans.put(productBean.getId(),productBean);
		if (productBeans.put(productBean.getId(),productBean)==null) {
			return false;
		}
		return true;
	}
	/**
	 * 根据id判定是否存在
	 */
	public boolean isExistId(int id) {
		
		return productBeans.containsKey(id);
	}
	/**
	 * @Title: deleteProduct 
	 * @Description: 删除商品
	 * @param id
	 * @return
	 */
	public boolean deleteProduct(int id)  {
		if (isExistId(id)) {
			productBeans.remove(id);
		}
		return false;
	}
	/**
	 * @Title: updateProduct 
	 * @Description: 修改商品
	 * @param productBean
	 * @return
	 */
	public boolean updateProduct(ProductBean productBean) {
		if (isExistId(productBean.getId())) {
			productBeans.replace(productBean.getId(), productBean);
			return true;
		}
		return false;
	}
	/**
	 * @Title: queryById 
	 * @Description: 精确查询
	 * @param id
	 * @return
	 */
	public HashMap<Object, ProductBean> queryById(int id) {
		HashMap<Object, ProductBean> pr1=new HashMap<>();
		if (isExistId(id)) {
			pr1.put(id,productBeans.get(id));
		}
		return pr1;
	}
	/**
	 * @Title: queryByName 
	 * @Description: 模糊查询
	 * @param name
	 * @return
	 */
	public HashMap<Object, ProductBean> queryByName(String name)  {
		HashMap<Object, ProductBean> list=new HashMap<Object, ProductBean>();
		for (Object key : productBeans.keySet()) {
			if (productBeans.get(key).getProductName().toString().indexOf(name)>=0) {
				list.put(productBeans.get(key).getId(),productBeans.get(key));
			}
		}
		
		return list;
		
	}
	/**
	 * @Title: queryAll 
	 * @Description: 查询所有
	 * @return
	 */
	public HashMap<Object, ProductBean> queryAll() {
		
		return productBeans;		
	}


}
