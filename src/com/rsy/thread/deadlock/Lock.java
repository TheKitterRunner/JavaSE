package com.rsy.thread.deadlock;

public class Lock {

	private String name;

	public Lock(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 @Override
	public String toString() {	
		return "Lock[ name:" + this.name + "]";
	}
}
