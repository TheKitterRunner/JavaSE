package com.rsy.practice.thread.case2;
/**
 * 	
 * @author Nico
 * @CreateDate 2018年8月23日 下午3:54:57
 */
public class PrintLetter {
	
	public static Integer count = 1;
	
	public void printA(){
		synchronized (this) {
			while(count % 3 == 2 || count % 3 == 0 ){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("A");
			count ++;
			this.notifyAll();
		}
	}
	
	public void printB(){
		synchronized (this) {
			while(count % 3 == 0 || count % 3 == 1 ){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("B");
			count ++;
			this.notifyAll();
		}
	}
	
	public void printC(){
		synchronized (this) {
			while(count % 3 == 1 || count % 3 == 2 ){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("C");
			count ++;
			this.notifyAll();
		}
	}
}
