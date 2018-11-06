package com.rsy.enums;

public enum SeasonEnum {
	SPRING("春天","穿暖花开"),
	SUMMER("夏天","夏日炎炎"),
	AUTUMN("秋天","硕果累累"), 
	WINTER("冬天","白雪皑皑");
	
	private String name;
	private String desc;
	
	private SeasonEnum(String name,String desc){
		this.name = name;
		this.desc = desc;
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
