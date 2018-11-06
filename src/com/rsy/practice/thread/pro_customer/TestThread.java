package com.rsy.practice.thread.pro_customer;

public class TestThread {
	public static void main(String[] args) {
		Product product = new Product("手機");
		
		Producer producer  = new Producer(product,"thread_pro1");
		Consumer consumer = new Consumer(product,"thread_consumer");
		
		consumer.start();
		producer.start();
	}
}
