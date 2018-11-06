package com.rsy.thread.volatileABC;

import java.util.Scanner;

/**
 *   使用3个线程
 *   	RunnableA :打印A
 *   	RunnableB :打印B
 *   	RunnableC :打印C
 *   循环打印10次ABC，按照顺序打印
 *   
 * @author Nico
 * @createDate 2018年7月31日 下午7:36:11
 */
public class Test {
	/**
	 *  当state == 1的时候，允许A线程打印，打印完成之后，将state = 2；
	 *  当state == 2的时候，允许B线程打印，打印完成之后，将state = 3；
	 *  当state == 3的时候，允许C线程打印，打印完成之后，将state = 1；
	 */
	
	public volatile static int state = 1;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要打印的次数：");
		int count = scanner.nextInt();
		scanner.close();
		Thread a = new Thread(new RunnableA(count)); //Runnable a = new Runable(count)
		Thread b = new Thread(new RunnableB(count));
		Thread c = new Thread(new RunnableC(count));
		
		a.start(); //new Thread(a).start()
		b.start();
		c.start();
	}	
}
