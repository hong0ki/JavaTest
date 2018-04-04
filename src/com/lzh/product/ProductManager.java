package com.lzh.product;

import java.util.ArrayList;


/**
 * 
 * @ClassName: ProductManager
 * @Description: 管理商品
 * @author 李卓宏
 * @date: 2018年4月3日 下午5:35:39
 */
public class ProductManager  {
	
	private ArrayList<ProductBean> productBeans ;
	/**
	 * 
	 * 构造方法
	 */
	public ProductManager() {
		productBeans= new ArrayList<ProductBean>();
		//初始化5个产品
		productBeans.add(new ProductBean(0, "是咯", 67));
		productBeans.add(new ProductBean(1, "kd", 67));
		productBeans.add(new ProductBean(2, "贷款", 637));
		productBeans.add(new ProductBean(3, "来了", 67));
		productBeans.add(new ProductBean(4, "来等等", 67));
		
	}

	/**
	 * @Title: addProduct 
	 * @Description: 添加商品
	 * @param productBean
	 * @return
	 */
	public boolean addProduct(ProductBean productBean)  {
		
		return productBeans.add(productBean);
	}
	/**
	 * @Title: deleteProduct 
	 * @Description: 删除商品
	 * @param id
	 * @return
	 */
	public boolean deleteProduct(int id)  {
		for(int i=0;i<productBeans.size();i++) {
			if (productBeans.get(i).getId()==id) {
				productBeans.remove(i);
				return true;
			}
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
		if (productBean!=null) {
			for(int i=0;i<productBeans.size();i++) {
			if (productBeans.get(i).getId()==productBean.getId()) {
				productBeans.set(i, productBean);
				return true;
			}
		}
		}
		
		return false;
	}
	/**
	 * @Title: queryById 
	 * @Description: 精确查询
	 * @param id
	 * @return
	 */
	public ArrayList<ProductBean> queryById(int id) {
		ArrayList<ProductBean> pr1=new ArrayList<>();
		for (int i = 0; i < productBeans.size(); i++) {
			if (productBeans.get(i).getId()==id) {
				pr1.add(productBeans.get(i));
			}
		}
		return pr1;
	}
	/**
	 * @Title: queryByName 
	 * @Description: 模糊查询
	 * @param name
	 * @return
	 */
	public ArrayList<ProductBean> queryByName(String name)  {
		ArrayList<ProductBean> list=new ArrayList<>();
		for(int i=0;i<productBeans.size();i++) {
			if(productBeans.get(i).toString().indexOf(name)>=0) {
				list.add(productBeans.get(i));
			}
		}
		return list;
		
	}
	/**
	 * @Title: queryAll 
	 * @Description: 查询所有
	 * @return
	 */
	public ArrayList<ProductBean> queryAll() {
		
		return productBeans;		
	}


}
