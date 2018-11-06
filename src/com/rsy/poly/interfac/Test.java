package com.rsy.poly.interfac;

public class Test {
	public static void main(String []args) {
		//  父类的实例应用子类对象,初始化的是子类的无参构造器
//		Phone phone = new HWPhone();
		Phone phone = new HWPhone("华为", "宝石蓝", 3999.00, 5.5D);
		
		phone.call(12333333l);
		phone.senndMessage(11555133l, "咱们老百姓,今儿个真高兴啊!!!");  //多态的使用.调用的是运行时类型对应的方法
		
		//Phone只能调用Phone这个类型里定义的方法，如果要调用HWPhone的方法，必须向下转型
		
		HWPhone hwPhone = (HWPhone) phone;
		hwPhone.playGame();
		Arm arm = (Arm) phone;
		arm.attack();
		
		GameBox gameBox = (GameBox) phone;
		gameBox.playGame();
		
		Camera camera = (Camera) phone;
		camera.photo();
	}
}
