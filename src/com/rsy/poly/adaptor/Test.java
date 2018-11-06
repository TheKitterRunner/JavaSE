package com.rsy.poly.adaptor;
/**
*适配器1
*@author Nico
*2018年7月16日下午12:12:08
*/
public class Test {
	public static void main(String []args) {
		//创建一个变压器；
		Voltage vt = new ChargeVoltage();
		//准备使用变压器进行充电；
		@SuppressWarnings("unused")
		int voltage = vt.charge();
	}
}
