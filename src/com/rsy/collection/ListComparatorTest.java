package com.rsy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rsy.collection.comparator.StudentComparator2;

/**
 * List外部排序
*@author Nico
*2018年7月18日下午4:34:03
*/
public class ListComparatorTest {
	public static void main(String []args) {
		//创建一个泛型是Student 的List集合类对象来存储创建的Student实例
		List<Student> students = new ArrayList<Student>();
		//Student实例化并增加到students集合中 
		students.add(new Student("name2" , 24));
		students.add(new Student("name1" , 25));
		students.add(new Student("name3" , 29));
		students.add(new Student("name4" , 27));
		students.add(new Student("name5" , 21));
	
		//直接new一个写好的外部排序器进行排序
		Collections.sort(students, new StudentComparator2());
		//使用匿名内部类创造排序器
//		Collections.sort(students , new Comparator<Student>() {
//				@Override
//				public int compare(Student o1, Student o2) {
//					return o1.getName().compareTo(o2.getName());
//				}
//				
//			});
//		//lambda表达式 (jdk8新特性)	
//		Collections.sort(students,(o1,o2) -> o1.getName().compareTo(o2.getName()));	
			
		for (Student s:students){
			System.out.println(s.getAge());
		}
	}
}
