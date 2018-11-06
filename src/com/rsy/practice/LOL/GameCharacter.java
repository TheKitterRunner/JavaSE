package com.rsy.practice.LOL;

public class GameCharacter {
	
	private String name;
	
	private String realName;
	
	private double bloodVolume;
	
	private double offensivePower;
	
	private Skill[] skill = new Skill[6];
	
	private Equipment[] equipments = new Equipment[6];
	
	private int coin = 500;
	
	public GameCharacter(){
		
	}
	public GameCharacter(String name, String realName) {
		this.name = name;
		this.realName = realName;
	}

	public GameCharacter(String name, String realName, double offensivePower,double bloodVolume,  Skill[] skill) {
		this.name = name;
		this.realName = realName;
		this.bloodVolume = bloodVolume;
		this.offensivePower = offensivePower;
		this.skill = skill;
	}
	
	public Skill[] getSkill() {
		return skill;
	}
	public void setSkill(Skill[] skill) {
		this.skill = skill;
	}
	public Equipment[] getEquipments() {
		return equipments;
	}
	public void setEquipments(Equipment[] equipments) {
		this.equipments = equipments;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public double getBloodVolume() {
		return bloodVolume;
	}

	public void setBloodVolume(double bloodVolume) {
		this.bloodVolume = bloodVolume;
	}

	public double getOffensivePower() {
		return offensivePower;
	}

	public void setOffensivePower(double offensivePower) {
		this.offensivePower = offensivePower;
	}
	/**
	 * 买装备的逻辑
	 * @param equipment
	 */
	@SuppressWarnings("unused")
	public void buy(Equipment equipment){
		for (int i = 0; i < this.equipments.length; i++) {
			if (this.coin > equipment.getPrice()) {
				this.coin -= equipment.getPrice();
				this.equipments[i] = equipment;  //表示购买成功
				this.bloodVolume += equipment.getAriseBloodVolue();
				this.offensivePower += equipment.getAriseOffensivePower();
			}
			break;
		}
	}
	//嘲笑的方法
	public void laughAt(GameCharacter gc,String words){
		System.out.print(this.getRealName() + "对" + gc.getRealName() + "说:" + words);
		System.out.println();
	}
	/**
	 *  攻击的方法,调用可以实施攻击
	 * @param gc
	 */
	public void offensive(GameCharacter gc){
		for( int i = 0 ; i < equipments.length ; i ++){
			if (gc.equipments[i] != null && gc.equipments[i].getEquipmentName().equals("多兰盾")) {
				gc.bloodVolume -= (this.getOffensivePower() - 8);
				break;
			}
			if ( i == gc.equipments.length - 1) {
				gc.bloodVolume -= this.getOffensivePower(); 
			}
		}
	}
	public double useSkillQ(String name, int ariseOffensivePower){
		for( int i = 0; i < skill.length; i ++ ){
			if (this.skill[i] != null && this.skill[i].getName().equals("Q")) {
				this.offensivePower += skill[i].getAriseOffensivePower(); 
			} 
		}
		double afterOffensivePower = offensivePower;
		return afterOffensivePower;
	}
	
}
