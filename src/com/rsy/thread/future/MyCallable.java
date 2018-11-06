package com.rsy.thread.future;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("正在执行callable线程.....");
		Thread.sleep(500);
		return "callable return value.......";
	}
	
}
