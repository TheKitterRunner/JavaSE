package com.rsy.practice.exam;

public class Exam_2 {
	public static void main(String[] args) {
		Exam_2 exam_2 = new Exam_2();
		int i = 100;
		i = 101;
		exam_2.changeInt(i);
		System.out.println("外面的i = " + i);
//		System.out.println(i);
	}
	
	public void changeInt(int i){
		System.out.println(i);
		i = 1323123;
		System.out.println("里面的i = " + i);
	}
}
