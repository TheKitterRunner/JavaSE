package com.rsy.thread.pro_cus;

import java.util.List;

/**
 * 专门用来出货的线程
 * @author Nico
 * @createDate 2018年8月3日 上午8:56:22
 */
public class Customer implements Runnable{

	private Repertory rep;
	private List<Phone> sellPhones;
	
	public Customer(Repertory rep, List<Phone> sellPhones) {
		this.sellPhones = sellPhones;
		this.rep = rep;
	}
	
	@Override
	public void run() {
		this.rep.sell(this.sellPhones);
	}

}
