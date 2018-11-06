package com.rsy.practice.thread.pro_customer;
/**
 *  生产者
 * @author Nico
 * @CreateDate 2018年8月23日 下午2:04:05
 */
public class Producer extends Thread{
	
	private Product product;
	
	public Producer(Product product, String name) {
		super(name);
		this.product = product ;
	}

	public void run() {
		while(true){
			product.increase();
		}
	}
	
	
}
