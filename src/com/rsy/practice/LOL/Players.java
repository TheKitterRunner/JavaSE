package com.rsy.practice.LOL;
/**
 *  游戏玩家的类
 *  
 * @author Nico
 * @createDate 2018年8月3日 上午11:12:05
 */
public class Players {
	
	private String nickName;
	
	private String IP;
	
	private int level;
	
	private String rank = "青铜IV";
	
	private GameCharacter gameCharacter;

	public Players(){
		
	}
	public Players(String nickName, String iP, int level) {
		this.nickName = nickName;
		IP = iP;
		this.level = level;
	}

	public Players(String nickName, String iP, int level, String rank) {
		this.nickName = nickName;
		IP = iP;
		this.level = level;
		this.rank = rank;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public GameCharacter getGameCharacter() {
		return gameCharacter;
	}

	public void setGameCharacter(GameCharacter gameCharacter) {
		this.gameCharacter = gameCharacter;
	}
	
	public void ban(GameCharacter gameCharacter){
		System.out.println( nickName + " ban掉了 : " + gameCharacter.getName() + "[" +gameCharacter.getRealName() + "]");
	}
	
	public void pick(GameCharacter gameCharacter){
		this.gameCharacter = gameCharacter;
		System.out.println( nickName + " pick了 : " + gameCharacter.getName() + "[" +gameCharacter.getRealName() + "]");
	}
}
