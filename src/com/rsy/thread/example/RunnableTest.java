package com.rsy.thread.example;


public class RunnableTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());  //等同于Thread t1 = new Thread(); new MyRunnable(t1).start();
		Thread t2 = new Thread(new MyRunnable());
		Thread t3 = new Thread(new MyRunnable());
		Thread t4 = new Thread(new MyRunnable());
		Thread t5 = new Thread(new MyRunnable());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		System.out.println("main is over" );
	}
}
