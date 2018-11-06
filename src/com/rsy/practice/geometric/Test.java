package com.rsy.practice.geometric;


public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		Circle c1 = new Circle("green",2.0,5.0);
		MyRectangle r1 = new MyRectangle("green",2.0,6.0, 9.0);
		
		double s1 = test.equalsObject(c1,r1);
		System.out.println(s1);
		test.displayGeometricObject(r1);
		
		
	}
	/**
	 * 比较两个对象的面积
	 * @param g1
	 * @param g2
	 * @return
	 */
	public  double equalsObject(GeometricObject g1,GeometricObject g2){
		return g1.findArea() - g2.findArea();
	}
	/**
	 * 显示传入的对象的面积
	 */
	public  void displayGeometricObject(GeometricObject geometricObject){
		System.out.println(geometricObject.findArea());
	}
}
