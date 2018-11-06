package com.rsy.poly.factory;

public class NewPhone extends Phone{
	
	public NewPhone() {	
		this("新品牌" , "新机型" , "黄色" , 10000 , 9.8D);
	}
	
	public NewPhone(String brand, String model, String color, int price, double size ) {
		super (brand,model,color,price,size);
	}
	
	@Override
	public void call(long phoneNumber) {
		System.out.print("我也不知到这是什么...." );
		super.call(phoneNumber);
	}
}
