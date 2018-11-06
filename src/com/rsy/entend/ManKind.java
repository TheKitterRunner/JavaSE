package com.rsy.entend;

public class ManKind {
	public int sex;
	public int salary;
	
	public void manOrWoman() {
		if (sex == 1) {
			System.out.println("man");
		}else if (sex ==0) {
			System.out.println("woman");
		}
	}
	public void employeed() {
		if (salary == 0) {
			System.out.println("no job");
		}else if (salary != 0) {
			System.out.println("get job");
		}
	}
	public void eat() {
		System.out.println("吃水果");
	}
}
