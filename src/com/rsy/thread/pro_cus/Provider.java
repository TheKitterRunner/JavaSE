package com.rsy.thread.pro_cus;

import java.util.List;
/**
 * 专门用来进货的
 * @author Nico
 * @createDate 2018年8月2日 下午11:26:41
 */
public class Provider implements Runnable{
	
	private Repertory repertory;
	
	private List<com.rsy.thread.pro_cus.Phone> addPhones;
	
	public Provider(Repertory repertory,List<com.rsy.thread.pro_cus.Phone> addPhones) {
		this.repertory = repertory;
		this.addPhones = addPhones;
	}
	@Override
	public void run() {
		this.repertory.add(this.addPhones);
	}
	
	
}
