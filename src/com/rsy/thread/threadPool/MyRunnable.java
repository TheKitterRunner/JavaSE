package com.rsy.thread.threadPool;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " ---> 正在执行线程任务.....");
	}

}
