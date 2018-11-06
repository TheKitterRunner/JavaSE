package com.rsy.thread.reetranlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 *  重入锁(扩展)
 *  	同步锁和ReetranLock的区别:
 * 			同步锁是由系统来控制的
 * `		重入锁是由开发者通过代码来实现锁机制
 * @author Nico
 * @createDate 2018年8月4日 上午11:09:51
 */
public class ReetrantRunnable implements Runnable {
	/**
	 * 创建锁对象
	 */
	private static ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		//加锁
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "开始实行被锁住的代码块1");
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "开始实行被锁住的代码块2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "即将解锁1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//解锁
		lock.unlock();
		System.out.println(Thread.currentThread().getName() + "即将解锁2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//解锁
		lock.unlock();
	}
	public static void main(String[] args) {
		Runnable r = new ReetrantRunnable();
		
		//创建两个线程
		new Thread(r,"Nico").start();
		new Thread(r,"Kry").start();
	}
}
