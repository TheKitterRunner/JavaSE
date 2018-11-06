package com.rsy.practice.extend;

public class Circle {
	private double radius = 1;
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double setRadius(){
		return radius;
	}
	
	public Circle(){
		this.radius = 1.0;
	}
	
	public double findArea(double radius){
		double area = radius * radius * 3.14;
 		return area;
	}
}
