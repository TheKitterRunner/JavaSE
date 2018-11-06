package com.rsy.homework.OOP;
/**
 * 定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。该类包括：
	private成员变量monthlySalary；
          实现父类的抽象方法earnings(),该方法返回monthlySalary值；toString()方法输出员工类型信息及员工的name，number,birthday。
 * @author Nico
 * @createDate 2018年8月9日 下午12:27:53
 */
public class SalariedEmployee extends Employee{
	
	private double monthlySalary;
	
	public SalariedEmployee(String name, int number ,  MyDate myDate) {
		super(name, number, myDate);
	}
	
	@Override
	public double earning() {
		return monthlySalary;
	}
	
	public String toString(){
		return "职员(月薪制) [ name: " + this.getName() + ", number: " + this.getNumber() + 
				", birthday: " + this.getMyDate().getYear() + "年," + 
				this.getMyDate().getMonth() + "月," + this.getMyDate().getDay()+"日 ]" ;
	}

}
