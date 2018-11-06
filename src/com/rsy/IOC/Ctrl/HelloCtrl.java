package com.rsy.IOC.Ctrl;

import com.rsy.IOC.Service.HelloService;
import com.rsy.IOC.annotation.AutoWired;
import com.rsy.IOC.annotation.Componet;

/**
 *  控制层
 *  	专门用于接收请求
*@author Nico
*2018年7月28日上午11:19:50
*/
@Componet("helloCtrl")
public class HelloCtrl {
	@AutoWired("helloService")
	private HelloService helloService;
	
	/**
	 * 接受请求
	 */
	public void receiveRequest(String food){
		System.out.println("收到点菜请求：" + food);
		helloService.recieveRequest(food);
	}
}
