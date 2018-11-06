package com.rsy.thread.conditionlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 *   条件锁的应用(生产者-消费者问题)
 * @author Nico
 * @createDate 2018年8月4日 下午5:07:33
 */
public class Test {
	public static void main(String[] args) {
		//创建一个锁对象
		ReentrantLock lock = new ReentrantLock();
		
		//通过锁对象,创建两个条件锁
		Condition addCondition = lock.newCondition();  // 进货条件锁
		Condition removeConditon = lock.newCondition();  // 出货条件锁
		Rep rep = new Rep();
		
		Runnable add = new AddRunnable(lock,addCondition,removeConditon,rep);
		Runnable remove = new RemoveRunnable(lock,addCondition,removeConditon,rep);
		
		new Thread(add, "A").start();
		new Thread(add, "B").start();
		new Thread(add, "C").start();
		new Thread(add, "D").start();
		new Thread(add, "E").start();
		new Thread(add, "F").start();
		
		new Thread(remove,"A").start();
		new Thread(remove,"B").start();
		new Thread(remove,"C").start();
		new Thread(remove,"D").start();
		new Thread(remove,"E").start();
		new Thread(remove,"F").start();
	}
}
