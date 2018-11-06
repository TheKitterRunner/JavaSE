package com.rsy.poly.factory;
/**
 * 工厂模式
 * @author Nico
 */
public class PhoneFactory {
	/**
	 * 定义手机类型
	 */
	public static final int PHONE_TYPE_HW = 1;
	public static final int PHONE_TYPE_MI = 2;
	
	/** 	
	 * 不然别人随便创建工厂
	 */
	private PhoneFactory(){
	}
	/**
	 * 提供一个静态方法
		 *   目的：静态方法可以直接通过类名调用，不用new PhoneFactory
	 * @param phoneType   创建手机的手机类型
	 * @return
	 */
	public static Phone createPhone(int phoneType) {
		Phone  p = null ;
		//只需要更改手机品牌class来替换new的值即可；
		if (phoneType == PhoneFactory.PHONE_TYPE_HW) {
			p = new HWPhone();
		}else if (phoneType == PhoneFactory.PHONE_TYPE_MI) {
			p = new MIPhone();
		}
		return  p ;
	}
}
