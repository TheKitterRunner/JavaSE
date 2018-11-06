package com.rsy.poly.phone;

public class Phone {
	private String brand; //品牌
	private double size;  //尺寸
	private String color; //颜色
	private double price;  //价格
	
	public Phone() {
	}
	public Phone(String brand, double size, String color, double price ) {
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	/**
	 * 打电话
	 * @param phone Number
	 */
	public void call(long phoneNumber) {
		System.out.println("打电话："+phoneNumber);
	}
	/**
	 * 发消息
	 * @param phoneNumber
	 * @param message
	 */
	public void sendMessage(long phoneNumber,String message) {
		System.out.println("发消息给：" + phoneNumber + "内容：\n\t" + message);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getColorr() {
		return color;
	}
	public void setColorr(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
