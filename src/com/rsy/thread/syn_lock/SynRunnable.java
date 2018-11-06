package com.rsy.thread.syn_lock;

public class SynRunnable implements Runnable {
	/**
	 * 同步锁对象
	 */
	private Object lock;
	
	public SynRunnable(Object lock){
		this.lock = lock;
	}
	public void run(){
//		synchronized (lock) { 
//		synchronized (this) {  
		synchronized (lock) {   
			try {
				Thread.sleep(1000);  // 同一个线程锁下的线程，执行是每个会间隔1000ms,不会同时执行
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("正在执行的是" + Thread.currentThread().getName() + "线程");
		}
	}
	
}
