/**
 * @Package: com.lzh.abstact2
 * @author: THINK 
 * @date: 2018年3月29日 上午9:01:51 
 */
package com.lzh.abstact2;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 上午9:01:51 
 */
public class Test {
	public static void main(String[] args) {
		People zhangshan = new ChinaPeople("张三", "男", 29, null);
		People diaocan = new ChinaPeople("貂蝉", "女", 22, null);
		People yangbo = new ChinaPeople("杨波", "男", 22, null);
		People xiaoqiao = new ChinaPeople("小乔", "女", 22, null);
		
		People zhangshan1 = new UsaPeople("张三", "男", 19, null);
		People diaocan1 = new UsaPeople("貂蝉", "女", 18, null);
		People yangbo1 = new UsaPeople("杨波", "男", 22, null);
		People xiaoqiao1 = new UsaPeople("小乔", "女", 22, null);
		
		System.out.println(zhangshan.isMarry(xiaoqiao));
		System.out.println(zhangshan.isMarry(diaocan));
		
		System.out.println(zhangshan1.isMarry(yangbo1));
		System.out.println(zhangshan1.isMarry(diaocan1));
	}

}
