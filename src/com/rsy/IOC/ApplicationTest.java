package com.rsy.IOC;

import com.rsy.IOC.Ctrl.CarCtrl;
import com.rsy.IOC.Ctrl.HelloCtrl;

public class ApplicationTest {
//	public static void main(String[] args) {
//		HelloCtrl hc = new HelloCtrl();
//		hc.receiveRequest("鸡肉");
//		
//		HelloCtrl hc2 = new HelloCtrl();
//		hc2.receiveRequest("鸡肉");
//	}

	public static void main(String[] args) throws Exception {
		// 系统启动的时候，创建一个容器对象，用来存储实例化的所有的class对象
		Application app = new Application();
		//初始化容器，让容器将所有加Componet注解的类全部实例化，
		//并且将class里加有AutoWired注解的通过IOC（控制反转）注入实例
		app.initBeans();
		
		//从容器里获得Ctrl
//		HelloCtrl hc = (HelloCtrl) app.getBeans("helloCtrl");
//		//调用点菜的方法
//		hc.receiveRequest("吃鸡");
//		
//		System.out.println("==================");
		CarCtrl cc = (CarCtrl) app.getBeans("carCtrl");
		cc.receiveRequest("保时捷");
	}
}
