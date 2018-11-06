package com.rsy.IOC.Ctrl;

import com.rsy.IOC.Service.CarService;
import com.rsy.IOC.annotation.AutoWired;
import com.rsy.IOC.annotation.Componet;

@Componet("carCtrl")
public class CarCtrl {
	@AutoWired("carService")
	private CarService carService;
	
	public void receiveRequest(String car) {
		System.out.println("收到改装的订单 : " + car);
		carService.receiveRequest(car);
	}
	
}
