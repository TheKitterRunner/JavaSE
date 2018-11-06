package com.rsy.poly.factory;

public class MIPhone extends Phone {
	
	public MIPhone() {	
		//如果没有制定小米的型号，默认使用MIX2
		this("小米" , "MIX 2" , "陶瓷黑" , 4399 , 5.99D);
	}
	
	public MIPhone(String brand, String model, String color, int price, double size ) {
		super(brand , model  , color , price , size);
	}
	
	@Override
	public void call (long phoneNumber) {
		System.out.print("米粉使用...." );
		super.call (phoneNumber);
	}
}
