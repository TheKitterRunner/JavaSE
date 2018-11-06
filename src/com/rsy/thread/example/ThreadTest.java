package com.rsy.thread.example;
/**
 *  使用Thread线程
 * @author Nico
 * @createDate 2018年7月31日 下午6:43:42
 */
public class ThreadTest {
	public static void main(String[] args) {
		Thread thread = new MyThread(1);
//		thread.run();  不会开启一个新的线程
		//开启一个线程，线程会自动调用thread里面的run()方法，默认情况下，run()方法什么都没做
		//一个线程不能多次被调用 ，会抛出异常  java.lang.IllegalThreadStateException
		thread.start();  
		Thread t2 = new MyThread(2);
		Thread t3 = new MyThread(3);
		Thread t4 = new MyThread(4);
		Thread t5 = new MyThread(5);
		Thread t6 = new MyThread(6);
	
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		System.out.println(Thread.currentThread().toString());
		System.out.println("main is over");
	}
}
