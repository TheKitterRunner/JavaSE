package com.rsy.practice.extend;
/**
 * Person
#name: String
#sex:char
#age:int
+Person(name:String  sex:char  age:int)
+toString():String
 * @author Nico
 * @createDate 2018年8月2日 下午5:37:18
 */
public class Person {
	private String name;
	private char sex;
	private int age;
	
	public Person (){
		
	}
	public Person(String name, char sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age; 	 	
	}
	
	public String toString() {
		return "name :"  + this.name + ",sex :" + this.sex + ", age:" + this.age 	;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
