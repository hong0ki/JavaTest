/**
 * @Package: com.lzh.interface1
 * @author: THINK 
 * @date: 2018年3月29日 下午3:41:14 
 */
package com.lzh.interface1;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author THINK
 * @date: 2018年3月29日 下午3:41:14 
 */
public class Test {
	
	public static void main(String[] args) {
		Teacher teacher=new Teacher("卡萨丁",33);
		teacher.eat();
		teacher.sleep();
		
		Student student=new Student();
		student.eat();
		
		SmokingDrunkTeacher teacher2=new SmokingDrunkTeacher("李四",77);
		teacher2.drunking();
		teacher2.smoking();
		
	}

}
