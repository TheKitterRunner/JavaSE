package com.rsy.homework.OOP;
/**
 *  雇员的类
 *  private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
	abstract方法earnings()；toString()方法输出对象的name,number和birthday。
 * @author Nico
 * @createDate 2018年8月9日 上午11:53:58
 */
public abstract class Employee {
	private String name;
	private int number;
	private MyDate myDate;
	
	
	public Employee(String name, int number, MyDate myDate) {
		this.name = name;
		this.number = number;
		this.myDate = myDate;
	}
	
	public abstract double earning();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public MyDate getMyDate() {
		return myDate;
	}
	public void setMyDate(MyDate myDate) {
		this.myDate = myDate;
	}
	
	public String toString(){
		return "Employee--> [ name: " + this.name + ", number: " + this.number + 
				", birthday: " + this.myDate.getYear() + "年," + this.myDate.getMonth() + "月,"+ 
				this.myDate.getDay()+"日 ]";
	}
	
}
