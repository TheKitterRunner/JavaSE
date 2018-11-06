package com.rsy.thread.syn_lock;

/**
 *  1. 当锁是同一个锁时,线程需要排队进入代码块;
 *     当锁不是同一个锁时,线程不需要排队进入代码块;
 *  2. 当锁是(this)时, 如果多个线程使用同一个Runnable对象,不需要排队等待;   // this代表当前实例的本身,也就是Runnable 的实例化本身
 *     当锁是(this)时, 如果多个线程使用不同的Runnable对象,就需要排队等待;	
 *  3. 当锁是(this.getClass())时,所有的线程都需要同步等待;
 *  
 * @author Nico
 * @createDate 2018年8月3日 下午8:51:01
 */
public class SynRunnableTest {
	public static void main(String[] args) {
		//创建一个锁
		Object lock1 = new Object();
		Object lock2 = new Object();
		//构建两个线程，使用同一把锁
		Runnable r1 = new SynRunnable(lock1);
		Runnable r2 = new SynRunnable(lock2);
//		Runnable r3 = new SynRunnable(lock1);
//		Runnable r4 = new SynRunnable(lock2);
//		Runnable r5 = new SynRunnable(lock1);
//		Runnable r6 = new SynRunnable(lock2);
//		Runnable r7 = new SynRunnable(lock1);
		//启动线程，并分别给两个线程命名
		new Thread(r1,"A").start();
		new Thread(r2,"B").start();
//		new Thread(r3,"C").start();
//		new Thread(r4,"D").start();
//		new Thread(r5,"E").start();
//		new Thread(r6,"F").start();
//		new Thread(r7,"G").start();
	}
}
