package com.rsy.poly.adaptor;

public class ChargeVoltage extends Voltage implements VoltageAdaptor {
	
	@Override
	public int charge() {
		//获取原有电压；
		int voltage = super.charge();
		System.out.println("改变电压准备...");
		
		//改变电压
		voltage = 110 ;
		System.out.println("改变电压完成...");
		System.out.println("充电完成" + voltage);
		return voltage;
	}
}

