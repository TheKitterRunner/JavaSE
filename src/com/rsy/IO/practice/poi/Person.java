package com.rsy.IO.practice.poi;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private String job;
	private Date hireDate;
	private double salary;
	private double bonus;
	
	
	public Person() {
		super();
	}
	public Person(int id, String name, String job, Date hireDate, double salary, double bonus) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.hireDate = hireDate;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + "  , name=" + name + "  , job=" + job + "  , hireDate=" + hireDate + "  , salary=" + salary
				+ "  , bonus=" + bonus + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	} 
	
	
}
