package com.rsy.IO.decorator;

public class CarFactoryDecoratorB extends CarFactoryDecorator  {
	
	public CarFactoryDecoratorB(CarFactory carFactory) {
		super(carFactory);
	}
	
	@Override
	public void refit() {
		System.out.println("洗车，加机油...");
		super.refit();
		System.out.println("给雨刮器加满水...");
	}

}
