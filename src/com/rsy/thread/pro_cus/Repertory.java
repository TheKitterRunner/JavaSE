package com.rsy.thread.pro_cus;

import java.util.LinkedList;
import java.util.List;

/**
 *   仓库
 * @author Nico
 * @createDate 2018年8月2日 下午10:53:27
 */
public class Repertory {
	/**
	 * 库存量容量
	 */
	private static int CAPACITY = 100;
	/**
	 * 仓库实时的手机数量
	 */
	private List<Phone> phones = new LinkedList<Phone>();
	
	public List<Phone> getPhones() {
		return phones;
	}
	
	public void setPhones(List<Phone> phones){
		this.phones = phones;
	}
	
	@SuppressWarnings("static-access")
	public synchronized void add(List<com.rsy.thread.pro_cus.Phone> addPhones){
		while(true){
			if (addPhones.size() + this.phones.size() <= this.CAPACITY) {
				//需要进货
				this.phones.addAll(addPhones);
				System.out.println(Thread.currentThread().getName() + "进货" + addPhones.size() + "台手机");
				//通知卖家来购买手机
				this.notifyAll();
				break;  //所有逻辑处理完成,结束当前方法
			}else{
				//库存放不了下,挂起
				try {
					System.out.println(Thread.currentThread().getName() + "进货" + addPhones.size() + "台手机,库存不足,挂起 !");
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * 出货
	 * @param sellPhones
	 */
	public synchronized void sell(List<com.rsy.thread.pro_cus.Phone> sellPhones){
		while(true){
			if (sellPhones.size() <= this.phones.size()) {
				//把手机卖掉
				for (int i = 0; i < sellPhones.size(); i++) {
					this.phones.remove(0);
				}
				System.out.println(Thread.currentThread().getName() + "购买" + sellPhones.size() + "台手机成功 !");
				//通知其他的人,该买的买,该卖的卖
				this.notify();
				break;   //所有逻辑处理完成,结束当前方法
			}else{
				try {
					System.out.println(Thread.currentThread().getName() + "买" + sellPhones.size() + 
							"个手机,库存不足,挂起,等待进货");
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
