package com.rsy.practice.encapsulation;

public class Person {
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String name(){
		return name;
	}	
	
	public void setAge(int age){
		if( age > 130 || age < 0){
			System.out.println("输入年龄非法！！");
		}else  {
			this.age = age;
		}
	
	}
	
	public int getAge(String visitor){
		if( name.equals(visitor)){
			return age;
		}
			return  0;
	}
}
