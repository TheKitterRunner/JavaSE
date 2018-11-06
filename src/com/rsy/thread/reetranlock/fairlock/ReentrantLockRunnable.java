package com.rsy.thread.reetranlock.fairlock;

import java.util.concurrent.locks.ReentrantLock;
/**
 *   公平锁机制是重入锁的一种表现 : 可以让线程有序的进入要执行的代码块中
 *   正常的多线程是非公平机制的:就是在同步等待的时候,永远都不知道下个执行代码块的是哪个线程,没有顺序
 * @author Nico
 * @createDate 2018年8月4日 下午3:01:52
 */
public class ReentrantLockRunnable implements Runnable {
	
//	private ReentrantLock lock  = new ReentrantLock();  //非公平锁默认为(false)
	private ReentrantLock lock  = new ReentrantLock(true);  // 公平锁默认为(true)

	@Override
	public void run() {
		// A,B,C三个线程循环执行十次
		for(int i = 0 ; i < 10 ; i ++ ){
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "正在执行---->");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		Runnable r = new ReentrantLockRunnable();
		
		new Thread(r, "B").start();
		new Thread(r, "C").start();
		new Thread(r, "A").start();

	}
	
}
