package com.rsy.practice.LOL;
/**
 *  英雄的技能
 * @author Nico
 * @createDate 2018年8月3日 下午12:49:03
 */
public class Skill {
	//定义技能属性
	private String name;
	
	private int ariseOffensivePower;
	
	private int ariseBloodVolue;

	public Skill(String name, int ariseOffensivePower) {
		this.name = name;
		this.ariseOffensivePower = ariseOffensivePower;
	}
	
	public Skill(String name, int ariseOffensivePower, int ariseBloodVolue) {
		this.name = name;
		this.ariseOffensivePower = ariseOffensivePower;
		this.ariseBloodVolue = ariseBloodVolue;
	}
	public int getAriseBloodVolue() {
		return ariseBloodVolue;
	}

	public void setAriseBloodVolue(int ariseBloodVolue) {
		this.ariseBloodVolue = ariseBloodVolue;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAriseOffensivePower() {
		return ariseOffensivePower;
	}

	public void setAriseOffensivePower(int ariseOffensivePower) {
		this.ariseOffensivePower = ariseOffensivePower;
	}

	
	
	
}
