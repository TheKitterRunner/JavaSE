package com.rsy.homework.reflect;
/**
 * 定义Student 类：包含：姓名和年龄等属性，有参和无参构造方法，输出所有信息的方法
	1.使用多种方法生成一个Student类的Class对象
	2.使用Class类获取Student类的结构信息并输出
	3.通过有参(无参)构造方法动态创建Student类的对象
	4.使用反射修改和查询Student类的姓名属性
	5.使用反射动态执行Student类输出信息的方法
 * @author Nico
 * @CreateDate 2018年8月20日 下午6:52:23
 */
public class Student {
	private String name;
	private int age;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
