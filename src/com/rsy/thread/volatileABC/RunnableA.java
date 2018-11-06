package com.rsy.thread.volatileABC;

public class RunnableA implements Runnable {

	private int count;

	public RunnableA(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.count; i++) {
			// while ( Test.state != 1){
			// }
			while (Test.state != 1) {
			}

			System.out.print("A");
			Test.state = 2;
		}
	}
}
