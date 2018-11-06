 package com.rsy.poly.phone;

public class ApplePhone extends Phone {
	
	private String model;
	
	public ApplePhone() {
		this("Apple" , 5.8D ,  "灰色" , 8388D , "iphone X");
	}
	public ApplePhone(String brand, double size, String color, double price,String model) {
		super(brand,size,color,price);
		this.model = model;
	}
	
	@Override
	public void call(long phoneNumber) {
		System.out.println("使用最新款的" + this.getBrand() + this.model + "手机打电话给："+phoneNumber);
	}
	
	@Override
	public void sendMessage(long phoneNumber,String message) {
		System.out.println("使用最新款的" + this.getBrand() +  this.model + "手机发消息给：" + phoneNumber + "内容：\n\t" + message);
	}

}
