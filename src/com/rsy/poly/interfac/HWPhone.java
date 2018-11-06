package com.rsy.poly.interfac;
/**
*@author Nico
*2018年7月17日上午9:55:14
*/
//一个Java类就可以实现多个接口
public class HWPhone extends Phone implements Arm,GameBox,Camera {

	public HWPhone() {
		this("华为", "宝石蓝", 3799.00, 5.5D);
	}
	
	public HWPhone(String brand, String color, double price, double size) {
		super(brand, color, price, size);
	}
	
	//abstract类的子类必须重复重写父类的方法
	@Override
	public void photo() {
		System.out.println(this.getBrand() + "  " + this.getColor()+ " 价值： " +
						this.getPrice() + " 尺寸： " + this.getSize() + "拍照");
	}

	@Override
	public void playGame() {
		System.out.println(this.getBrand() + "  " + this.getColor()+ " 价值： " +
						this.getPrice() + " 尺寸： " + this.getSize() + "玩游戏");
	}

	@Override
	public void attack() {
		System.out.println(this.getBrand() + "  " + this.getColor()+ " 价值： " +
						this.getPrice() + " 尺寸： " + this.getSize() + "行凶");
	}

	@Override
	public void call(long phoneNumber) {
		System.out.println(this.getBrand() + "  " + this.getColor()+ " 价值： " +
						this.getPrice() + " 尺寸： " + this.getSize() + " 打电话给" + phoneNumber);
	}

	@Override
	public void senndMessage(long phoneNumber, String message) {
		System.out.println(this.getBrand() + "  " + this.getColor()+ " 价值： " +
						this.getPrice() + " 尺寸： " + this.getSize() + "给:" + phoneNumber +
						"发短信:" + message);
	}

}
