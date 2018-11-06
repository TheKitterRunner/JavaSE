package com.rsy.Except;

public class Person {
	//喜欢吃的
	@SuppressWarnings("unused")
	private String[] food = new String[]{"面条","烧饼","包子","饺子"};
	
	//可以选择的：
	private String[] foods = new String[]{"面条","烧饼","包子","饺子",
											"金属","土","洗浴用品","电子产品"};
	//定义一个吃的方法
	@SuppressWarnings("unused")
	public void eat(String food) throws FoodException {
		for (String food2 : foods) {
			if(food.equals("金属")) {
				throw new FoodException(FoodException.TYPE_METAL);
			}else if(food.equals("土")) {
				throw new FoodException(FoodException.TYPE_SOIL);
			}else if(food.equals("洗浴用品")) {
				throw new FoodException(FoodException.TYPE_BATH);
			}else if(food.equals("电子产品")) {
				throw new FoodException(FoodException.TYPE_ELECT);
			}else{
				System.out.println("人在吃：" + food);
				break;
			}
		}
	}
	
}
