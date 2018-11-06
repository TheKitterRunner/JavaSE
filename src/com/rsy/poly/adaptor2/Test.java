package com.rsy.poly.adaptor2;
/**
*适配器2
*@author Nico
*2018年7月16日下午12:11:43
*/
public class Test {
	public static void main(String []args) {
		//创建默认电压
		Voltage voltage = new Voltage();
		//将默认的电压接入转换器；
		VoltageCharge110 vc110= new VoltageCharge110(voltage);
		//将voltage看作电源，vc110是一个适配器，将电源接入适配器中转换
		//使用适配器充电
		vc110.charge();
	}
}
