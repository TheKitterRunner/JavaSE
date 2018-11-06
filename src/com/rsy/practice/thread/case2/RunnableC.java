package com.rsy.practice.thread.case2;

public class RunnableC implements Runnable{
	
	private PrintLetter print;

	
	public RunnableC(PrintLetter print) {
		super();
		this.print = print;
	}


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			print.printC();
		}
	}
}