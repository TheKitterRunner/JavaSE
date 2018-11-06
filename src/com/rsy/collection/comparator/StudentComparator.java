package com.rsy.collection.comparator;

import java.util.Comparator;

import com.rsy.collection.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() > o2.getAge() ? 1:(o1.getAge() == o2.getAge() ? 0 : -1);
	}
	
}
