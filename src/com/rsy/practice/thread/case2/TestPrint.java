package com.rsy.practice.thread.case2;

public class TestPrint {
	public static void main(String[] args) {
		PrintLetter printLetter = new PrintLetter();
		
		Thread thread1 = new Thread(new RunnableA(printLetter));
		Thread thread2 = new Thread(new RunnableB(printLetter));
		Thread thread3 = new Thread(new RunnableC(printLetter));
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
