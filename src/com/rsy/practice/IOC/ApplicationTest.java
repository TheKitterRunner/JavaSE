package com.rsy.practice.IOC;

import com.rsy.practice.IOC.Control.CarControl;

public class ApplicationTest {
	public static void main(String[] args) throws Exception {
		
		Application app = new Application();
		app.initBeans();
		
		CarControl cc = (CarControl) app.getBeans("carControl");
		cc.receiveRequest("宝马");
	}
}
