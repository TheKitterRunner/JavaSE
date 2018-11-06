package com.rsy.homework.Thread.Exam_2;

public class TicketTest {
	public static void main(String[] args) {
		WindowRunnable wr = new WindowRunnable(); 
		
		Thread thread1 = new Thread(wr, "A窗口");
		Thread thread2 = new Thread(wr, "B窗口");
		Thread thread3 = new Thread(wr, "C窗口");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
