package com.rsy.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 *  1.List集合是可以重复的
 *  2.List集合是有续的
 * ArrayList : 
 *   1.添加效率不高
 *   2.随机访问速度快...get()
 * 
 * @author Nico
 * @createDate 2018年8月8日 下午3:34:08
 */
public class TestArrayList2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("Nico1" ,18);
		Student s2 = new Student("Nico2" ,18);
		Student s3 = new Student("Nico3" ,18);
		Student s4 = new Student("Nico4" ,18);
		Student s5 = new Student("Nico5" ,18);
		Student s6 = new Student("Nico6" ,18);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
	}
}
