package com.rsy.generic;

public class Tset2 {
	public static void main(String []args) {
//		Person<String,String,String> p1 = new Person<String,String,String>();
//		
//		p1.setDecorateA("装饰AA");
//		p1.setDecorateB("装饰BB");
//		p1.setDecorateC("装饰CC");
//		
//		System.out.println(p1);
//		
//		Person<Integer,Integer,Integer> p2 = new Person<Integer , Integer , Integer>() ;
//		p2.setDecorateA(109);
//		p2.setDecorateB(49878);
//		p2.setDecorateC(87648);
//		
//		System.out.println(p2);

//		Person<String,String,String> p1 = new Person<String,String,String>("装饰aa","装饰bb","装饰nnn");
//		System.out.println(p1);
//		
//		Person<Integer,Integer,Integer> p2 = new Person<Integer , Integer , Integer>(23,4556,777) ;
//		System.out.println(p2);
		
		Person<Car,Watch,Coat> p3 = new Person<Car,Watch,Coat>(new Car("BMW" , "X7" , 800000) ,
									new Watch("Casio" , "CAE100" , 800 ) , new Coat("SuperDry","Outlet",1100));
		
		System.out.println(p3);
	}
	
}
