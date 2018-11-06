package com.rsy.practice.exam;

public class Exam_4 {
	
	public static void main(String[] args) {
		String string = new String("没变");
		changeString(string);
		System.out.println("外面的string=" + string);
	}

	public static void changeString(String string){
		string = "变了";
		System.out.println("里面的string=" + string);
	}
}
