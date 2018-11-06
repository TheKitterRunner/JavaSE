package com.rsy.practice.thread.case2;

public class RunnableB implements Runnable{
	
	private PrintLetter print;

	
	public RunnableB(PrintLetter print) {
		super();
		this.print = print;
	}


	@Override
	public void run() {
		for( int i = 0;i < 10;i ++ ){
			print.printB();
		}
	}
}
