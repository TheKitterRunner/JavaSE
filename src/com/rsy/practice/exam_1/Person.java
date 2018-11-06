package com.rsy.practice.exam_1;

public class Person {
	private String name;
	private long num;
	
	
	public Person(String name, long num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}else if (obj instanceof Person) {
			return ((Person) obj).getName().equals(this.getName()) && ((Person) obj).getNum() == this.getNum(); 
		}
		return false;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", num=" + num + "]";
	}
	
	
}
