package com.rsy.poly.factory;

public class MIPhoneBar2 {

	/**
	 * 多态的表现形式，返回值是父类，返回的具体对象是子类型!
	 * @return
	 */
	public Phone sellPhone() {
		return PhoneFactory.createPhone(PhoneFactory.PHONE_TYPE_MI);
	}
}
