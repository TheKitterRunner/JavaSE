package com.rsy.practice.LOL;
/**
 *  游戏分组的类
 *  
 * @author Nico
 * @createDate 2018年8月3日 上午11:19:24
 */
public class Team {
	
	private Players[] player = new Players[5];
	private String group ;
	private String position ;
		
	public Team(){
		
	}
	public Team( String group, String position,Players[] player) {
		this.player = player;
		this.group = group;
		this.position = position;
	}

	public Players[] getPlayer() {
		return player;
	}
	public void setPlayer(Players[] player) {
		this.player = player;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
