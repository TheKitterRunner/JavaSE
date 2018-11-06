package com.rsy.entend;

public class Circle {
	private static final double PI = 3.141592653589793;
	private double radius ;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double R) {
		radius = R;
	}

	public static double findArea(double radius) {
			double area = PI *radius*radius;
			System.out.println("半径为："+radius+"的圆的面积为："+area);
			return area ;
	}
	public static void main(String []args) {
		Circle circle = new Circle(4);
		circle.findArea(4);
	}
}