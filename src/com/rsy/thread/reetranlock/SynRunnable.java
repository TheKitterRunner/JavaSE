package com.rsy.thread.reetranlock;
/**
 * 同步锁
 * 		不需要进行解锁的操作
 * @author Nico
 * @createDate 2018年8月4日 上午11:41:52
 */
public class SynRunnable implements Runnable{
	/**
	 * 创建锁对象
	 */
	private static Object lock = new Object();

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + "开始实行被锁住的代码块1");
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + "开始实行被锁住的代码块2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + "即将解锁2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "即将解锁1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Runnable r = new SynRunnable();
		
		//创建两个线程
		new Thread(r,"Nico").start();
		new Thread(r,"Kry").start();
	}
}
