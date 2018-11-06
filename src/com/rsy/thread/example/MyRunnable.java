package com.rsy.thread.example;
/**
 *   使用Runnable接口实现多线程
 * @author Nico
 * @createDate 2018年7月31日 下午7:12:00
 */
public class MyRunnable implements Runnable{
	
	
	public void run(){
		System.out.println("我是runnable接口实现的线程。。。");
	}
}
