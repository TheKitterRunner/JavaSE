package com.rsy.homework.IO.poihomework;

import java.util.Date;

public class Person {
	private long id; 
	private String name;
	private int age;
	private Date birthday;
	private String gender;
	private String address;
	private long mobile;
	private String job;
	private double salary;
	private boolean isMarried;
	private String contact;
	private String major;
	
	
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + ", gender=" + gender
				+ ", address=" + address + ", mobile=" + mobile + ", job=" + job + ", salary=" + salary + ", isMarried="
				+ isMarried + ", contact=" + contact + ", major=" + major + "]";
	}


	public Person(long id, String name, int age, Date birthday, String gender, String address, long mobile, String job,
			double salary, boolean isMarried, String contact, String major) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
		this.mobile = mobile;
		this.job = job;
		this.salary = salary;
		this.isMarried = isMarried;
		this.contact = contact;
		this.major = major;
	}





	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
