package com.rsy.enums;

public class Test {
	public static void main(String []args){
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.AUTUMN);
		System.out.println(Season.WINTER);

		System.out.println(SeasonEnum.SPRING.getName() + "--->" + SeasonEnum.SPRING.getDesc());
		System.out.println(SeasonEnum.SUMMER.getName() + "--->" + SeasonEnum.SUMMER.getDesc());
		System.out.println(SeasonEnum.AUTUMN.getName() + "--->" + SeasonEnum.AUTUMN.getDesc());
		System.out.println(SeasonEnum.WINTER.getName() + "--->" + SeasonEnum.WINTER.getDesc());

	}
}
