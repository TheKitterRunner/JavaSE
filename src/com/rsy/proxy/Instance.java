package com.rsy.proxy;
/**
 * 普通的对象，实现了InterFace1和InterFace2 的方法
 * @author Nico
 * @createDate 2018年7月31日 上午11:33:15
 */
public class Instance implements InterFace1, InterFace2 {
	
	@Override
	public String findHouse() {
		System.out.println("找到合适的房子");
		return "已经找到合适的房子";
	}
	
	@Override
	public String findOwner() {
		System.out.println("找到房子的房东");
		return "已经找到房东";
	}

}
