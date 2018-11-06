package com.rsy.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		Callable<String> call = new MyCallable();
		FutureTask<String> task = new FutureTask<>(call);
		
		new Thread(task).start();
		String result = task.get(1000,TimeUnit.MILLISECONDS);
		System.out.println(result);
	}
}
