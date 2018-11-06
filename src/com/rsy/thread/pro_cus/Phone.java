package com.rsy.thread.pro_cus;

public class Phone {
	
	private String name;

	public Phone(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Phone [name : " + this.name + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
