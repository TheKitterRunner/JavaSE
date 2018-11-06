package com.rsy.practice.thread.case1;
/**
 *  主方法,用两个线程来执行要  加3 减2 的操作
 * @author Nico
 * @CreateDate 2018年8月23日 下午3:17:07
 */
public class TestRunnable {
	public static void main(String[] args) {
		Source source = new Source();
		
		Thread addList = new Thread(new AddListRunnable(source),"add_thread");
		Thread removeList = new Thread(new RemoveListRunnable(source),"remove_thread");
		
		addList.start();
		removeList.start();
	}
}
