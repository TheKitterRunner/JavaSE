package com.rsy.thread.example;
/**
 *   使用继承Thread类实现多线程
 * @author Nico
 * @createDate 2018年7月31日 下午7:12:44
 */
public class MyThread extends Thread {
	
	private int id;
	public MyThread(int id) {
		this.id = id;
	}
	@Override
	public void run() {
			System.out.println("我是一个线程，正在执行。。。" + "当前正在执行的线程名称是：" + 
							Thread.currentThread().getName() + " ID是：" + id);
	}
	
}
