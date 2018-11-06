package com.rsy.enums;

public class Season {
	public static final Season SPRING = new Season("春天" ,"穿暖花开");
	public static final Season SUMMER = new Season("夏天" ,"夏日炎炎");
	public static final Season AUTUMN = new Season("秋天" ,"硕果累累");
	public static final Season WINTER = new Season("冬天" ,"白雪皑皑");
	
	private String name;
	private String desc;
	
	private Season(String name , String desc){
		this.name = name;
		this.desc = desc;
	}
	
	public String toString(){
		return "Season [name :" + this.name + ", desc: " + this.desc + "]";
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
