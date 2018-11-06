package com.rsy.poly;

public class Apple extends Fruits {
	private String origin; //产地	

	public Apple () {
		this.setName("苹果");
	}
	
	
	public void eat() {
		System.out.println("削皮后吃苹果");
	}
	public void notClear() {
		System.out.println("....");
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String toString() {
		return "apple[name:" + this.getName() +
				     ",color：" + this.getColor() + 
				     ",size：" + this.getSize() + 
				     ",shape：" + this.getShape()+
				     ",taste：" + this.getTaste()+
				     ",origin：" + this.getOrigin()+"]";		
	} 
}
