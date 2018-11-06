package com.rsy.homework.OOP;

import java.util.Scanner;

/**
 * 工资表类
 * 		定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 		利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 		当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @author Nico
 * @createDate 2018年8月9日 下午12:50:43
 */
public class PayrollSystem {
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
//		employees[0] = new Employee("Nico1",4050,new MyDate(1993, 01, 29));
		employees[0] = new SalariedEmployee("Nico1",4051, new MyDate(2000, 1, 29));
		employees[1] = new HourslyEmployee("Nico2",4052, new MyDate(1999, 3, 5));
		employees[2] = new SalariedEmployee("Nico3",4053, new MyDate(1998, 4, 9));
		employees[3] = new HourslyEmployee("Nico4",4054, new MyDate(1997, 9, 18));
		employees[4] = new SalariedEmployee("Nico5",4055, new MyDate(1996, 12, 23));
		
		//遍历数组，输出员工的基本信息
		for( int i = 0; i < employees.length; i ++){
				System.out.println(employees[i]);
		}
		
		//从键盘输入当前月份
		Scanner scan= new Scanner(System.in);
		int currentMonth = scan.nextInt();
		
		for( int i = 0; i < employees.length; i ++){
			if ( employees[i].getMyDate().getMonth() == currentMonth){
				System.out.println(employees[i] + " 实际薪水为：" + (employees[i].earning() + 100));
			}else{
				System.out.println(employees[i] + " 实际薪水为：" + employees[i].earning() );
			}
		}
		
	}
}
