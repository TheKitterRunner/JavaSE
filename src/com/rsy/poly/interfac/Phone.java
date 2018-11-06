package com.rsy.poly.interfac;

public abstract class Phone {
	
	private String brand;
	private String color;
	private double price;
	private double size;
	
	public Phone() {
	}
	
	public Phone(String brand, String color, double price, double size) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	public abstract void call(long phoneNumber);
	
	public abstract void senndMessage(long phoneNumber,String message);
		
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}

	
}
