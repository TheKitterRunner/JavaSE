package com.rsy.thread.deadlock;

public class DeadLockTest {
	public static void main(String[] args) {
		//创建两个所对象
		Lock lockA = new Lock("A");
		Lock lockB = new Lock("B");
		//创建两个Runnable线程对象
		Runnable r2 = new DeadLockRunnable(lockA, lockB);
		Runnable r1 = new DeadLockRunnable(lockB, lockA);
		//创建线程并启动
		new Thread(r1,"Thread-A").start();
		new Thread(r2,"Thread-B").start();
	}
}
