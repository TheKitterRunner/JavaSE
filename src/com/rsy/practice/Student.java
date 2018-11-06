package com.rsy.practice;
/**
 * 
 * 属性：姓名  年龄  参加的课程  兴趣
       方法：显示学生的个人信息
 * @author Nico
 * @createDate 2018年7月31日 下午9:39:58
 */
public class Student {
	private String name;
	private int age;
	private String course;
	private String hobit;
	
	public Student(String name, int age, String course, String hobit){
		this.name = name;
		this.age = age; 
		this.course = course;
		this.hobit = hobit;
	}
	
	public void introduce (){
		System.out.println( "Student--> [ name: " + this.name + " , age : " + this.age + 
				" , course : " + this.course + ", hobit : " + this.hobit + " ]");
	}
//	public String introduce (){
//		return "Student--> [ name: " + this.name + " age : " + this.age + 
//				" course : " + this.course + " hobit : " + this.hobit + " ]";
//	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getCourse() {
//		return course;
//	}
//
//	public void setCourse(String course) {
//		this.course = course;
//	}
//
//	public String getHobit() {
//		return hobit;
//	}
//
//	public void setHobit(String hobit) {
//		this.hobit = hobit;
//	}
	
}
