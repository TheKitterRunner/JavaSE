package com.rsy.homework.OOP;
/**
 * 参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。该类包括：
	private成员变量wage和hour；
	实现父类的抽象方法earnings(),该方法返回wage*hour值；toString()方法输出员工类型信息及员工的name，number,birthday。
 * @author Nico
 * @createDate 2018年8月9日 下午12:45:57
 */
public class HourslyEmployee extends Employee{

	private double wage;  // 薪水
	private double hour;  // 工作的时间
	
	
	public HourslyEmployee(String name, int number, MyDate myDate) {
		super(name, number, myDate);
	}
	
	@Override
	public double earning() {
		double totalSalary = wage * hour;
		return totalSalary;
	}
	
	public String toString(){
		return "职员(日薪制) [ name: " + this.getName() + ", number: " + this.getNumber() + 
				", birthday: " + this.getMyDate().getYear() + "年," + 
				this.getMyDate().getMonth() + "月," + this.getMyDate().getDay()+"日 ]" ;
	}

}
