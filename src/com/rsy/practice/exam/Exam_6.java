package com.rsy.practice.exam;

public class Exam_6 {
	public int i;
	public static void main(String[] args) {
		Exam_6 exam = new Exam_6();
		exam.i = 10;
		exam.changeInt(exam.i);
	}
	
	public void changeInt(int i){
		System.out.println(i);
		i += 5;
		System.out.println(i);
		System.out.println(this.i);
	}
}
