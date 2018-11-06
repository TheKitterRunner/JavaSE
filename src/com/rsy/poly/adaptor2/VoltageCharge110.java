package com.rsy.poly.adaptor2;

//正儿八经的电压转换器
public class VoltageCharge110 implements VoltageAdaptor110 {
	//不用继承Voltage，创建一个电压类的成员变量来获取初始的电压
	private Voltage voltage;
	 
	public VoltageCharge110(Voltage voltage) {
		this.voltage = voltage;
	}
	
	@Override
	public int charge() {
		//获取原有电压；
		int vt = voltage.charge();
		System.out.println("准备改变电压...");
		vt = 110 ;
		System.out.println("改变电压完成...");
		System.out.println("110转换器充电电压：" + vt);
		return vt;	
		//
	}
}
