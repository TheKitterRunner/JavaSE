package com.rsy.homework.Thread.Exam_1;

public class TestString {
	public static void main(String[] args) {
		CreateString cs = new CreateString();
		
		Thread thread1 = new Thread(new readRunnable(cs),"线程1");
		
		thread1.start();
	}
}
