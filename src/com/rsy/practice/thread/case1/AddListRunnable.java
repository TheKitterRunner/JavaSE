package com.rsy.practice.thread.case1;

public class AddListRunnable implements Runnable{
	
	private Source Source;

	public AddListRunnable(Source source) {
		super();
		Source = source;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 30; i ++){
			Source.add();
		}
	}
	
}
