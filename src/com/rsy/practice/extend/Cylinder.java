package com.rsy.practice.extend;
/**
 * 继承radius属性,重写findArea 方法
 * 
 * @author Nico
 * @createDate 2018年8月2日 下午7:53:22
 */
public class Cylinder extends Circle{
	//私有变量
	private double length;
	//默认高
	public Cylinder(){
		this.length = 1;
	} 
	//构造器
	public Cylinder(double radius,double length){
		this.setRadius(radius);
		this.length = length;
	}
	
	//计算体积的方法,调用重写的findArea方法来计算
	public double findVolume(double radius ,double length){
		double volume = super.findArea(radius) * length;
		return volume;
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
