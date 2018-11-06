package com.rsy.homework.collection.Exam_3;
/**
	姓名          年龄    工资
	zhang3 18  3000 
	li4    25  3500 
	wang5  22  3200 
	(1) 为 Worker 类重写 equals 方法，当姓名、年龄、工资全部相等时候才返回 true
 * @author Nico
 * @createDate 2018年8月11日 上午11:41:46
 */
public class Worker {
	private String name;
	private int age;
	private double salary;
	
	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			return obj instanceof Worker && ((Worker) obj).getName().equals(this.getName()) 
					&& ((Worker)obj).getAge() == this.getAge() 
					&& ((Worker)obj).getSalary() == this.getSalary();
		}
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public boolean work(){
		return this.getSalary() == 0;
	}
}
