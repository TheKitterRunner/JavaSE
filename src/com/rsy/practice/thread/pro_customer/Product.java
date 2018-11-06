package com.rsy.practice.thread.pro_customer;

/**
 *  这个类就是一个产品的仓库,当库存数量低于消费者要购买的数量时就调用increase方法,当超过要购买的数量时就通知消费者购买
 *  虽然进货和出货时两个线程,但是有了同步锁后就会先执行完一个后再去执行另外一个
 * @author Nico
 * @CreateDate 2018年8月23日 下午2:21:13
 */
public class Product {
	
	@SuppressWarnings("unused")
	private String name;
	
	private int count;

	public Product(String name) {
		super();
		this.name = name;
	}

	public void increase() {
		synchronized(this){
			while( count >= 20 ){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 如果库存不足就开始生产
			try {
				Thread.currentThread();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("生产一个需要的产品");
			System.out.println( ++ count );
			this.notify();
		}
	}
	
	public void  decrease(){
		synchronized(this){
			while( count < 20 ){
				System.out.println("消费者需要等待");
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("消费者购买20个产品");
			System.out.println(count -= 20);
			this.notify();
		}
	}
}
