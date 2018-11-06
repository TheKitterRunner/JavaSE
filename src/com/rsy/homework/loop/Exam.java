package com.rsy.homework.loop;

public class Exam {
	String A = new String("good");
	char[] ch = {'q','w','e'};
	
	public static void main(String []args) {
		Exam exam = new Exam();
		exam.change(exam.A,exam.ch);
		System.out.println(exam.A);
		System.out.println((exam.ch[0]));
	} 
	public void change(String str,char[] ch){
		str ="test is ok !";
		ch[0] = 'g';
	}
}
