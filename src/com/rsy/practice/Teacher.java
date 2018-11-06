package com.rsy.practice;
/**
 * 属性：姓名 专业 教授的课程 教龄
 * 方法：显示教师的个人信息
 * @author Nico
 * @createDate 2018年7月31日 下午10:16:19
 */
public class Teacher {
	private String name;
	private String profession;
	private String course;
	private int workingYears;
	
	public Teacher(String name, String profession, String course, int workingYears){
		this.name = name;
		this.profession = profession;
		this.course = course;
		this.workingYears = workingYears;
	}
	
	public void introduce(){
		System.out.println( "Teacher--> [ name: " + this.name + " , profession : " + this.profession + 
				" , course : " + this.course + ", workingYears : " + this.workingYears + " ]");
	}
}
