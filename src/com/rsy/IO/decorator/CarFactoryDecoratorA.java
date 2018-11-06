package com.rsy.IO.decorator;

public class CarFactoryDecoratorA extends CarFactoryDecorator {

	public CarFactoryDecoratorA(CarFactory carFactory) {
		super(carFactory);
	}
	
	@Override
	public void refit() {
		System.out.println("购买改装车的零件...");
		super.refit();
		System.out.println("改装发动机...");
	}

}
