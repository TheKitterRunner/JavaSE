package com.rsy.practice.extend;

import java.util.Arrays;

/**
 * number:long
int:math
int:english
int:computer
+Student(n:String s:char a:int k:long m:int e:int c:int)
+aver():double
+max():int
+min():int
+toString():String
 * @author Nico
 * @createDate 2018年8月2日 下午5:40:25
 */
public class Student extends Person{
	private long number;
	private int math;
	private int english;
	private int computer;
	
	public Student(String n, char s, int a, long k, int m ,int e, int c){
		this.setName(n);
		this.setSex(s);
		this.setAge(a);
		this.number = k; 
		this.math = m;
		this.english = e;
		this.computer = c;
	}

	public double aver(){
		return (math + english + computer) /3.0;
	}
	
	public int min(){
		int[] array ={math,english,computer};
		Arrays.sort(array);
		return array[0];
	}
	
	public int max(){
		int[] array ={math,english,computer};
		Arrays.sort(array);
		return array[array.length - 1];
	}
	
	public String toString(){
		return "学生 " + this.getName() + "的平均分是" + this.aver(); 
	}
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}
}
