package com.rsy.practice.extend;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student("Nico", (char)11, 18, 3120331024L, 60, 59, 99);
		
		System.out.println(p);
		
		int min = s.min();
		int max = s.max();
		double average = s.aver();
		System.out.println("平均成绩是" + average + 
				", 最低分是:" + min + ", 最高分是:" + max);
	}
}
