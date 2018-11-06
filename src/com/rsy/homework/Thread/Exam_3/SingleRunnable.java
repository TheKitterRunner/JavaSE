package com.rsy.homework.Thread.Exam_3;

/**
 * 3.写个单例实现线程安全，
 * 
 * @author Nico
 * @CreateDate 2018年8月23日 下午10:20:06
 */
public class SingleRunnable extends Thread{

	@Override
	public void run() {
		System.out.println(SingleTon.getSingleTon());		
	}
	
	public static void main(String[] args) throws Exception {
		
		SingleRunnable[] sr = new SingleRunnable[5];
		
		for( int i = 0;i < sr.length; i ++){
			sr[i] = new SingleRunnable();
		}
		for (int j = 0; j < sr.length; j++) {
			sr[j].start();		
		}
	}
}
	