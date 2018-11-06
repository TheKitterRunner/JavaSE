package com.rsy.IO.decorator;
/**
*	一个普通的汽车工厂
*@author Nico
*2018年7月24日上午10:27:21
*/
public class CarFactoryImple extends CarFactory {

	@Override
	public void refit() {
		System.out.println("改装内容：修理、喷漆...");
	}
	
}
