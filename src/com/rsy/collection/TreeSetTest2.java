package com.rsy.collection;

import java.util.Set;
import java.util.TreeSet;

import com.rsy.collection.comparator.StudentComparator;
import com.rsy.collection.comparator.StudentComparator2;
/**
* 定制排序
*@author Nico
*2018年7月18日下午2:51:41
*/
public class TreeSetTest2 {
	public static void main(String []args) {
		Set<Student> students = new TreeSet<Student>(new StudentComparator2());
		
		students.add(new Student("name1" , 25));
		students.add(new Student("name2" , 24));
		students.add(new Student("name3" , 29));
		students.add(new Student("name4" , 27));
		students.add(new Student("name5" , 21));
	
		for (Student s:students){
			System.out.println(s);
		}
	}
}
