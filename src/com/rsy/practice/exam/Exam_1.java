package com.rsy.practice.exam;

public class Exam_1 {
	String string = new String("good");
	char[] ch = {'a','b','c'};
	public static void main(String[] args) {
		Exam_1 exam = new Exam_1();
//		exam.change();
		exam.change2(exam.string,exam.ch);
		System.out.println(exam.string);
		System.out.println((exam.ch[0]));
	}
	public void change(){
		string = "test ok";
		ch[0] = 'g';
	}
	
	public void change2(String str,char[] ch){
//		System.out.println(str);
		str = "test ok";
		ch[0] = 'g';
	}
}
