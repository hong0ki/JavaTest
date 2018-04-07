package com.lzh.product2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @ClassName: Menu
 * @Description: HashMap产品管理系统菜单
 * @author 李卓宏
 * @date: 2018年4月3日 下午5:29:29
 */
public class Menu {
	
	 private ProductManager productManager ;
	 private Scanner sc;
	 
	 /**
	  * 构造方法
	  */
	 public Menu() {
		// TODO Auto-generated constructor stub
		 productManager=new ProductManager();
		 sc=new Scanner(System.in);
	}
	/**
	 * @Title: startProduct 
	 * @Description: 开始系统
	 */
	public  void startProduct()  {
		
		
		while(true) {
			System.out.println("=========产品管理系统========");
			System.out.println("1  添加商品");
			System.out.println("2  删除商品");
			System.out.println("3  修改商品");
			System.out.println("4  精确查询商品");
			System.out.println("5  模糊查询商品");
			System.out.println("6  查询商品列表");
			
			int chiose=sc.nextInt();
			switch(chiose) {
			case 1: 
				add(sc);
				break;
			case 2:
				delete(sc);
				break;
			case 3:
				update(sc);
				break;
			case 4:
				queryById(sc);
				break;
			case 5:
				queryByName(sc);
				break;
			case 6:
				queryAll();
				break;
			default :
				error();
				break;
				
			}
	
	}
	
	}
	/**
	 * @Title: error 
	 * @Description: 输入错误提示
	 */
	private void error() {
		System.out.println("你的输入有误，请重新输入");
	}
	/**
	 * @Title: queryAll 
	 * @Description: 查询所有
	 */
	private void queryAll() {
		ArrayList<ProductBean> productBeans2= productManager.queryAll();
		for(int i=0;i<productBeans2.size();i++) {
			
			System.out.println(productBeans2.get(i).toString());
		}
	}
	
	/**
	 * @Title: queryByName 
	 * @Description: 模糊查询
	 * @param sc
	 */
	private void queryByName(Scanner sc) {
		System.out.println("输入要查询的商品名称：");
		String mName=sc.next();
		ArrayList<ProductBean> productBeans1= productManager.queryByName(mName);
		for(int i=0;i<productBeans1.size();i++) {
			System.out.println(productBeans1.get(i).toString());
			
		}
	}
	/**
	 * @Title: queryById 
	 * @Description: 精确查询
	 * @param sc
	 */
	private void queryById(Scanner sc) {
		System.out.println("输入要查询的商品id：");
		int cId=sc.nextInt();
		ArrayList<ProductBean> pro1= productManager.queryById(cId);
		System.out.println(pro1.get(0).toString());
	}
	/**
	 * @Title: update 
	 * @Description: 修改商品
	 * @param sc
	 */
	private void update(Scanner sc)  {
		System.out.println("输入要修改商品的id：");
		int update=sc.nextInt();
		System.out.println("输入修改后的商品名称：");
		String rName=sc.next();
		
		System.out.println("输入修改后的商品价格：");
		float rPrice=sc.nextFloat();
		ProductBean pr1=new ProductBean();
		pr1.setId(update);
		pr1.setProductName(rName);
		pr1.setPrice(rPrice);
		if(productManager.updateProduct( pr1)) {
			System.out.println("修改成功");
		}
		
	}
	/**
	 * @Title: delete 
	 * @Description: 删除商品
	 * @param sc
	 */
	private void delete(Scanner sc)  {
		System.out.println("输入要删除的id：");
		int del=sc.nextInt();
		if(productManager.deleteProduct(del)) {
			System.out.println("删除成功");
		}
		
	}
	/**
	 * @Title: add 
	 * @Description: 添加商品
	 * @param sc
	 */
	private void add(Scanner sc)  {
		System.out.println("输入商品id");
		int pid=sc.nextInt();
		System.out.println("输入商品名称");
		String pName=sc.next();
		System.out.println("输入商品价格");
		float pPrice=sc.nextInt();
		boolean b= productManager.addProduct(new ProductBean(pid,pName,pPrice));
		if(b) {
			System.out.println("添加成功");
		}
		else {
			System.out.println("添加失败");
		}
		
	}

}
