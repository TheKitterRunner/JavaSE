package com.rsy.reflect;

@AnnotationB(name = "燥起来")
@AnnotationA
public class Person {
	@AnnotationA("feild-name")
	private String name;
	private int age;
	private int sex;
	
	public Person(){
		
	}
	
	public Person(String name , int age , int sex){
		this.name = name;
		this.age = age;
		this.sex= sex;
	}

	@SuppressWarnings("unused")
	private void sleep(){
		System.out.println("睡觉");
	}
	@AnnotationA("Method-eat")
	public void eat(int time ,String food ){
		System.out.println(time + " 点吃:" + food);
	}
	
	public void play(){
		System.out.println("玩游戏!");
	}
	
	@Override
	public String toString(){
		return "Person-->[ name: " + this.name + ", age: " + this.age + ", sex: " +
					(this.sex == 1 ? "男" : "女") + "]";
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
}
