package com.rsy.practice;

public class Test {
	public static void main(String[] args) {
		//实例化Student类对象，并且给属性赋值
		Student stu = new Student("Nico", 18, "Java", "学习java");
		//实例化Teacher类对象，并且给属性赋值
		Teacher tea = new Teacher("邓老师", "数学", "Java", 6);
		//调用Student类的方法
		stu.introduce();
		//调用Teacher类的方法
		tea.introduce();
	}
}
