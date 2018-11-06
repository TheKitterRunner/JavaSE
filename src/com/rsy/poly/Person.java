package com.rsy.poly;

import com.rsy.poly.phone.Phone;

public class Person {
	private String name;
	private int age;
	private int sex;
	private Phone phone;
	
	public Person() {
		
	}
	public Person(String name , int age , int sex , Phone phone ) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	public void call(long phoneNumber) {
		phone.call(phoneNumber);
	}
	
	public void sendMessage(long phoneNumber , String message) {
		phone.sendMessage(phoneNumber, message);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
