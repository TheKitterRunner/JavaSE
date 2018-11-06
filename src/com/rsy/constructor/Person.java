package com.rsy.constructor;

public class Person {
	private String name;
	private int age;
	private String school;
	private String major;
	
	public static void main(String []args) {
		Person p1 = new Person("Nico",25);
		Person p2 = new Person("Nico",25,"XAUT");
		Person p3 = new Person("Nico",25,"XAUT","Packaging Engineeing");

	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("年龄："+age+"  姓名："+name);
	}
	
	public Person(String name,int age,String school) {
		this.name = name;
		this.age = age;
		this.school = school;
		System.out.println("年龄："+age+"  姓名："+name+"  毕业于："+school);
	}
	public Person(String name,int age,String school,String major) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.major = major;
		System.out.println("年龄："+age+"  姓名："+name+"  毕业于："+school+"  "+major+"专业");
	}
	
	public void setName(String n) {
		 name = n; 
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		 age = a; 
	}
	public int getAge() {
		return age;
	}
	public void setSchool(String s) {
		 school = s; 
	}
	public String getSchool() {
		return school;
	}
	public void setMajor(String m) {
		 major = m; 
	}
	public String getMajor() {
		return major;
	}
}
