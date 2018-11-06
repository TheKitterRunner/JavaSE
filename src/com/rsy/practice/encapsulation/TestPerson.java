package com.rsy.practice.encapsulation;

import java.util.Scanner;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(100);
		p.setName("nico");
		System.out.println("请输入姓名：");
		Scanner scanner = new Scanner(System.in);
		String visitor = scanner.nextLine();
		scanner.close();
		int age = p.getAge(visitor);
		System.out.println(age);
	}
}
