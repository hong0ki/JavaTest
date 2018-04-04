package com.lzh.student;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @ClassName: Menu
 * @Description: 学生管理系统菜单
 * @author 李卓宏
 * @date: 2018年4月3日 下午5:29:29
 */
public class Menu {
	
	 private StudentManager studentManager ;
	 private Scanner sc;
	 
	 /**
	  * 构造方法
	  */
	 public Menu() {
		// TODO Auto-generated constructor stub
		 studentManager=new StudentManager();
		 sc=new Scanner(System.in);
	}
	/**
	 * @Title: startProduct 
	 * @Description: 开始系统
	 */
	public  void startProduct()  {
		
		
		while(true) {
			System.out.println("=========学生管理系统========");
			System.out.println("1  添加学生");
			System.out.println("2  删除学生");
			System.out.println("3  修改学生");
			System.out.println("4  根据性别查询学生");
			System.out.println("5  根据名字查询学生");
			System.out.println("6  根据年龄查询学生");
			System.out.println("7  查询学生列表");
			
			int chiose=sc.nextInt();
			switch(chiose) {
			case 1: 
				addStudent(sc);
				break;
			case 2:
				deleteStudent(sc);
				break;
			case 3:
				update(sc);
				break;
			case 4:
				queryBySex(sc);
				break;
			case 5:
				queryByName(sc);
				break;
			case 6:
				queryByAge(sc);
				break;
			case 7:
				queryAll();
				break;
			default :
				error();
				break;
				
			}
	
	}
	
	}
	/**@Title: queryByAge 
	 * @Description: 根据年龄查询
	 * @param sc
	 */
	private void queryByAge(Scanner sc) {
		
		System.out.println("请输入最小年龄：");
		int min=sc.nextInt();
		System.out.println("请输入最大年龄：");
		int max=sc.nextInt();
		
		ArrayList<StudentBean> list=studentManager.queryByAge(min,max);
		toStudentList(list);
	}
	/**
	 * @Title: toStudentList 
	 * @Description: arraylist 遍历输出
	 * @param list
	 */
	private void toStudentList(ArrayList<StudentBean> list) {
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).toString());
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
		
		ArrayList<StudentBean> studentBeans2= studentManager.queryAll();
		toStudentList(studentBeans2);
	}
	
	/**
	 * @Title: queryByName 
	 * @Description: 模糊查询名字
	 * @param sc
	 */
	private void queryByName(Scanner sc) {
		
		System.out.println("输入要查询的学生名称：");
		String mName=sc.next();
		
		ArrayList<StudentBean> studentBeans1= studentManager.queryByName(mName);
		toStudentList(studentBeans1);
	}
	/**
	 * @Title: queryById 
	 * @Description: 性别查询
	 * @param sc
	 */
	private void queryBySex(Scanner sc) {
		
		System.out.println("输入要查询的学生性别（男或女）：");
		String  cSex=sc.next();
		
		ArrayList<StudentBean> pro1= studentManager.queryBySex(cSex);
		toStudentList(pro1);
	}
	/**
	 * @Title: update 
	 * @Description: 修改学生
	 * @param sc
	 */
	private void update(Scanner sc)  {
		
		System.out.println("输入要修改学生的id：");
		int update=sc.nextInt();
		System.out.println("输入修改后的学生名称：");
		String rName=sc.next();
		System.out.println("输入修改后的学生性别：");
		String rSex=sc.next();
		System.out.println("输入修改后的学生年龄：");
		int rAge=sc.nextInt();
		
		StudentBean pr1=new StudentBean();
		pr1.setId(update);
		pr1.setName(rName);
		pr1.setAge(rAge);
		pr1.setSex(rSex);
		
		if(studentManager.updateStudent( pr1)) {
			System.out.println("修改成功");
		}
		
	}
	/**
	 * @Title: delete 
	 * @Description: 删除学生
	 * @param sc
	 */
	private void deleteStudent(Scanner sc)  {
		
		System.out.println("输入要删除的id：");
		int del=sc.nextInt();
		if(studentManager.deleteStudent(del)) {
			System.out.println("删除成功");
		}
		
	}
	/**
	 * @Title: add 
	 * @Description: 添加学生
	 * @param sc
	 */
	private void addStudent(Scanner sc)  {
		
		System.out.println("输入学生id");
		int pid=sc.nextInt();
		System.out.println("输入学生名称");
		String pName=sc.next();
		System.out.println("输入学生性别");
		String pSex=sc.next();
		System.out.println("输入学生年龄");
		int  pAge=sc.nextInt();
		
		boolean b= studentManager.addStudent(new StudentBean(pid,pName,pAge,pSex));
		if(b) {
			System.out.println("添加成功");
		}
		else {
			System.out.println("添加失败");
		}
		
	}

}
