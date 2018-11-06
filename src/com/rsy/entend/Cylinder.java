package com.rsy.entend;

public class Cylinder {
	private double length ;
	public static void main(String []args) {
		Cylinder cylinder = new Cylinder(4);
		double volume = cylinder.findVolume(4);
		System.out.println("底面半径为4，高度为4 的圆柱体的体积为："+volume);
	}
	
	public Cylinder(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double R) {
		length = R;
	}
	
	public double findVolume(double length) {
		double area = Circle.findArea(4);
		return area*length ;
	}
	
}
