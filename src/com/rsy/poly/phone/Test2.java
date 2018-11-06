package com.rsy.poly.phone;

import com.rsy.poly.Person;

/**
 * 多态
 *   使用父类型的变量指向不同的子类型的实例，调用重写的方法，实现不一样的功能
 * @author Nico
 * 
 */
public class Test2 {
	public static void main(String []args) {
		Phone p1 = new HWPhone("华为", 5.5D , "亮黑" , 1999D , "P8");
		Phone p2 = new ApplePhone("Apple", 5.5D , "灰色" , 1999D , "Iphone 6plus");
		
		/*p1.call(183929374L);
		p1.sendMessage(183929374L , "时间过的好快啊 ！");
		
		p2.call(183929374L);
		p2.sendMessage(183929374L , "时间过的好快啊 ！");
	}*/
		Person person1 = new Person("Nico" , 18 , 1 , p1);
		Person person2 = new Person("Kry", 18 , 0 ,p2);
		
		
		p1.call(123456789L);
		p2.call(123456789L);
	}
}