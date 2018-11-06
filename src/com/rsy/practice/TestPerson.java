package com.rsy.practice;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Nico");
		person.setAge(18);
		person.setSex("男");
		person.study();
		person.showAge();
		String  a = person.addAge();
		System.out.println(a);
	}
}
