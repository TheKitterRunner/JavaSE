package com.rsy.poly.factory;

public class HWPhone extends Phone {
	
	public HWPhone() {	
		this("华为" , "P10" , "亮黑色" , 5999 , 5.8D);
	}
	
	public HWPhone(String brand, String model, String color, int price, double size ) {
		super(brand,model,color,price,size);
	}
	
	@Override
	public void call(long phoneNumber) {
		System.out.print("爱国人士使用...." );
		super.call(phoneNumber);
	}
}
