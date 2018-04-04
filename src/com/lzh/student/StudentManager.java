package com.lzh.student;

import java.util.ArrayList;


/**
 * 
 * @ClassName: ProductManager
 * @Description: 管理学生
 * @author 李卓宏
 * @date: 2018年4月3日 下午5:35:39
 */
public class StudentManager  {
	
	private ArrayList<StudentBean> studentBeans ;
	/**
	 * 
	 * 构造方法
	 */
	public StudentManager() {
		studentBeans= new ArrayList<StudentBean>();
		//初始化5个产品
		studentBeans.add(new StudentBean(0,"觉得",32,"男"));
		studentBeans.add(new StudentBean(1,"觉杀毒得",12,"男"));
		studentBeans.add(new StudentBean(2,"觉毒得",22,"女"));
		
	}

	/**
	 * @Title: addProduct 
	 * @Description: 添加学生
	 * @param StudentBean
	 * @return
	 */
	public boolean addStudent(StudentBean StudentBean)  {
		
		return studentBeans.add(StudentBean);
	}
	/**
	 * @Title: deleteProduct 
	 * @Description: 删除学生
	 * @param id
	 * @return
	 */
	public boolean deleteStudent(int id)  {
		
		for(int i=0;i<studentBeans.size();i++) {
			if (studentBeans.get(i).getId()==id) {
				studentBeans.remove(i);
				return true;
			}
		}
		return false;
	}
	/**
	 * @Title: updateProduct 
	 * @Description: 修改学生
	 * @param StudentBean
	 * @return
	 */
	public boolean updateStudent(StudentBean studentBean) {
		if (studentBean!=null) {
			for(int i=0;i<studentBeans.size();i++) {
			if (studentBeans.get(i).getId()==studentBean.getId()) {
				studentBeans.set(i, studentBean);
				return true;
			}
		  }
		}
		
		return false;
	}
	/**
	 * @Title: queryById 
	 * @Description: 精确查询
	 * @param cSex
	 * @return
	 */
	public ArrayList<StudentBean> queryBySex(String cSex) {
		
		ArrayList<StudentBean> pr1=new ArrayList<>();
		
		for (int i = 0; i < studentBeans.size(); i++) {
			if (studentBeans.get(i).getSex()==cSex) {
				pr1.add(studentBeans.get(i));
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
	public ArrayList<StudentBean> queryByName(String name)  {
		
		ArrayList<StudentBean> list=new ArrayList<>();
		for(int i=0;i<studentBeans.size();i++) {
			if(studentBeans.get(i).toString().indexOf(name)>=0) {
				list.add(studentBeans.get(i));
			}
		}
		
		return list;
		
	}
	/**
	 * @Title: queryAll 
	 * @Description: 查询所有
	 * @return
	 */
	public ArrayList<StudentBean> queryAll() {
		
		return studentBeans;		
	}

	/**@Title: queryByAge 
	 * @Description: 根据年龄查询
	 * @param min
	 * @param max
	 * @return
	 */
	public ArrayList<StudentBean> queryByAge(int min, int max) {
		
		ArrayList<StudentBean> list=new ArrayList<>();
		
		for (int i = 0; i < studentBeans.size(); i++) {
			int age=studentBeans.get(i).getAge();
			if (age<max && age>min) {
				list.add(studentBeans.get(i));
			}
		}
		
		return list;
	}


}
