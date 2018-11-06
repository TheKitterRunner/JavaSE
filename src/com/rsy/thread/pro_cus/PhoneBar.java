package com.rsy.thread.pro_cus;

import java.util.ArrayList;
import java.util.List;

/**
 *   出售手机的商家柜台
 * @author Nico
 * @createDate 2018年8月3日 上午9:05:24
 */
public class PhoneBar {
	public static void main(String[] args) {
		// 创建一个仓库,目前的库存为 0 
		Repertory rep = new Repertory();
		
		//创建3 个买手机的线程(相当于3个人买手机)
		// 第一个买家
		List<Phone> sell1 = new ArrayList<Phone>();
		Phone p = null;
		for( int i = 0 ; i < 5 ; i ++){
			p = new Phone("Iphone X");
			sell1.add(p);
		}
		// 第二个买家
		List<Phone> sell2 = new ArrayList<Phone>();
		for( int i = 0 ; i < 10 ; i ++){
			p = new Phone("Iphone X");
			sell2.add(p);
		}
		
		// 第三个买家
		List<Phone> sell3 = new ArrayList<Phone>();
		for (int i = 0; i < 15; i++) {
			p = new Phone("Iphone X");
			sell3.add(p);
		}
		new Thread(new Customer(rep, sell1),"Kry1").start();
		new Thread(new Customer(rep, sell2),"Kry2").start();
		new Thread(new Customer(rep, sell2),"Kry3").start();

		//创建三个进货的线程
		List<Phone> addPhone1 = new ArrayList<Phone>();
		for( int i = 0 ; i < 10 ; i++){
			p = new Phone("Iphone X");
			addPhone1.add(p);
		}
		//第二个线程
		List<Phone> addPhone2 = new ArrayList<Phone>();
		for( int i = 0 ; i < 20 ; i++){
			p = new Phone("Iphone X");
			addPhone2.add(p);
		}
		//第三个线程
		List<Phone> addPhone3 = new ArrayList<Phone>();
		for( int i = 0 ; i < 30 ; i++){
			p = new Phone("Iphone X");
			addPhone3.add(p);
		}
		new Thread(new Provider(rep, addPhone1),"Nico1").start();
		new Thread(new Provider(rep, addPhone2),"Nico2").start();
		new Thread(new Provider(rep, addPhone3),"Nico3").start();

		
	}
}
