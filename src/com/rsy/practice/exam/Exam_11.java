package com.rsy.practice.exam;

public class Exam_11 {
	public static void main(String[] args) {
		Data data = new Data();
		data.exchange(data);
		System.out.println(data.a + "," + data.b);  // 10,5
	}
}

class Data{
	int a = 5;
	int b = 10;
	
	public void exchange(Data data){
		int temp = data.a ;
		data.a = data.b;
		data.b = temp;
		System.out.println(data.a + "," + data.b);  // 10,5
	}
}
