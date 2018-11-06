package com.rsy.poly.factory;

public class Phone {
	private String brand;
	private String model;
	private String color;
	private int price;
	private double size; 
	
	public Phone() {
	}
	
	public Phone(String brand, String model, String color, int price, double size) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	/**
	 * 打电话
	 * @program phoneNumber
	 */
	public void call(long phoneNumber) {
		System.out.println("使用" + this.brand + this.model + this.color + 
											"价值：" + this.price + "尺寸为：" +  this.size +
											"打电话给：" + phoneNumber);
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
}
