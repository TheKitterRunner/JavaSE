package com.rsy.collection.comparator;

import java.util.Comparator;

import com.rsy.collection.Student;

public class StudentComparator2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getAge() - o1.getAge();
	}

}
