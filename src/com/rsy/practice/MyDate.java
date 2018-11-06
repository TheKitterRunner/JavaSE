package com.rsy.practice;
/**
 *   年月日分别相差不大于5,就认为相等
 * @author Nico
 * @createDate 2018年8月7日 下午2:31:25
 */
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(){
		
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}else if (obj instanceof MyDate) {
			MyDate o = (MyDate) obj;
			return (this.getYear() - o.getYear() >= -5 && o.getDay() - this.getYear() <= 5) && 
					(this.getMonth() - o.getMonth() >= -5 && o.getMonth() - this.getMonth() <= 5) && 
					(this.getDay() - o.getDay() >= -5 && o.getDay() - this.getDay() <= 5);
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyDate m1 = new MyDate(2018,8,6);
		MyDate m2 = new MyDate(2013,5,1);
		System.out.println(m1.equals(m2));
	}
	
}
