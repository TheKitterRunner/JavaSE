package com.rsy.practice.createlog.Entity;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String job;
	private Date hiredate;
	private double salary;
	private double bonus;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String job,Date hiredate, double salary, double bonus) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.hiredate = hiredate;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", hiredate=" + hiredate + ", salary="
				+ salary + ", bonus=" + bonus + "]";
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
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
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
