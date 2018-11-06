package com.rsy.thread.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
	public static void main(String[] args) {
		//创建一个线程池
		//一般都是自己根据需求建线程池,这个自定义线程池 核心线程数为3,最大线程数为3,
		//任务队列的类型为LinkBlockingQueue(10),除了核心线程数的任务数,它可以存额外的10个任务
		Executor threadPool = 
				//定长为10,最多可以放置10个任务,
				new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10));  
		
		//创建任务
		Runnable r1 = new MyRunnable(); 
		Runnable r2 = new MyRunnable(); 
		Runnable r3 = new MyRunnable(); 
		Runnable r4 = new MyRunnable(); 
		Runnable r5 = new MyRunnable(); 
		Runnable r6 = new MyRunnable(); 
		
		//将任务提交给线程来运行
		threadPool.execute(r1);
		threadPool.execute(r2);
		threadPool.execute(r3);
		threadPool.execute(r4);
		threadPool.execute(r5);
		threadPool.execute(r6);
		
				
	}
}
