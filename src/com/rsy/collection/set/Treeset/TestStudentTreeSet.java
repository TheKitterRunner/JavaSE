package com.rsy.collection.set.Treeset;

import java.util.Comparator;
import java.util.TreeSet;
/**
 *  构造器传入Comparator接口的一个对象(匿名内部类)
 * @author Nico
 * @createDate 2018年8月8日 下午7:06:25
 */
public class TestStudentTreeSet {
	public static void main(String[] args) {
		TreeSet<Student> studentTreeSet = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().hashCode() - o1.getName().hashCode() + o2.getAge() - o1.getAge();
			}
		});
		Student s1 = new Student("Nico1", 58);
		Student s2 = new Student("Nico2", 38);
		Student s3 = new Student("Nico3", 18);
		Student s4 = new Student("Nico4", 48);
		Student s5 = new Student("Nico5", 28);
		Student s6 = new Student("Nico6", 68);
		
//		studentTreeSet.add(s1);
//		studentTreeSet.add(s2);
//		studentTreeSet.add(s3);
//		studentTreeSet.add(s4);
//		studentTreeSet.add(s5);
//		studentTreeSet.add(s6);

		for(Student s : studentTreeSet){
			System.out.println(s.getName() + ", " + s.getAge());
		}
	}
}
