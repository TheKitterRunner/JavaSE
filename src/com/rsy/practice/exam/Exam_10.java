package com.rsy.practice.exam;

public class Exam_10 {
	
	public static void main(String[] args) {
		Exam_10 exam = new Exam_10();
		int a = 5;
		int b = 10;
		exam.exchange(a, b);
		System.out.println(a + "," + b);  // 5,10
	}
	public void exchange(int a ,int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + "," + b);  // 10,5
	}

}
