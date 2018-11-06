package com.rsy.collection.List.ArrayList;

public class Student {
	private String name;
	private int age;
	
	
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public String toString(){
		return "Student --> [" + this.name + ", age: " + this.age + "]";
	}
	
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}else{
			if (obj instanceof Student) {
				Student student = (Student) obj;
				return this.getName().equals(student) && this.getAge() == student.getAge();
			}
		}
		return false;
	}
	
	public int hashCode(){
		return this.getAge() + this.getName().hashCode();
	}
}
