package com.rsy.practice.thread.pro_customer;
/**
 *  消費者,需要購買產品
 * @author Nico
 * @CreateDate 2018年8月23日 下午2:30:10
 */
public class Consumer extends Thread {

	private Product product;

	public Consumer(Product product, String name) {
		super(name);
		this.product = product;
	}

	public void run() {
		while( true ){
			product.decrease();
		}
	}
}
