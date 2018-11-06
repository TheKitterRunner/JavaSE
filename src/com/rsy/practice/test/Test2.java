package com.rsy.practice.test;

public class Test2 {
	private static int counter = 0;
	public static int getInstanceCount(){
		return counter;
	}
	public Test2(){
		counter++;
	}
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
		System.out.println(Test2.getInstanceCount());
	}
}
