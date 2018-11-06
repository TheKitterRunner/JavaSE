package com.rsy.practice.thread.case1;

public class RemoveListRunnable implements Runnable{
	
	private Source source;
	
	public RemoveListRunnable(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void run() {
		for( int i = 1;i <= 30; i++ ){
			source.delete();
		}
	}

}
