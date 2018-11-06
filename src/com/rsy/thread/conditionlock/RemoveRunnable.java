package com.rsy.thread.conditionlock;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 出货
 * @author Nico
 * @createDate 2018年8月4日 下午4:48:40
 */
public class RemoveRunnable implements Runnable {
	
	private ReentrantLock lock;
	private Condition addCondition;
	private Condition removeCondition;
	private Rep rep;
	
	public RemoveRunnable(ReentrantLock lock, Condition addCondition, Condition removeCondition, Rep rep) {
		this.lock = lock;
		this.addCondition = addCondition;
		this.removeCondition = removeCondition;
		this.rep = rep;
	}

	@Override
	public void run() {
		lock.lock();
		if (rep.getCount() < 10) {
			try {
				System.out.println("要remove 的数量大于现有的库存量,线程挂起...");
				removeCondition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			rep.setCount(rep.getCount() - 10);
			System.out.println("出货(remove)了10 个,现在的库存是: " + rep.getCount()); 
			addCondition.signalAll();
		}
		lock.unlock();
	}

}