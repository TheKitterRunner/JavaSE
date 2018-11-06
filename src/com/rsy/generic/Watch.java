package com.rsy.generic;

public class Watch extends Decorate{
	private String brand;
	private String type;
	private int price;
	
	public Watch(){
		
	}

	public Watch(String brand , String type , int price) {
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString(){
		return "Watch-->[brand :" + this.brand + ", type:" + this.type + ", price:" + this.price + "]";
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
