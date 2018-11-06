package com.rsy.IO.decorator;

public class Test {
	public static void main(String[] args) {
		//有点类似于FileInputSteram fi = new FileInputSteram(file) 
		CarFactory c1 = new CarFactoryImple();
		//有点类似于BufferedInputStream bi = new BufferedInputStream(fi)
		CarFactoryDecoratorA c2 = new CarFactoryDecoratorA(c1);  // c2是装饰后功能更强大的
		c2.refit();
		//有点类似于ObjectInputStream oi = new ObjectInputStream(bi)
		System.out.println("===================================");
		CarFactoryDecoratorB c3 = new CarFactoryDecoratorB(c1);  // c3是装饰后功能更强大的
		c3.refit();
//	
	}
}
