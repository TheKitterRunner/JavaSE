package com.rsy.IO.decorator;
/**
 *  汽车工厂装饰类
 *  作用：用于被继承，继承这个类的子类，分别按照不同的定义去装饰功能
*@author Nico
*2018年7月24日上午10:37:09
*/
public abstract class CarFactoryDecorator extends CarFactory{
	
	// 装饰模式，在装饰类里面，持有原来对象的本身！
	private CarFactory carFactory;
	
	public CarFactoryDecorator(CarFactory carFactory){
		this.carFactory = carFactory;
	}
	@Override
	public void refit() {
		this.carFactory.refit();
	}
	
}
