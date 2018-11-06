package com.rsy.thread.conditionlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 进货
 * @author Nico
 * @createDate 2018年8月4日 下午4:48:29
 */
public class AddRunnable implements Runnable {
	
	private ReentrantLock lock;
	private Condition addCondition;
	private Condition removeCondition;
	private Rep rep;
	
	public AddRunnable(ReentrantLock lock, Condition addCondition, Condition removeCondition, Rep rep) {
		this.lock = lock;
		this.addCondition = addCondition;
		this.removeCondition = removeCondition;
		this.rep = rep;
	}
	/**
	 * 
	 */
	@Override
	public void run() {
		lock.lock();
		if (rep.getCount() + 10 > rep.CAPACITY) {
			// 总量大于容量,挂起
			try {
				System.out.println("进货(add)了10 个,超过库存容量,挂起线程");
				addCondition.await();  // 等同于同步锁的  lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			rep.setCount(rep.getCount() + 10);
			System.out.println("进货(add)了10 个,现在的库存是: " + rep.getCount());
			//唤起出货的线程
			removeCondition.signalAll();   //这个等同于同步锁的  lock.nitifyAll()
//			removeCondition.signal();   //这个等同于同步锁的  lock.nitify()
		}
		lock.unlock();
	}
}
