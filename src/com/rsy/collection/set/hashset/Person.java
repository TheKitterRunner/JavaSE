package com.rsy.collection.set.hashset;

public class Person {
	
	private String name;
	private int age;
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
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			return obj instanceof Person && ((Person) obj).getName().equals(this.getName()) 
					&& ((Person)obj).getAge() == this.getAge();
		}
	}
	
	public int hashCode () {
		return this.getName().hashCode() + this.getAge();
	}
	
}
