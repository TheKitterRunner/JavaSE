package com.rsy.IO.practice.modifyTable;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private  String name;
	private  int id;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
}
