package com.rsy.Except;

import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		Person p = new Person();
		try {
			p.eat(s);
		} catch (FoodException e) {
			if (e.getFoodExceptionType() == FoodException.TYPE_METAL){
				System.out.println("如果吃的是金属，那么就进行该异常的逻辑业务处理");
			}else if(e.getFoodExceptionType() == FoodException.TYPE_SOIL){
				System.out.println("如果吃的是土，那么就进行该异常的逻辑业务处理");
			}else if(e.getFoodExceptionType() == FoodException.TYPE_BATH){
				System.out.println("如果吃的是洗浴用品，那么就进行该异常的逻辑业务处理");
			}else if(e.getFoodExceptionType() == FoodException.TYPE_ELECT){
				System.out.println("如果吃的是电子产品，那么就进行该异常的逻辑业务处理");
			}
		}
		scanner.close();
		System.out.println("the main is over !");
	}
}
