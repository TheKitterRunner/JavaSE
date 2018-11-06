package com.rsy.thread.volatileABC;

public class RunnableC implements Runnable {
	
	private int count; //循环打印的次数

	public RunnableC(int count) {
		this.count = count;
	}
	
//	@Override
	public void run() {
		for ( int i = 0; i < this.count; i ++  ){
			while ( Test.state != 3){
			}
			System.out.print("C");
			Test.state = 1;
		}
	}		
}
