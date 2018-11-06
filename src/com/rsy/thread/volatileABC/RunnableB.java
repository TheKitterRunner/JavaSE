package com.rsy.thread.volatileABC;

public class RunnableB implements Runnable {
	
	private int count;

	public RunnableB( int count){
		this.count = count;
	}
	
	@Override
	public void run() {
		for ( int i = 0; i < this.count; i ++  ){
			while ( Test.state != 2){
			}
			System.out.print("B");
			Test.state = 3;
		}	
	}	
}
