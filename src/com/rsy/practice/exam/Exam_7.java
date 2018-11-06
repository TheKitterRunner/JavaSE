package com.rsy.practice.exam;

public class Exam_7 {
	public int i;
	
	public static void main(String[] args) {
		Exam_7 exam = new Exam_7();
		exam.i = 10;
		exam.changeObject(exam);
		System.out.println("外面的i = " + exam.i);
	}
	
	public void changeObject(Exam_7 e){
		e.i += 5;
		System.out.println("里面的i = " + e.i);
	}
}
