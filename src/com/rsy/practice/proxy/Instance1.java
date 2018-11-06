package com.rsy.practice.proxy;
/**
 *  实现了Instance1和Instance2的方法的类
 * @author Nico
 * @createDate 2018年8月7日 下午8:52:43
 */
public class Instance1 implements Interface1,Interface2{

	@Override
	public String findHouse() {
		System.out.println("找到合适的放置");
		return "已经找到合适的房子了";
	}

	@Override
	public String findOwner() {
		System.out.println("找到房子的房东");		
		return "已经找到房子的房东";
	}

}
