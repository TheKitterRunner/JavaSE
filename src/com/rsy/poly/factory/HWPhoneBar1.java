package com.rsy.poly.factory;

public class HWPhoneBar1 {

	/**
	 * 多态的表现形式，返回值是父类，返回的具体对象是子类型!
	 * @return
	 */
	public Phone sellPhone() {
		//通过工厂类的createPhone来制造手机
		return PhoneFactory.createPhone(PhoneFactory.PHONE_TYPE_HW);
	}
}
