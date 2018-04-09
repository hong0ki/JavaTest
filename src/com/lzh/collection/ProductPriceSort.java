/**
 * @Package: com.lzh.collection
 * @author: 李卓宏
 * @date: 2018年4月8日 下午3:47:28 
 */
package com.lzh.collection;

import java.util.Comparator;

/**
 * @ClassName: ProductPriceSort
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年4月8日 下午3:47:28 
 */
public class ProductPriceSort implements Comparator<ProductBean>{

	/* Title: compare
	 * @Description: TODO
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ProductBean o1, ProductBean o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()>o2.getPrice()?1:o1.getPrice()<o2.getPrice()?-1:0;
	}

}
