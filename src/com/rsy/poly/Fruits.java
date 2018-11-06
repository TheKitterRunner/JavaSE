package com.rsy.poly;

public class Fruits {
	private String color; //颜色
	private double size; //大小
	private String shape;//现状
	private String taste; //味道
	private String name; //名字
	
	public void eat() {
		 System.out.println("吃水果");
	 }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
