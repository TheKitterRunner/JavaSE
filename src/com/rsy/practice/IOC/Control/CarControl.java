package com.rsy.practice.IOC.Control;

import com.rsy.practice.IOC.Annotation.AutoWired;
import com.rsy.practice.IOC.Annotation.Componet;
import com.rsy.practice.IOC.Service.CarService;
/**
 *  控制层：controller
 *  	用来接收要执行什么样的代码的请求
 * @author Nico
 * @CreateDate 2018年8月22日 下午5:54:21
 */

@Componet("carControl")
public class CarControl{
	
	@AutoWired
	public CarService carService;
	
	public void receiveRequest(String car) {
		System.out.println("收到改装的订单 : " + car);
		System.out.println("==============");
		carService.receiveRequest(car);
		System.out.println("444444444");
	}
}
