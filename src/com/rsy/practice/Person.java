package com.rsy.practice;
/**
 * (1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，输出字符串“studying”，
 *                调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
   (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。

 * 
 * @author Nico
 * @createDate 2018年8月1日 下午9:55:25
 */
public class Person {
	private String name;
	private int age;
	private String sex;
	
	public void study(){
		System.out.println( this.name + "喜欢Studying");
	}
	
	public void showAge(){
		System.out.println("Person " + this.name + "的age为： " + this.age);
	}
	
	public String addAge(){
		age += 2;
		return "增加后的年龄age为: " + this.age;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
