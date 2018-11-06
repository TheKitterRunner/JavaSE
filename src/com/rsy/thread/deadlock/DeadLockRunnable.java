package com.rsy.thread.deadlock;

public class DeadLockRunnable implements Runnable {
	
	private Lock lockA;
	private Lock lockB;
	
	public DeadLockRunnable(Lock lockA, Lock lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}
	@Override
	public void run() {
		synchronized (lockA) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->获取到锁：" + lockA);
			synchronized (lockB) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "==>获取到锁：" + lockB);
			}
		}	
	}
}
