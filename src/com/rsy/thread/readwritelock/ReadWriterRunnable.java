package com.rsy.thread.readwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *  读写锁
 *    ReentrantReadWriterLock
 *   	加读锁时其它线程可以进行读操作但不可以进行写操作,加写锁时其他线程读写操作都不可以进行
 *    应用特性:
 *    	1.它把对共享资源的访问者划分成读者和写者，读者只对共享资源进行读访问，写者则需要对共享资源进行写操作。
 *    	2.一个读写锁同时只能有一个写者或多个读者（与CPU数相关），但不能同时既有读者又有写者。
 *    	3.通常, 当读写锁处于读模式锁住状态时, 如果有另外线程试图以写模式加锁, 
 *        读写锁通常会阻塞随后的读模式锁请求, 这样可以避免读模式锁长期占用, 而等待的写模式锁请求长期阻塞.
 * @author Nico
 * @createDate 2018年8月4日 下午1:42:03
 */
public class ReadWriterRunnable implements Runnable{
	/**
	 * 创建一个读写锁
	 */
	private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
	private int state = 1;  //  1 : read  2 : write
	
	@SuppressWarnings("unused")
	private Object lock;
	
	public ReadWriterRunnable(int state, Object lock){
		this.state = state;
		this.lock = lock;
	}
	@Override
	public void run() {
		if (state == 1) {
			this.read();
		}else{
			this.write();
		}
	}
	
	public void read(){
		rwLock.readLock().lock();   //锁定读锁
		System.out.println(Thread.currentThread().getName() + "  正在读取数据");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rwLock.readLock().unlock();  //解开读锁
	}
	
	public void write(){
		rwLock.writeLock().lock();   //锁定写锁
		System.out.println(Thread.currentThread().getName() + "  正在写数据");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rwLock.writeLock().unlock();  //解开写锁
	}
	//主方法
	public static void main(String[] args) {
		Object lock = new Object();  //创建一个锁对象
		
		//执行读的线程,创建三个线程,使用锁:lock
		Runnable readRunnable = new ReadWriterRunnable(1, lock);
		new Thread(readRunnable, "A1").start();
		new Thread(readRunnable, "A2").start();
		new Thread(readRunnable, "A3").start();
		
		//执行写的线程,相应的创建三个线程,使用同一把锁:lock
		Runnable writeRunnable = new ReadWriterRunnable(2, lock);
		new Thread(writeRunnable, "B1").start();
		new Thread(writeRunnable, "B2").start();
		new Thread(writeRunnable, "B3").start();
	}
}
